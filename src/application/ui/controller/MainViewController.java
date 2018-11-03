package application.ui.controller;

import application.ui.StockAddPrompt;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MainViewController {
    @FXML protected ListView<HBox> stock_list;
    
    @FXML protected void onAddClicked(ActionEvent event) {
        System.out.println("Button Clicked");
        
        StockAddPrompt sap = new StockAddPrompt();
        sap.start(new Stage());
    }
}
