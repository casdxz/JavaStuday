module top.bearcad.address {
    requires javafx.controls;
    requires javafx.fxml;


    opens top.bearcad.address to javafx.fxml;
    exports top.bearcad.address;
    exports top.bearcad.address.view;
    opens top.bearcad.address.view to javafx.fxml;
}