package top.bearcad.chat.ui;

/**
 * @program: chat-ui
 * @description:
 * @author: bearcad
 * @create: 2021-10-23 02:45
 **/

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import top.bearcad.chat.ui.view.chat.ChatController;
import top.bearcad.chat.ui.view.chat.IChatMethod;
import top.bearcad.chat.ui.view.login.ILoginMethod;
import top.bearcad.chat.ui.view.login.LoginController;

import java.io.IOException;
import java.util.Date;

/**
 * 启动主类
 * @author Bear
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        ILoginMethod login = new LoginController((userId, userPassword) -> {
            if ("Bear".equals(userId) && "980529".equals(userPassword)){
                //登录成功，弹框
                Alert.AlertType alertAlertType;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.titleProperty().set("提示");
                alert.headerTextProperty().set("登陆成功！");
                alert.showAndWait();
                IChatMethod chat = new ChatController();

                chat.doShow();
                // 填充对话框测试数据
                chat.addTalkBox(-1, 0, "1000001", "魏无羡",  "https://i.loli.net/2021/10/24/YbdIcwnlgKpM76V.jpg", "人生就像一杯茶，不会苦一辈子，但总会苦一阵子。", new Date(), false);
                chat.addTalkBox(-1, 0, "1000002", "蓝忘机", "https://i.loli.net/2021/10/24/cKOquNbV9wB3siJ.jpg", "人生如果错了方向，停止就是进步", new Date(), false);
                chat.addTalkBox(-1, 0, "1000003", "江澄",  "https://i.loli.net/2021/10/24/SrWTqBAotmsOkPQ.jpg", "低头要有勇气，抬头要有底气；忍无可忍，就重新再忍。", new Date(), false);
                chat.addTalkBox(-1, 0, "1000004", "江晚呤", "https://i.loli.net/2021/10/24/Waj9x3BOvDEJuUy.jpg", "时间就像一张网，你撒在哪里，你的收获就在哪里。", new Date(), false);
                chat.addTalkBox(-1, 0, "1000005", "温宁",  "https://i.loli.net/2021/10/24/iLp5jVzbMrySPwT.jpg", "学习要加，骄傲要减，机会要乘，懒惰要除。", new Date(), false);
                chat.addTalkBox(-1, 0, "1000006", "思追",  "https://i.loli.net/2021/10/24/cBdWybOa8IA3Lkv.jpg", "叹气是最浪费时间的事情，哭泣是最浪费力气的行径。", new Date(), false);
                chat.addTalkBox(-1, 0, "1000007", "金凌",  "https://i.loli.net/2021/10/24/noRZGUrkON67H5B.jpg", "把一切平凡的事做好即不平凡，把一切简单的事做好即不简单。", new Date(), false);

            }
        });
        login.doShow();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
