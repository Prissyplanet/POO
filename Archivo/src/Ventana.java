import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import  java.io.FileNotFoundException;
import java.io.*;

public class Ventana {
    private TextArea textArea;
    private Stage stage;
    private ListView lv1;
    String[] renglones;
    public Ventana(Stage stage){this.stage=stage;}
    public AnchorPane crearVentana(){
        AnchorPane pane= new AnchorPane();
        pane.setPrefSize(900,600);
        Menu menu=new Menu("Archivo");
        MenuItem open=new MenuItem("Abrir");
        MenuItem save=new MenuItem("guardar");
        MenuItem exit=new MenuItem("Salir");
        menu.getItems().addAll(open,save,exit);
        MenuBar menuBar=new MenuBar();
        menuBar.setPrefSize(900,25); menuBar.setLayoutX(0); menuBar.setLayoutY(0);
        menuBar.getMenus().addAll(menu);
        open.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FileChooser chooser=new FileChooser();
                chooser.setTitle("Elegir el archivo");
                File file= chooser.showOpenDialog(stage);
                if (file!=null){
                    leerArchivo(file.getAbsolutePath());
                    System.out.println(file.getTotalSpace());
                }
            }
        });
        textArea=new TextArea();
        textArea.setPrefSize(200,200);
        textArea.setLayoutX(10); textArea.setLayoutY(50);

        lv1=new ListView(); lv1.setPrefSize(230,400); lv1.setLayoutX(10); lv1.setLayoutY(90);
        TextField textField=new TextField(); textField.setPrefSize(150, 20); textField.setLayoutX(10); textField.setLayoutY(50); textField.setPromptText("Elemento a buscar");
        Button btnBuscar=new Button("Buscar"); btnBuscar.setPrefSize(80,20); btnBuscar.setLayoutX(165); btnBuscar.setLayoutY(50);
        btnBuscar.setStyle("-fx-background-color:green; -fx-background-radius:5em;-fx-text-fill:white");

        Label simboloElemento=new Label("H"); simboloElemento.setFont(new Font("Arial",150)); simboloElemento.setStyle("-fx-text-fill:#111");
        simboloElemento.setLayoutX(450); simboloElemento.setLayoutY(80);

        Label nombreElemento=new Label("Hidrógeno"); nombreElemento.setFont(new Font("Arial",30)); nombreElemento.setStyle("-fx-text-fill:#0489d1");
        nombreElemento.setLayoutX(430); nombreElemento.setLayoutY(250);

        ListView listaPropiedades=new ListView(); listaPropiedades.setLayoutX(430); listaPropiedades.setLayoutY(300); listaPropiedades.setPrefSize(200,200);
        pane.getChildren().addAll(lv1,textField,menuBar,btnBuscar,simboloElemento,nombreElemento, listaPropiedades);
        leerArchivo("./src/elementos.csv");
        //Eventos
        lv1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(lv1.getSelectionModel().getSelectedIndex()>-1){
                    int index=lv1.getSelectionModel().getSelectedIndex();
                    System.out.println(index+2);
                    String[] elementos=renglones[index+2].split(",");
                    simboloElemento.setText(elementos[2]);
                    nombreElemento.setText(elementos[1]);
                    listaPropiedades.getItems().clear();
                    String[] arrayPropiedades=renglones[1].split(",");
                    for(int x=3;x<arrayPropiedades.length;x++){
                        listaPropiedades.getItems().add(arrayPropiedades[x]+": "+elementos[x]);
                    }
                }
            }
        });
        return pane;
    }
    public void leerArchivo(String ruta){
        File file=new File(ruta);
        try {
            BufferedReader br=new BufferedReader(new FileReader(file));
            String renglon;
            String todo="";
            while( (renglon=br.readLine() ) !=null){
                    todo= todo+"\n"+renglon;
            }
            renglones=todo.split("\n");
            for(int x=2; x<renglones.length; x++){
                String[] arrayRenglon=renglones[x].split(",");
                lv1.getItems().add(arrayRenglon[0]+"-"+arrayRenglon[1]);
            }
           // textArea.setText(todo);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("No se pudo leer el archivo");
            alert.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
