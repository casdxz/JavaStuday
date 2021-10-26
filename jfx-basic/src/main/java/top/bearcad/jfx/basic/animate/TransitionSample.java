package top.bearcad.jfx.basic.animate;

import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * @program: jfx-basic
 * @description: 打字动画
 * @author: bearcad
 * @create: 2021-10-26 21:17
 **/
public class TransitionSample extends Application {
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("TransitionSample");
        stage.setWidth(400);
        stage.setHeight(200);

        VBox vbox = new VBox();
        vbox.setLayoutX(20);
        vbox.setLayoutY(20);


        final String content = "老师在前面为我们打头阵，我们必定紧随其后；\n代码中的乐趣只有深入其中才知道，\n" +
                "跟着许老师学代码必定获得其乐无穷的乐趣；\n" +
                "同时，老师给我们的影响和教育让我们终生难忘，\n非常感谢许老师！";
        final Text text = new Text(20, 20, "");

        final Animation animation = new Transition() {
            {
                setCycleDuration(Duration.millis(4000));
            }

            @Override
            protected void interpolate(double frac) {
                final int length = content.length();
                final int n = Math.round(length * (float) frac);
                text.setText(content.substring(0, n));
            }

        };
        animation.play();

        vbox.getChildren().add(text);
        vbox.setSpacing(10);
        ((Group) scene.getRoot()).getChildren().add(vbox);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
