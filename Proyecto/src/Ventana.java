import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import  java.io.FileNotFoundException;
import java.io.*;
public class Ventana {
    private Stage stage;
    private ListView listaConceptos;
    private Concepto arregloConcepto[]=new Concepto[8];
    String[] renglones;
    public  int cont=0;
    public Ventana(Stage stage){this.stage=stage;}
    public Concepto conceptos;
    public AnchorPane crearVentana(){
        AnchorPane pane=new AnchorPane();
        pane.setPrefSize(960,600);

        listaConceptos=new ListView(); listaConceptos.setPrefSize(230,200); listaConceptos.setLayoutX(10); listaConceptos.setLayoutY(90);
        TextField txtConcepto=new TextField(); txtConcepto.setPrefSize(150,20); txtConcepto.setLayoutX(10); txtConcepto.setLayoutY(25); txtConcepto.setPromptText("Insertar concepto");
        TextField txtDefinicion=new TextField(); txtDefinicion.setPrefSize(150,20); txtDefinicion.setLayoutX(10); txtDefinicion.setLayoutY(55); txtDefinicion.setPromptText("Insertar definición");

        Button btnInsertar=new Button("Insertar"); btnInsertar.setPrefSize(80,20); btnInsertar.setLayoutX(165); btnInsertar.setLayoutY(40);
        btnInsertar.setStyle("-fx-background-color:#800040; -fx-background-radius:5em;-fx-text-fill:white");

        Label lblConcepto= new Label("Concepto"); lblConcepto.setFont(new Font("Arial",20)); lblConcepto.setStyle("-fx-text-fill:#800040");
        lblConcepto.setLayoutX(10); lblConcepto.setLayoutY(290);

        Label lblDefinicion= new Label("..."); lblDefinicion.setFont(new Font("Arial",10)); lblDefinicion.setStyle("-fx-text-fill:black");
        lblDefinicion.setLayoutX(5); lblDefinicion.setLayoutY(320);

        ListView listaInsertados=new ListView(); listaInsertados.setLayoutX(250); listaInsertados.setLayoutY(90); listaInsertados.setPrefSize(300,200);
        pane.getChildren().addAll(listaConceptos,txtConcepto,btnInsertar,lblConcepto,lblDefinicion,txtDefinicion,listaInsertados);
        leerArchivo("./src/diccionarioFernando.csv");
        //Aqui van los eventossss:D
        listaConceptos.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(listaConceptos.getSelectionModel().getSelectedIndex()>-1){
                    int index=listaConceptos.getSelectionModel().getSelectedIndex();
                    System.out.println(index);
                    String[] conceptos=renglones[index+1].split(",");
                    lblConcepto.setText(conceptos[0]);
                    lblDefinicion.setText(conceptos[1]);
                }//if
            }//evento
        });
        btnInsertar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String concepto=txtConcepto.getText();
                String definicion=txtDefinicion.getText();
                if(concepto.equals("") || definicion.equals("")){
                    launchError("Por favor, rellena todos los campos");
                }else{
                    try{
                        conceptos=new Concepto(concepto,definicion);
                        arregloConcepto[cont]=conceptos;
                        cont++;
                        launchSuccess("Concepto registrado exitosamente, ¡Gracias por tu colaboración!;)");
                        txtConcepto.setText("");
                        txtDefinicion.setText("");
                        listaInsertados.getItems().addAll(conceptos.getConcepto()+"- "+conceptos.getDefinicion());
                    }catch(ArrayIndexOutOfBoundsException error){
                        launchError("No se aceptan más registros");
                    }catch (Exception error){
                        launchError("Ocurrió un error inesperado");
                    }
                }//Llave else
            }//llave evento
        });
        listaInsertados.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(listaInsertados.getSelectionModel().getSelectedIndex()>-1){
                    lblConcepto.setText(conceptos.getConcepto());
                    lblDefinicion.setText(conceptos.getDefinicion());
                }//if
            }//evento
        });

        return pane;
    }//Crear ventana
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
            for(int x=1; x<renglones.length; x++){
                String[] arrayRenglon=renglones[x].split(",");
                listaConceptos.getItems().add(arrayRenglon[0]+"-"+arrayRenglon[1]);
            }

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
    public void launchError(String mensaje){
        Alert alert=new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setContentText(mensaje);
        alert.show();
    }
    public void launchSuccess(String mensaje){
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Todo bien");
        alert.setContentText(mensaje);
        alert.show();
    }
}
