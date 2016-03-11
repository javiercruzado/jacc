package edu.jacc.expensemanager.client.javafx;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ClientController {

	private Stage primaryStage;

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

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

}
