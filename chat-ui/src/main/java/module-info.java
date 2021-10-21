module top.bearcad.chatui {
    requires javafx.controls;
    requires javafx.fxml;


    opens top.bearcad.chat.ui to javafx.fxml;
    exports top.bearcad.chat.ui;
}