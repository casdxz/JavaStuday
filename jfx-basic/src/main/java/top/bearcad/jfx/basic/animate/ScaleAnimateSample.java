package top.bearcad.jfx.basic.animate;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * @program: jfx-basic
 * @description: JavaFX缩放动画
 * @author: bearcad
 * @create: 2021-10-26 21:20
 **/
public class ScaleAnimateSample extends Application {
    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 300, 300);
        stage.setScene(scene);

        Rectangle rect = new Rectangle(100, 100, 100, 100);
        rect.setArcHeight(50);
        rect.setArcWidth(50);
        rect.setFill(Color.BROWN);

        ScaleTransition st = new ScaleTransition(Duration.millis(2000), rect);
        st.setByX(1.5f);
        st.setByY(1.5f);
        st.setAutoReverse(true);

        st.play();
        root.getChildren().add(rect);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
