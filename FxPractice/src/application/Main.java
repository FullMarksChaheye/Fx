package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			FlowPane root = new FlowPane();
			
			Label z = new Label();
			
			TextField x = new TextField();
			x.setText("Write Something here");
			x.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event arg0) {
					System.out.println("Clicked on me Bro");
				}
			});
			
			Button y = new Button();
			y.setText("Second me");
			y.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					z.setText(x.getText());
				}
			});
			
			root.getChildren().add(x);
			root.getChildren().add(y);
			root.getChildren().add(z);
			
			/*
			BorderPane root = new BorderPane();
			
			root.setBottom(x);
			root.setTop(y);
			root.setCenter(z);
			*/
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
