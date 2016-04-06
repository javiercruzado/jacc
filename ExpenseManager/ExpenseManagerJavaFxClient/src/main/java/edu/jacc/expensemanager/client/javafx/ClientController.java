package edu.jacc.expensemanager.client.javafx;

import java.io.IOException;

import edu.jacc.expensemanager.client.retrofit.RetrofitClient;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ClientController {

	private Stage primaryStage;
	BooleanProperty noConnection = new SimpleBooleanProperty();

	/*
	 * GUI Controls
	 */

	@FXML
	Label lLeftStatus;

	@FXML
	MenuItem miCategories;

	public void initialize() {

		miCategories.disableProperty().bindBidirectional(noConnection);

		String status = new RetrofitClient().getStatus();
		if (!"".equals(status)) {
			noConnection.set(false);
			lLeftStatus.setText(status);
		} else {
			noConnection.set(true);
			lLeftStatus.setText("Error connecting");
		}

	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	/* Menu actions */
	public void showHelp() {
		// Load the fxml file and create a new stage for the popup
		FXMLLoader loader = new FXMLLoader(ClientApp.class.getResource("fxml/About.fxml"));
		AnchorPane page;
		try {
			page = (AnchorPane) loader.load();

			Stage dialogStage = new Stage();
			dialogStage.setTitle("About");
			dialogStage.initModality(Modality.WINDOW_MODAL);
			dialogStage.initOwner(getPrimaryStage());
			Scene scene = new Scene(page);
			dialogStage.setScene(scene);
			dialogStage.showAndWait();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Set the person into the controller
		// PersonEditDialogController controller = loader.getController();
		// controller.setDialogStage(dialogStage);
		// controller.setPerson(person);

		// Show the dialog and wait until the user closes it

		// return isOkClicked();
	}

	public void showCategories() {
		// Load the fxml file and create a new stage for the popup
		FXMLLoader loader = new FXMLLoader(ClientApp.class.getResource("fxml/Category.fxml"));
		AnchorPane page;
		try {
			page = (AnchorPane) loader.load();

			Stage dialogStage = new Stage();
			dialogStage.setTitle("Categories");
			dialogStage.initModality(Modality.WINDOW_MODAL);
			dialogStage.initOwner(getPrimaryStage());
			Scene scene = new Scene(page);
			dialogStage.setScene(scene);
			dialogStage.showAndWait();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Set the person into the controller
		// PersonEditDialogController controller = loader.getController();
		// controller.setDialogStage(dialogStage);
		// controller.setPerson(person);

		// Show the dialog and wait until the user closes it

		// return isOkClicked();
	}

}
