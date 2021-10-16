module top.bearcad.linechar {
    requires javafx.controls;
    requires javafx.fxml;


    opens top.bearcad.linechart to javafx.fxml;
    exports top.bearcad.linechart;
}