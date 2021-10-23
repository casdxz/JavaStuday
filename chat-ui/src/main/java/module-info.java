module top.bearcad.chatui {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.materialdesign;


    opens top.bearcad.chat.ui to javafx.fxml;
    exports top.bearcad.chat.ui;

    opens top.bearcad.chat.ui.view to javafx.fxml;
    exports top.bearcad.chat.ui.view;

    opens top.bearcad.chat.ui.view.login to javafx.fxml;
    exports top.bearcad.chat.ui.view.login;

    opens top.bearcad.chat.ui.view.chat to javafx.fxml;
    exports top.bearcad.chat.ui.view.chat;
}