package edu.jacc.expensemanager.client.javafx;

import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ClientApp extends Application {

	private Logger log = Logger.getLogger(ClientApp.class.getName());
	private Stage primaryStage;
	private FXMLLoader loader;

	@Override
	public void start(Stage primaryStage) {

		this.primaryStage = primaryStage;

		try {
			loader = new FXMLLoader(getClass().getResource("Client.fxml"));
			VBox root = (VBox) loader.load();

			setControllerStage();

			// The container of all the scene graph
			Scene scene = new Scene(root);

			// top level JavaFX container
			primaryStage.setTitle("Expense Manager");
			primaryStage.setWidth(900);
			primaryStage.setHeight(600);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			log.log(Level.SEVERE, e.getMessage());
		}

	}

	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * Returns the main stage.
	 * 
	 * @return
	 */
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	/**
	 * Set the stage for the controllers It must be called after the resource
	 * associated with the controller is loaded
	 */
	private void setControllerStage() {
		((ClientController) loader.getController()).setPrimaryStage(primaryStage);
	}
}
