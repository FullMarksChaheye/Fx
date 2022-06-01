package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			/*
			*	HBox root = new HBox();
			*	VBox root = new VBox();
			*	root.setSpacing(20);
			*
			*	StackPane root = new StackPane();
			*	
			*	BorderPane root = new BorderPane();
			*	root.setBottom(x);
			*	root.setTop(y);
			*	root.setCenter(z);
			*
			*	FlowPane root = new FlowPane();
			*/
			
			GridPane root = new GridPane();
			
			root.setHgap(100);
			root.setVgap(50);
			
			ComboBox<String> combo = new ComboBox<>();
			ToggleGroup group1 = new ToggleGroup();
			
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
					z.setText(x.getText()+" Button Selected is :"+((RadioButton)group1.getSelectedToggle()).getText()+"Combo Selected is :"+combo.getValue());
				}
			});
			
			RadioButton r1 = new RadioButton();
			RadioButton r2 = new RadioButton();
			RadioButton r3 = new RadioButton();
			
			r1.setText("Abeer");
			r2.setText("Shameer");
			r3.setText("Billu");
			
			r1.setToggleGroup(group1);
			r2.setToggleGroup(group1);
			r3.setToggleGroup(group1);
			
			
			combo.getItems().add("Abeer");
			combo.getItems().add("Billu");
			
			root.setGridLinesVisible(false);
			
			root.add(x, 1, 0);
			root.add(r1, 0, 2);
			root.add(r2, 1, 2);
			root.add(r3, 2, 2);
			root.add(combo, 0, 4);
			root.add(y, 1, 5);
			root.add(z, 1, 6);
			
			/*
			
			*/
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setWidth(600);
			primaryStage.setHeight(800);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
