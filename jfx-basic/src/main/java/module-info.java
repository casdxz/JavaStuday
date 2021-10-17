module top.bearcad.jfxbasic {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.github.oshi;
    requires fastjson;


    opens top.bearcad.jfx.basic to javafx.fxml;
    exports top.bearcad.jfx.basic;
    exports top.bearcad.jfx.basic.chart;
    opens top.bearcad.jfx.basic.chart to javafx.fxml;
}