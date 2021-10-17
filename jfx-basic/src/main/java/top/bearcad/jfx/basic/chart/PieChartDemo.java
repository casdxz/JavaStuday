package top.bearcad.jfx.basic.chart;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @program: jfx-basic
 * @description:
 * @author: bearcad
 * @create: 2021-10-17 23:03
 **/
public class PieChartDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        javafx.scene.chart.PieChart pieChart = new javafx.scene.chart.PieChart();
        pieChart.setData(getChartData());
        pieChart.setTitle("饼图");
        pieChart.setLegendSide(Side.LEFT);
        pieChart.setClockwise(false);
        pieChart.setLabelsVisible(false);

        StackPane root = new StackPane();
        root.getChildren().add(pieChart);
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }
    private ObservableList<javafx.scene.chart.PieChart.Data> getChartData() {

         ObservableList<javafx.scene.chart.PieChart.Data> answer = FXCollections.observableArrayList();
        answer.addAll(new javafx.scene.chart.PieChart.Data("Java", 17),
                new javafx.scene.chart.PieChart.Data("JavaFx", 31),
                new javafx.scene.chart.PieChart.Data("Swing", 10),
                new javafx.scene.chart.PieChart.Data("IO", 20),
                new javafx.scene.chart.PieChart.Data("NIO", 21)

        );
        /**
        JSONObject value= SystemInfoUtil.getInfo();

        String value_used=value.getJSONObject("cpuInfo").get("cSys").toString();
        Double double_used=Double.valueOf(value_used.substring(0,value_used.length()-1));

        String value_free=value.getJSONObject("jvmInfo").get("usageRate").toString();
        Double double_free=Double.valueOf(value_free.substring(0,value_free.length()-1));

        String value_cSys=value.getJSONObject("memInfo").get("usageRate").toString();
        Double double_csYs=Double.valueOf(value_cSys.substring(0,value_free.length()-1));

        ObservableList<javafx.scene.chart.PieChart.Data> answer = FXCollections.observableArrayList();
        answer.addAll(new javafx.scene.chart.PieChart.Data("cpuInfo", double_used),
                //new javafx.scene.chart.PieChart.Data("JavaFx", 31),
                // new javafx.scene.chart.PieChart.Data("Swing", 10),
                new javafx.scene.chart.PieChart.Data("getJvmInfo", double_free),
                new javafx.scene.chart.PieChart.Data("memInfo", double_csYs)
        );
         **/
        return answer;
    }

    public static void main(String[] args) {
        launch();
    }
}
