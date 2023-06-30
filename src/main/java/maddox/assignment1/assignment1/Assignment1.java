package maddox.assignment1.assignment1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Assignment1 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane borderPane = new BorderPane();
        Image image = new Image(Assignment1.class.getResource("backgroundImage.png").toString());
        ImageView imageView = new ImageView(image);
        borderPane.getChildren().add(imageView);
        imageView.setFitHeight(675);
        imageView.setFitWidth(1200);
        imageView.setPreserveRatio(true);

        borderPane.setTop(GameMenu());
        borderPane.setCenter(background());

        Scene scene = new Scene(borderPane, 1100, 635);
        stage.setResizable(false);
        stage.setTitle("Accumulate Evasion");
        stage.setScene(scene);
        stage.show();
    }
    public HBox GameMenu()
    {
        HBox gameTitle = new HBox();
        Font font = Font.font("ArialBlack", FontWeight.BOLD, 20);
        Text gameName = new Text("UnityLauncher");
        gameName.setFont(font);
        gameName.setFill(Color.GHOSTWHITE);
        gameTitle.getChildren().addAll(gameName);
        gameTitle.setPadding(new Insets(0,245,0,20));

        MenuBar menuBar = new MenuBar();
        Menu menuMenu = new Menu("Menu");
        Menu menuDocs = new Menu("Docs");
        Menu menuWhitePaper = new Menu("Whitepaper");
        menuBar.getMenus().addAll(menuMenu, menuDocs, menuWhitePaper);
        menuBar.setStyle("-fx-background-color: rgba(0,0,0,0)");

        HBox Icons = new HBox();
        Image image1 = new Image(Assignment1.class.getResource("FBLogo.png").toString());
        ImageView imageView1 = new ImageView(image1);
        imageView1.setFitHeight(30); imageView1.setFitWidth(30);
        Button Facebook = new Button("", imageView1);
        Facebook.setStyle("-fx-background-color: rgba(0,0,0,0)");

        Image image2 = new Image(Assignment1.class.getResource("InsLogo.png").toString());
        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitHeight(30); imageView2.setFitWidth(30);
        Button Instagram = new Button("", imageView2);
        Instagram.setStyle("-fx-background-color: rgba(0,0,0,0)");

        Image image3 = new Image(Assignment1.class.getResource("TwitterLogo.png").toString());
        ImageView imageView3 = new ImageView(image3);
        imageView3.setFitHeight(30); imageView3.setFitWidth(30);
        Button Twitter = new Button("", imageView3);
        Twitter.setStyle("-fx-background-color: rgba(0,0,0,0)");

        Image image4 = new Image(Assignment1.class.getResource("WhatAppLogo.png").toString());
        ImageView imageView4 = new ImageView(image4);
        imageView4.setFitHeight(30); imageView4.setFitWidth(30);
        Button WhatApp = new Button("", imageView4);
        WhatApp.setStyle("-fx-background-color: rgba(0,0,0,0)");

        Icons.getChildren().addAll(Facebook, Instagram, Twitter, WhatApp);
        Icons.setPadding(new Insets(0,0,0,245));

        HBox topMenu = new HBox(gameTitle, menuBar, Icons);
        topMenu.setAlignment(Pos.TOP_CENTER);

        return topMenu;
    }
    public VBox background()
    {
        VBox inform = new VBox();
        Font font = Font.font("ArialBlack", FontWeight.BOLD, 40);
        Text gameText = new Text("Accumulate Evasion");
        gameText.setFont(font); gameText.setFill(Color.GHOSTWHITE);

        Font font1 = Font.font("ArialBlack", FontWeight.BOLD, 30);
        Text gameText1 = new Text("Play this arcade-like game, but for free!");
        gameText1.setFont(font1); gameText1.setFill(Color.GHOSTWHITE);

        Font font2 = Font.font("ArialBlack", FontWeight.BOLD, 18);
        Text gameText2 = new Text("Test how fast your reaction is");
        gameText2.setFont(font2); gameText2.setFill(Color.GHOSTWHITE);

        Font font3 = Font.font("ArialBlack", FontWeight.BOLD, 18);
        Text gameText3 = new Text("The longer you stay, the harder it be !");
        gameText3.setFont(font3); gameText3.setFill(Color.GHOSTWHITE);

        Button playGame = new Button("Launch Game");
        Font font4 = Font.font("Verdana", FontWeight.BOLD, 14);
        playGame.setFont(font4);
        playGame.setStyle("-fx-background-color: rgba(255,255,255,1)");
        playGame.setMaxWidth(150);
        playGame.setMaxHeight(300);

        inform.setSpacing(10);
        inform.setPadding(new Insets(45,0,0,50));
        inform.getChildren().addAll(gameText, gameText1, gameText2, gameText3, playGame);
        return inform;
    }

    public static void main(String[] args) {
        launch();
    }
}