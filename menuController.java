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

public class menuController 
{

    @FXML
    private ComboBox<String> SandwichBox;
    //SandwichBox.setItems().addAll(
    //		"Burger",
    //		"Chicken",
    //		"Fish"
    //s		);
    private String[] sandwichType  = {"Burger", "Chicken", "Fish"};
    
    
    
    @FXML
    private ListView<String> setIngredients;
    private ObservableList<String> BurgerList = FXCollections.observableArrayList("Cheese", "Onion", "Ketchup");
    private ObservableList<String> ChickenList = FXCollections.observableArrayList("Cheese", "Lettuce", "Mayo");
    private ObservableList<String> FishList = FXCollections.observableArrayList("TarTar", "Lettuce");
    
    @FXML
    private ImageView imageChooser;

    @FXML
    private ListView<String> ingredientList;
    private String[] allIngredients = {"Lettuce", "Tomato", "Onions", "Cheese"};

    @FXML
    private Button addButton;

    @FXML
    private Button removeButton;

    @FXML
    private Button clearButton;

    @FXML
    private ListView<?> addedIngredients;

    @FXML
    private TextField totalPrice;

    @FXML
    private Button buyButton;

    @FXML
    private Button exportOrder;

    @FXML
    private TextArea orderPrint;

    @FXML
    void addToList (ActionEvent event) 
    {

    }

    @FXML
    void addToOrder (ActionEvent event) 
    {

    }

    @FXML
    void clearList(ActionEvent event) 
    {

    }

    @FXML
    void removeFromList(ActionEvent event) 
    {

    }

    @FXML
    void sandwichChooser(ActionEvent event) 
    {
    	SandwichBox.getItems().addAll(sandwichType); 
    	
    	if(SandwichBox.getValue() == "Burger")
    	{
    		setIngredients.setItems(BurgerList);
    	}
    	if(SandwichBox.getValue() == "Chicken")
    	{
    		setIngredients.setItems(ChickenList);
    	}
    	if(SandwichBox.getValue() == "Fish")
    	{
    		setIngredients.setItems(FishList);
    	}
    }

}
