import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Principal extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage ventana) throws Exception {
        AnchorPane acomodo=new AnchorPane();
        Label label1=new Label("HolaFX");
        label1.setLayoutX(150);
        label1.setLayoutY(150);
        label1.setFont(new Font("Arial",30));
        label1.setTextFill(Color.web("#2e0c7d"));
        acomodo.getChildren().add(label1);

        TextField txt1=new TextField();
            txt1.setLayoutX(150);
            txt1.setLayoutY(190);
            txt1.setPrefSize(200,50);
            acomodo.getChildren().add(txt1);

        Button btn1=new Button("Aceptar");
        btn1.setLayoutX(150);
        btn1.setLayoutY(250);
        btn1.setPrefSize(200,50);
        acomodo.getChildren().add(btn1);
       // acomodo.setPrefWidth(500);
        // acomodo.setPrefHeight(500);
        Scene escena1=new Scene(acomodo);
            ventana.setScene(escena1);
            ventana.setWidth(500);
            ventana.setHeight(500);
            ventana.setTitle("Hola mundo");
            ventana.show();
    }
}
