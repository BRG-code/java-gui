package application;
	
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login {
    public void start(Stage window, Text status) throws Exception {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/LoginScreen.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.setTitle("�α���");
        stage.show();
        
    }
}