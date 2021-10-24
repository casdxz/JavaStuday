package top.bearcad.chat.ui;

/**
 * @program: chat-ui
 * @description:
 * @author: bearcad
 * @create: 2021-10-23 02:45
 **/

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import top.bearcad.chat.ui.view.chat.ChatController;
import top.bearcad.chat.ui.view.chat.IChatEvent;
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
            if ("Bear".equals(userId) && "980529".equals(userPassword)) {
                //登录成功，弹框
                //Alert.AlertType alertAlertType;
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.titleProperty().set("提示");
                alert.headerTextProperty().set("登陆成功！");
                alert.showAndWait();
                IChatMethod chat = new ChatController(new IChatEvent() {
                });
                chat.doShow();
                chat.setUserInfo("1000001", "bear", "https://i.loli.net/2021/10/24/PyoxlEReYVgTNkG.jpg");

                // 好友 - 对话框
                chat.addTalkBox(-1, 0, "1000001", "魏无羡", "https://i.loli.net/2021/10/24/YbdIcwnlgKpM76V.jpg", "", new Date(), false);
                chat.addTalkMsgRight("1000001", "人生就像一杯茶，不会苦一辈子，但总会苦一阵子。", new Date(), true, true, false);
                chat.addTalkMsgUserLeft("1000001", "叹气是最浪费时间的事情，哭泣是最浪费力气的行径。", new Date(), true, false, true);

                chat.addTalkBox(-1, 0, "1000002", "蓝忘机", "https://i.loli.net/2021/10/24/cKOquNbV9wB3siJ.jpg", "", new Date(), false);
                chat.addTalkMsgRight("1000002", "人生如果错了方向，停止就是进步", new Date(), true, false, false);
                chat.addTalkMsgUserLeft("1000002", "不要让今天的懈怠成为一生的痛。", new Date(), true, true, false);
                chat.addTalkMsgUserLeft("1000002", "学必求其心得，业必贵其专精。", new Date(), true, false, true);

                chat.addTalkBox(-1, 0, "1000003", "江澄",  "https://i.loli.net/2021/10/24/SrWTqBAotmsOkPQ.jpg", "", new Date(), false);
                chat.addTalkMsgRight("1000003", "忙碌是一种幸福，让我们没时间体会痛苦；奔波是一种快乐，让我们真实地感受生活；疲惫是一种享受，让我们无暇空虚。", new Date(), true, false, false);
                chat.addTalkMsgUserLeft("1000003", "做与不做的最大区别是：后者拥有对前者的评论权。", new Date(), true, false, true);
                chat.addTalkMsgUserLeft("1000003", "人生最精彩的不是实现梦想的瞬间，而是坚持梦想的过程", new Date(), true, true, true);

                chat.addTalkBox(-1, 0, "1000004", "江晚呤", "https://i.loli.net/2021/10/24/Waj9x3BOvDEJuUy.jpg", "", new Date(), false);
                chat.addTalkMsgRight("1000004", "时间就像一张网，你撒在哪里，你的收获就在哪里。", new Date(), true, false, false);
                chat.addTalkMsgUserLeft("1000004", "人都是逼出来的。", new Date(), true, true, false);
                chat.addTalkMsgUserLeft("1000004", "不要浪费你的生命，在你一定会后悔的地方上。", new Date(), true, false, true);

                chat.addTalkBox(-1, 0, "1000005", "温宁",  "https://i.loli.net/2021/10/24/iLp5jVzbMrySPwT.jpg", "", new Date(), false);
                chat.addTalkMsgRight("1000005", "学习要加，骄傲要减，机会要乘，懒惰要除。", new Date(), true, false, false);
                chat.addTalkMsgUserLeft("1000005", "很多失败不是由于才能有限，而是由于没有坚持到底。", new Date(), true, true, false);
                chat.addTalkMsgUserLeft("1000005", "坚持是雄壮的，因为坚持是由于百般地敲打而磨练出来的；坚持是甘甜的，因为无畏的与不倒的毅力早已在心中播下了胜利的种子。", new Date(), true, false, true);

                chat.addTalkBox(-1, 0, "1000006", "思追",  "https://i.loli.net/2021/10/24/cBdWybOa8IA3Lkv.jpg", "", new Date(), false);
                chat.addTalkMsgRight("1000006", "叹气是最浪费时间的事情，哭泣是最浪费力气的行径。", new Date(), true, false, false);
                chat.addTalkMsgUserLeft("1000006", "有些事，明知是错的，也要去坚持，因为不甘心。", new Date(), true, true, false);
                chat.addTalkMsgUserLeft("1000006", "要有把路走绝的精神，激流勇退是一种境界，把路走绝是一种精神。坚持到底，不会错的；坚持到底，就是成功！", new Date(), true, false, true);

                chat.addTalkBox(-1, 0, "1000007", "金凌",  "https://i.loli.net/2021/10/24/noRZGUrkON67H5B.jpg", "", new Date(), false);
                chat.addTalkMsgRight("1000007", "把一切平凡的事做好即不平凡，把一切简单的事做好即不简单。", new Date(), true, false, false);
                chat.addTalkMsgUserLeft("1000007", "有些事情不是因为看到希望了才去坚持，而是因为坚持才能看到希望永恒，人生永远的主题。贵在坚持，重在执着。", new Date(), true, true, false);
                chat.addTalkMsgUserLeft("1000007", "人生的成功不过是在紧要处多一份坚持，人生的失败往往是在关键时刻少了坚持。", new Date(), true, false, true);

                // 群组 - 对话框
                chat.addTalkBox(0, 1, "5307397", "魔道祖师", "https://i.loli.net/2021/10/24/au4hfqUTmijeyWG.png", "", new Date(), true);
                chat.addTalkMsgRight("5307397", "坚持是什么？", new Date(), true, true, false);
                chat.addTalkMsgGroupLeft("5307397", "1000003", "魏无羡",  "https://i.loli.net/2021/10/24/YbdIcwnlgKpM76V.jpg", "坚持是通往成功的必经之路。", new Date(), true, false, true);
                chat.addTalkMsgGroupLeft("5307397", "1000004", "蓝忘机", "https://i.loli.net/2021/10/24/cKOquNbV9wB3siJ.jpg", "坚持是通往胜利的桥梁！", new Date(), true, false, true);
                chat.addTalkMsgGroupLeft("5307397", "1000002", "江澄",  "https://i.loli.net/2021/10/24/SrWTqBAotmsOkPQ.jpg", "坚持是通往成功的必经之路。", new Date(), true, false, true);
                chat.addTalkMsgGroupLeft("5307397", "1000005", "江晚呤", "https://i.loli.net/2021/10/24/Waj9x3BOvDEJuUy.jpg", "有了坚持不一定成功；但没有坚持，就注定失败。", new Date(), true, false, true);
                chat.addTalkMsgGroupLeft("5307397", "1000006", "温宁",  "https://i.loli.net/2021/10/24/iLp5jVzbMrySPwT.jpg", "坚持，是一种态度，是大家必有而又难得珍存的一种态度。因此，坚持也需坚持。", new Date(), true, false, true);
                chat.addTalkMsgGroupLeft("5307397", "1000007", "思追",  "https://i.loli.net/2021/10/24/cBdWybOa8IA3Lkv.jpg", "坚持让平凡变成伟大。但是浅尝辄止也同样让一位天才黯然神伤。", new Date(), true, false, true);
                chat.addTalkMsgGroupLeft("5307397", "1000008", "金凌",  "https://i.loli.net/2021/10/24/noRZGUrkON67H5B.jpg", "再苦再累，只要坚持往前走，属于你的风景终会出现；只要是自己选择的，那就无怨无悔。", new Date(), true, false, true);
                chat.addTalkMsgRight("5307397", "很好，今天就到这，别卷了，睡觉吧！", new Date(), true, true, false);

            }
        });
        login.doShow();
    }


    /*
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
     */

    public static void main(String[] args) {
        launch(args);
    }
}
