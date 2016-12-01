package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Controller {
    @FXML private TextField nameField;
    @FXML
    private void onWelcomeButtonClick() {
        Stage dialogStage = new Stage();
        dialogStage.initModality(Modality.WINDOW_MODAL);
        Button dialogButton = new Button("Siema!");
        dialogButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                dialogStage.close();
            }
        });
        VBox vbox = new VBox(new Text("Cześć " + nameField.getText()), dialogButton);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(15));

        dialogStage.setScene(new Scene(vbox));
        dialogStage.show();
    }
}
