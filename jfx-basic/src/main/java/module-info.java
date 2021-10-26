module top.bearcad.jfxbasic {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.github.oshi;
    requires fastjson;

    requires java.desktop;

    opens top.bearcad.jfx.basic to javafx.fxml;
    exports top.bearcad.jfx.basic;

    opens top.bearcad.jfx.basic.animate to javafx.fxml;
    exports top.bearcad.jfx.basic.animate;

    opens top.bearcad.jfx.basic.trayicon to javafx.fxml;
    exports top.bearcad.jfx.basic.trayicon;

    exports top.bearcad.jfx.basic.chart;
    opens top.bearcad.jfx.basic.chart to javafx.fxml;
}