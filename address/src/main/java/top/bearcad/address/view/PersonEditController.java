package top.bearcad.address.view;


import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import top.bearcad.address.MainApp;
import top.bearcad.address.config.AppConstant;
import top.bearcad.address.model.Person;

/**
 * @program: address
 * @description:
 * @author: bearcad
 * @create: 2021-10-11 07:30
 **/

public class PersonEditController {

    private MainApp mainApp;

    private Person person;

    private String type;

    @FXML
    private TextField nameField;

    @FXML
    private TextField clazzField;

    @FXML
    private RadioButton maleButton;

    @FXML
    private RadioButton femaleButton;

    @FXML
    private ToggleGroup group;

    @FXML
    private TextField addressField;

    @FXML
    private DatePicker birthdayPicker;

    @FXML
    private TextField avatarField;

    @FXML
    private void initialize() {
        person = new Person();
        group.selectedToggleProperty().addListener((ob, oldValue, newValue) -> {
            RadioButton radioButton = (RadioButton) group.getSelectedToggle();
            if (radioButton != null){
                person.setGender(radioButton.getText());
            }
        });
    }
    /**
    public void setEditStage(Stage editStage) {
        this.editStage = editStage;
    }
     **/

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
    public void setArgs(Person person, String type) {
        this.person = person;
        this.type = type;
        nameField.setText(person.getName());
        clazzField.setText(person.getClazz());
        group.getToggles().forEach(toggle -> {
            if (toggle.getUserData().toString().equals(person.getGender())) {
                toggle.setSelected(true);
            }
        });
    }
    public void handleSubmit(/**ActionEvent actionEvent**/) {
        //Person person = new Person();
        person.setName(nameField.getText());
        person.setClazz(clazzField.getText());
        person.setAddress(addressField.getText());
        person.setAvatar(new Image(avatarField.getText()));
        person.setBirthday(birthdayPicker.getValue());
        if(this.type.equals(AppConstant.NEW_PERSON)) {
            mainApp.getPersonData().add(person);
        }
        mainApp.showPerson();

        /**
        //单选按钮设置分组
        ToggleGroup group = new ToggleGroup();
        maleButton.setToggleGroup(group);
        femaleButton.setToggleGroup(group);
        //注意性别单选按钮的写法
        group.selectedToggleProperty().addListener((ov, oldVal, newVal) -> {
            person.setGender(group.getSelectedToggle().getUserData().toString());
        });
        mainApp.getPersonData().add(person);
        editStage.close();
        mainApp.getStage().setIconified(false);
         **/
    }


    public void handleCancel(/*ActionEvent actionEvent*/) {
        /**
         editStage.close();
         mainApp.getStage().setIconified(false);
         **/
        mainApp.showPerson();
    }
}