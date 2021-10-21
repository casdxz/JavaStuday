package top.bearcad.chat.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @program: chat-ui
 * @description:
 * @author: bearcad
 * @create: 2021-10-21 23:04
 **/
public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view/login/login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),540,420);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
