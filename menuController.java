import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class menuController {

	@FXML
	private ComboBox<String> SandwichBox;
	// SandwichBox.setItems().addAll(
	// "Burger",
	// "Chicken",
	// "Fish"
	// s );
	private String[] sandwichType = { "Burger", "Chicken", "Fish" };

	@FXML
	private ListView<String> setIngredients;
	private ObservableList<String> BurgerList = FXCollections.observableArrayList("Cheese", "Onion", "Ketchup");
	private ObservableList<String> ChickenList = FXCollections.observableArrayList("Cheese", "Lettuce", "Mayo");
	private ObservableList<String> FishList = FXCollections.observableArrayList("TarTar", "Lettuce");

	@FXML
	private ImageView imageChooser;

	@FXML
	private ListView<String> ingredientList;
	private ObservableList<String> fullList = FXCollections.observableArrayList("Lettuce", "Tomato", "Onions",
			"Cheese");

	@FXML
	private Button addButton;

	@FXML
	private Button removeButton;

	@FXML
	private Button clearButton;

	@FXML
	private ListView<String> addedIngredients;
	private ObservableList<String> addList = FXCollections.observableArrayList();

	@FXML
	private TextField totalPrice;

	@FXML
	private Button buyButton;

	@FXML
	private Button exportOrder;

	@FXML
	private TextArea orderPrint;

	@FXML
	void addToList(ActionEvent event) {
		//String item = ingredientList.getSelectionModel().getSelectedItem();

		
		if(ingredientList.getSelectionModel().getSelectedItem() != null)
			addList.add(ingredientList.getSelectionModel().getSelectedItem());
		
		fullList.remove(ingredientList.getSelectionModel().getSelectedItem());
		addedIngredients.setItems(addList);
	}

	@FXML
	void addToOrder(ActionEvent event) {

	}

	@FXML
	void clearList(ActionEvent event) 
	{
		fullList.addAll(addList);
		addList.removeAll(addList);
		addedIngredients.setItems(addList);
		ingredientList.setItems(fullList);

	}

	@FXML
	void removeFromList(ActionEvent event) 
	{
		if(addedIngredients.getSelectionModel().getSelectedItem() != null)
		{
			fullList.add(addedIngredients.getSelectionModel().getSelectedItem());
			addList.remove(addedIngredients.getSelectionModel().getSelectedItem());
			
		}
		
		
		ingredientList.setItems(fullList);
	}

	@FXML
	void sandwichChooser(ActionEvent event) {

		if (SandwichBox.getValue() == "Burger") {
			setIngredients.setItems(BurgerList);
		}
		if (SandwichBox.getValue() == "Chicken") {
			setIngredients.setItems(ChickenList);
		}
		if (SandwichBox.getValue() == "Fish") {
			setIngredients.setItems(FishList);
		}
	}

	void initialize() {

		SandwichBox.getItems().addAll(sandwichType);
		ingredientList.setItems(fullList);
	}

}
