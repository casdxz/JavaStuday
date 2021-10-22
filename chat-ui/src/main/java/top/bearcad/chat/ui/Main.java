package top.bearcad.chat.ui;

/**
 * @program: chat-ui
 * @description:
 * @author: bearcad
 * @create: 2021-10-23 02:45
 **/

import javafx.application.Application;
import javafx.stage.Stage;
import top.bearcad.chat.ui.view.login.ILoginMethod;
import top.bearcad.chat.ui.view.login.LoginController;

import java.io.IOException;

/**
 * 启动主类
 * @author Bear
 */
public class Main extends Application {

    @Override

    public void start(Stage stage) throws IOException {
        ILoginMethod login = new LoginController((userId, userPassword) -> {
            System.out.println("登陆 userId：" + userId + "userPassword：" + userPassword);
        });

        login.doShow();
    }

    public static void main(String[] args) {
        launch(args);
    }


//    @Override

//    public void start(Stage stage) throws IOException {
//        IChatMethod chat = new ChatController();
//        chat.doShow();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }

}
