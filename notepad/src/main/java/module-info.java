module top.bearcad.notepad {
    requires javafx.controls;
    requires javafx.fxml;


    exports top.bearcad.notepad.view;
    opens top.bearcad.notepad.view to javafx.fxml;
}