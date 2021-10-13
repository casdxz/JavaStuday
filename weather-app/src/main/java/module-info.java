module top.bearcad.weatherapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;

    opens top.bearcad.weather to javafx.fxml;
    exports top.bearcad.weather;
    opens top.bearcad.weather.view to javafx.fxml;
    exports top.bearcad.weather.view;
    exports top.bearcad.weather.util;
}