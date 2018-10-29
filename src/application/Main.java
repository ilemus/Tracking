package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.stage.Popup;
import javafx.stage.Stage;


public class Main extends Application {
    private static final String TITLE = "Stock Tracker";
    private static final String VERSION = "1.0";
    
	@Override
	public void start(Stage primaryStage) {
		try {
		    Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("res/layout/main_view.fxml"));
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.getIcons().add(new Image("res/image/MainIcon.png"));
	        primaryStage.setTitle(TITLE + " " + VERSION);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			Popup popup = new Popup();
			HBox enterText = new HBox();
	        Label label = new Label("Ticker: ");
	        label.setAlignment(Pos.CENTER_LEFT);
	        TextField inputTicker = new TextField();
	        enterText.getChildren().add(label);
	        enterText.getChildren().add(inputTicker);
	        enterText.setStyle("-fx-background-color: #FFFFFF;");
	        popup.focusedProperty().addListener((obs, wasFocused, isNowFocused) -> {
                if (! isNowFocused) {
                    popup.hide();
                }
            });
			popup.getContent().add(enterText);
			popup.show(scene.getWindow());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
