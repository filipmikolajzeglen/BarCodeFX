package barcode;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller extends Main {

    public Controller(){}

    @FXML
    public Button close;
    public Button generate;
    public Stage window;

    @FXML
    void initialize() {
    }

    @FXML
    public void exit() {
        Platform.exit();
    }

    @FXML
    public void onActionGenerateBarCode() {
        // Generate BarCode
    }

}
