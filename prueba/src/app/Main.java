package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
    @Override
    public void start(Stage stage) {
        Label etiqueta = new Label("Java " + System.getProperty("java.version")
                + " · JavaFX " + System.getProperty("javafx.version"));
        Button boton = new Button("Pulsa aquí");
        boton.setOnAction(e -> etiqueta.setText("¡Entorno de DI listo!"));

        VBox raiz = new VBox(12, etiqueta, boton);
        raiz.setStyle("-fx-padding: 24; -fx-alignment: center; -fx-color: green");

        stage.setTitle("Prueba de entorno DI");
        stage.setScene(new Scene(raiz, 360, 160));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
