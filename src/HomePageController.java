import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomePageController {

    @FXML
    private Label labelNIM;

    @FXML
    private Label labelNama;

    @FXML
    private Label labelUsername;

    public void initialize() {
        labelUsername.setText("DEKA");
        labelNama.setText("Adrian Daniel Kristanto");
        labelNIM.setText("1202220037");
    }

}
