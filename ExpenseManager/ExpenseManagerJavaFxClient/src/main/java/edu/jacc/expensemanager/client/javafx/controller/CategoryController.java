package edu.jacc.expensemanager.client.javafx.controller;

import edu.jacc.expensemanager.client.retrofit.RetrofitClient;
import edu.jacc.expensemanager.entities.Category;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
//import edu.jacc.expensemanager.entities.Category;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class CategoryController {

	@FXML
	Button bNewButton;

	@FXML
	Button bSaveEditButton;

	@FXML
	Button bCancelButton;

	@FXML
	ListView<Category> lvCategories;

	@FXML
	TextField tfCategoryName;

	@FXML
	ComboBox<Object> cbColors;

	public void initialize() {
		// load data
		ObservableList<Category> categories = FXCollections.observableArrayList(new RetrofitClient().getCategories());
		lvCategories.setItems(categories);

		// set controls
		tfCategoryName.setEditable(false);
	}

	@FXML
	public void handleMouseClick(MouseEvent arg0) {
		Category category = lvCategories.getSelectionModel().getSelectedItem();
		tfCategoryName.setText(category.getName());
	}

	@FXML
	public void handleButtonNew() {
		tfCategoryName.setText("");
		tfCategoryName.setEditable(true);
	}

	@FXML
	public void handleSaveEdit() {

		tfCategoryName.setEditable(true);
		Category category = lvCategories.getSelectionModel().getSelectedItem();
		if (category != null) {
			category.setName(tfCategoryName.getText());
		} else {
			category = new Category();
			category.setName(tfCategoryName.getText());
		}
		if ((new RetrofitClient()).saveCategory(category)) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Information Dialog");
			alert.setHeaderText("Nice");
			alert.setContentText("Category inserted!");

			alert.showAndWait();
		} else {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Warning Dialog");
			alert.setContentText("Unsuccessful operation");
			alert.showAndWait();
		}

	}

	@FXML
	public void handleCancelButton() {
		tfCategoryName.setText("");
		tfCategoryName.setEditable(false);
	}

}
