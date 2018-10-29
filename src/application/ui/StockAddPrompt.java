package application.ui;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class StockAddPrompt extends Application {
    @Override
    public void start(Stage primaryStage) {
        Group group = new Group();
        Scene scene = new Scene(group, 200, 25);
        
        HBox enterText = new HBox();
        enterText.setPrefHeight(25.0);
        Label label = new Label("Ticker: ");
        label.setAlignment(Pos.CENTER_LEFT);
        TextField inputTicker = new TextField();
        
        inputTicker.setOnKeyTyped(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                System.out.print("Pressed: " + (int) event.getCharacter().charAt(0));
                
                if (inputTicker.getText().length() > 5) {
                    event.consume();
                }
                
                System.out.println(", " + inputTicker.getText());
                
                // Windows carriage return, need case for linux/windows
                if (event.getCharacter().charAt(0) == 13) {
                    ((Stage) inputTicker.getScene().getWindow()).close();
                    System.out.println("Closing window");
                }
            }
        });
        
        enterText.getChildren().add(label);
        enterText.getChildren().add(inputTicker);
        
        group.getChildren().add(enterText);
        
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("Add Stock");
        primaryStage.show();
    }
}
