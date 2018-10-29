package application.ui.controller;

import application.ui.StockAddPrompt;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainViewController {
    @FXML protected ListView<HBox> stock_list;
    
    @FXML protected void onAddClicked(ActionEvent event) {
        System.out.println("Button Clicked");
        
        StockAddPrompt sap = new StockAddPrompt();
        sap.start(new Stage());
        
        /*
        HBox listItem = new HBox();
        Text text = new Text();
        text.setText("AAPL");
        text.setFont(new Font(10));
        listItem.getChildren().add(text);
        listItem.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
                    System.out.println("Mouse clicked " + event.getEventType());
                }
            }
        });
        stock_list.getItems().add(listItem);
        */
    }
}
