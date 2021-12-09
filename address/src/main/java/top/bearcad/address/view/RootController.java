package top.bearcad.address.view;

import javafx.fxml.FXML;
import top.bearcad.address.MainApp;

/**
 * @program: address
 * @description:
 * @author: bearcad
 * @create: 2021-10-11 21:50
 **/
public class RootController {
    private MainApp mainApp;
    public void setMainApp(MainApp mainApp){
        this.mainApp = mainApp;
    }
    @FXML
    private void handleShowBirthdayStatistics(){
        mainApp.showBirthdayStatistics();
    }
}
