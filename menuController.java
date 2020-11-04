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
    private ComboBox<?> SandwichBox;

    @FXML
    private ListView<?> setIngredients;

    @FXML
    private ImageView imageChooser;

    @FXML
    private ListView<?> ingredientList;

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
    void addToList(ActionEvent event) {

    }

    @FXML
    void addToOrder(ActionEvent event) {

    }

    @FXML
    void clearList(ActionEvent event) {

    }

    @FXML
    void removeFromList(ActionEvent event) {

    }

    @FXML
    void sandwichChooser(ActionEvent event) {

    }

}
