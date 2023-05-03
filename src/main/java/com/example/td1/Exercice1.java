package com.example.td1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static java.io.File.separator;

public class Exercice1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Création du conteneur principal
        VBox vbox = new VBox();

        // Création de la barre Menu
        //HBox topControls = new HBox();
        MenuBar menuBar = new MenuBar();

        Menu menu1 = new Menu("File");
        Menu menu2 = new Menu("Edit");
        Menu menu3 = new Menu("Help");

        menuBar.getMenus().add(menu1);
        menuBar.getMenus().add(menu2);
        menuBar.getMenus().add(menu3);

        MenuItem item1 = new MenuItem("New");
        MenuItem item2 = new MenuItem("Open");
        MenuItem item3 = new MenuItem("Save");
        MenuItem item4 = new MenuItem("Close");

        MenuItem item5 = new MenuItem("Cut");
        MenuItem item6 = new MenuItem("Copy");
        MenuItem item7 = new MenuItem("Paste");

        menu1.getItems().addAll(item1, item2, item3, item4);
        menu2.getItems().addAll(item5, item6, item7);


        //Création des boutons





       /* Label b0 = new Label("Button : ");
        b0.setPadding(new Insets(5, 5, 5, 5));
        root.setLeft(b0);
        BorderPane.setMargin(b0, new Insets(10, 10, 10, 10));

        Button b1 = new Button("Button 1 ");
        b1.setPadding(new Insets(5, 5, 5, 5));
        root.setLeft(b1);
        BorderPane.setMargin(b1, new Insets(10, 10, 10, 10));
*/

        VBox buttonControls = new VBox();
        BorderPane root = new BorderPane();

        Label b0 = new Label("Button : ");
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        b0.setPadding(new Insets(5, 5, 5, 5));

        BorderPane.setMargin(b0, new Insets(150, 10, 10, 10));
        buttonControls.setLeft(b0);

        /*
        b0.setPadding(new Insets(5, 5, 5, 5));
        b1.setPadding(new Insets(5, 5, 5, 5));
        b2.setPadding(new Insets(5, 5, 5, 5));
        b3.setPadding(new Insets(5, 5, 5, 5));
*/

        /*// Set margin for left area.
        BorderPane.setMargin(b0, new Insets(10, 10, 10, 10));
        BorderPane.setMargin(b1, new Insets(30, 20, 20, 20));
        BorderPane.setMargin(b2, new Insets(50, 10, 10, 10));
        BorderPane.setMargin(b3, new Insets(70, 10, 10, 10));*/

        vbox.getChildren().addAll(b0,b1,b2,b3);

        Separator left = new Separator(Orientation.VERTICAL);






       /* // Création du tableau avec les deux colonnes
        TableView<Object> tblCustomers = new TableView<>();
        tblCustomers.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        TableColumn<Object, String> lastNameCol = new TableColumn<>("Last Name");
        TableColumn<Object, String> firstNameCol = new TableColumn<>("First Name");
        tblCustomers.getColumns().addAll( lastNameCol, firstNameCol );
        VBox.setVgrow( tblCustomers, Priority.ALWAYS );
*/
        // Création de la ligne de séparation
        Separator sep = new Separator();

        // Création du bandeau en bas de la fenêtre

        Separator bottom = new Separator(Orientation.HORIZONTAL);
        HBox bottomControls = new HBox();
        bottomControls.setAlignment(Pos.BOTTOM_CENTER);
        Label btnClose = new Label("Ceci est un label de bas de page");
        bottomControls.getChildren().add( btnClose );


        // Ajout des contrôleurs au conteneur principal
        vbox.getChildren().addAll(
                /*tblCustomers,*/
                menuBar,
                left,
                sep,
                root,
                buttonControls,
                bottom,
                bottomControls


        );

        // Ajout du conteneur à la scene
        Scene scene = new Scene(vbox );


        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("VBox and HBox App");

        //VBox.setMargin( topControls, new Insets(20.0d) );
        //VBox.setMargin( tblCustomers, new Insets(0.0d, 10.0d, 10.0d, 10.0d) );
        VBox.setMargin( bottomControls, new Insets(10.0d) );

        // Affichage de la fenêtre
        primaryStage.setScene(scene);
        primaryStage.setTitle("Premier exemple manipulant les conteneurs");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}