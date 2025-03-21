package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class NoteApp extends Application {

    @Override
    public void start(Stage window) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/note.fxml")));
        root.getStylesheets().add("/style.css");
        window.setTitle("NotebookApp");
        window.setScene(new Scene(root, 600, 400));
        window.show();
    }
}