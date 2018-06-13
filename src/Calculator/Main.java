package Calculator;
	
import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
			
		try {
			VBox root = new VBox();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			TextArea ta= new TextArea();
			ta.setEditable(false);
			
			Calc c= new Calc();
			HBox hb1= new HBox();
			HBox hb2= new HBox();
			HBox hb3= new HBox();
			HBox hb4= new HBox();
			
			Button b1=new Button("1");
			Button b2=new Button("2");
			Button b3=new Button("3");
			Button b4=new Button("4");
			Button b5=new Button("5");
			Button b6=new Button("6");
			Button b7=new Button("7");
			Button b8=new Button("8");
			Button b9=new Button("9");
			Button b10=new Button("0");
			Button b11=new Button("=");
			Button b12=new Button("Clean");
			Button pl=new Button("+");
			Button min=new Button("-");
			Button mn=new Button("*");
			Button po=new Button("/");

			b1.setPrefWidth(100);
			b2.setPrefWidth(100);	
			b3.setPrefWidth(100);
			b4.setPrefWidth(100);
			b5.setPrefWidth(100);
			b6.setPrefWidth(100);
			b7.setPrefWidth(100);
			b8.setPrefWidth(100);
			b9.setPrefWidth(100);
			b10.setPrefWidth(100);
			b11.setPrefWidth(100);
			b12.setPrefWidth(100);
			
			
			pl.setPrefWidth(50);
			min.setPrefWidth(50);
			mn.setPrefWidth(50);
			po.setPrefWidth(50);
			VBox oper= new VBox();
			oper.getChildren().addAll(pl,min,mn,po);
			VBox vb1= new VBox();
			vb1.getChildren().addAll(hb1,hb2,hb3,hb4);
		
			HBox panel = new HBox();
			panel.getChildren().addAll(vb1,oper);
				
			hb1.getChildren().addAll(b1, b2, b3,b4,b5,b6,b7,b8,b9,b10,b11);
			hb2.getChildren().addAll(b4,b5,b6);
			hb3.getChildren().addAll(b7,b8,b9);
			hb4.getChildren().addAll(b10,b11,b12);
			ta.prefWidthProperty().bind(root.widthProperty());
			ta.setPrefHeight(50);
		
			root.getChildren().addAll(ta,panel);
			
			b1.setOnAction(n->ta.appendText(b1.getText()));
			b2.setOnAction(n->ta.appendText(b2.getText()));
			b3.setOnAction(n->ta.appendText(b3.getText()));
			b4.setOnAction(n->ta.appendText(b4.getText()));
			b5.setOnAction(n->ta.appendText(b5.getText()));
			b6.setOnAction(n->ta.appendText(b6.getText()));
			b7.setOnAction(n->ta.appendText(b7.getText()));
			b8.setOnAction(n->ta.appendText(b8.getText()));
			b9.setOnAction(n->ta.appendText(b9.getText()));
			b10.setOnAction(n->ta.appendText(b10.getText()));
			b12.setOnAction(n->ta.clear());
			
			pl.setOnAction(n->ta.appendText(" "+pl.getText()+" "));
			min.setOnAction(n->ta.appendText(" "+min.getText()+" "));
			mn.setOnAction(n->ta.appendText(" "+mn.getText()+" "));
			po.setOnAction(n->ta.appendText(" "+po.getText()+" "));

			b11.setOnAction(n->{
				String s=ta.getText();
				try {
				ta.setText(c.doCalc(s));
				}catch(Exception e) {
					ta.setText("Podaj prawid³owe dzia³anie arytmetyczne do wykonania");
				}
			});

		} catch(Exception e) {
			e.printStackTrace();
		}
		primaryStage.setMaximized(false);
	
		
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
