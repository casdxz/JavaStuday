package top.bearcad.chat.ui.view.chat;

/**
 * @program: chat-ui
 * @description:
 * @author: bearcad
 * @create: 2021-10-23 00:16
 **/

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;
import top.bearcad.chat.ui.Main;
import top.bearcad.chat.ui.view.UIObject;

import java.io.IOException;
import java.util.Objects;

/**
 * 窗体的初始化操作
 *
 * @author mqxu
 */
public abstract class ChatInit extends UIObject {

    private static final String RESOURCE_NAME = "view/chat/img/chat.fxml";

    ChatInit() {
        try {
            root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource(RESOURCE_NAME)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root,980,720);
        scene.setFill(Color.TRANSPARENT);
        setScene(scene);
        initStyle(StageStyle.TRANSPARENT);
        setResizable(false);
        this.getIcons().add(new Image(Objects.requireNonNull(Main.class.getResourceAsStream("view/chat/img/head/logo.png"))));
        initView();
        initEventDefine();
    }
}