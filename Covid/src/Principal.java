import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Principal extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Ventana ventana=new Ventana();
        AnchorPane pane= ventana.construir();
        pane.setPrefHeight(500);
        pane.setPrefWidth(500);
        Scene scene=new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Covid");
        primaryStage.setHeight(800);
        primaryStage.setWidth(600);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
