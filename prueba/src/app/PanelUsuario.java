package app;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PanelUsuario extends Application{

    @Override
    public void start(Stage stage){

        BorderPane bPane = new BorderPane();
        bPane.setStyle(
            "-fx-background-color: #EAF4F8;" + 
            "-fx-font-family: 'Arial';" + 
            "-fx-font-size: 13;"
        );
        bPane.setPadding(new Insets(0));

        //creando la parte superior con label y menú

        Label titulo = new Label("Panel de Control");
        //alto
        //titulo.setPrefHeight(56);
        //titulo.setPadding(new Insets(14, 18, 14, 18)); 
        ////arriba, derecha, abajo, izquierda
        titulo.setStyle(
           "-fx-font-size: 22;" +
            "-fx-text-fill: #174A73;" 
        //    "-fx-background-color: #2C3E50;"
//
        );
        //titulo.setAlignment(Pos.CENTER_LEFT);

        //Menu

        Menu menuArchivo = new Menu("Archivo");
        Menu menuEditar = new Menu("Editar");
        Menu menuAyuda = new Menu("Ayuda");

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(menuArchivo, menuEditar, menuAyuda);
        //menuBar.setPrefHeight(10);
        menuBar.setStyle(
            //"-fx-text-fill: #174A73;" + 
            "-fx-background-color: #CFE8E2;" +
            "-fx-font-size: 12px;"

        );

        //contenedor
        VBox superior = new VBox();
        superior.getChildren().addAll(titulo, menuBar);
        //superior.setPrefHeight(56);
        superior.setPadding(new Insets(14, 18, 14, 18)); 
        //arriba, derecha, abajo, izquierda
        superior.setStyle(
            "-fx-background-color: #EAF2FF;"

        );

        
        bPane.setTop(superior);

        //lado izquierdo
        Button botonInicio = new Button("Inicio");
        Button botonPerfil = new Button("Perfil ");
        Button botonConfiguracion = new Button("Configuracion");
        Button botonSalir = new Button("Salir");

        VBox izquierdo = new VBox();
        izquierdo.getChildren().addAll(botonInicio, botonPerfil, botonConfiguracion, botonSalir);

        bPane.setLeft(izquierdo);


        bPane.setCenter(new TextField("Center"));

        bPane.setRight(new TextField("Right"));

        bPane.setBottom(new TextField("Bottom"));

        Scene scene = new Scene(bPane, 880, 550);

        stage.setTitle("Panel de Control de Usuario");


        stage.setScene(scene);

         stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}