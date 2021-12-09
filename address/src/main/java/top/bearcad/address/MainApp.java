package top.bearcad.address;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import top.bearcad.address.config.AppConfig;
import top.bearcad.address.model.Person;
import top.bearcad.address.view.BirthdayStatisticsController;
import top.bearcad.address.view.PersonController;
import top.bearcad.address.view.PersonEditController;
import top.bearcad.address.view.RootController;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Objects;

public class MainApp extends Application {
    private final ObservableList<Person> personDate = FXCollections.observableArrayList();

    private Stage primaryStage;

    private BorderPane rootLayout;

    public MainApp(){
        personDate.add(new Person("漩涡鸣人", "天秤座", "男", "火之国·木叶隐村",
                LocalDate.of(2000, 10, 10), new Image("https://i.loli.net/2021/10/10/VfLcNB3GyTur941.png")));
        personDate.add(new Person("宇智波佐助", "狮子座", "男", "火之国·木叶隐村",
                LocalDate.of(2000, 7, 23), new Image("https://i.loli.net/2021/10/10/QvUjGT9sPAbtZOx.jpg")));
        personDate.add(new Person("春野樱", "白羊座", "女", "火之国·木叶隐村",
                LocalDate.of(2000, 3, 28), new Image("https://i.loli.net/2021/10/10/UX7tiPyA5rIVNaM.png")));
        personDate.add(new Person("纲手", "狮子座", "女", "火之国·木叶隐村",
                LocalDate.of(1980, 8, 02), new Image("https://i.loli.net/2021/10/10/KLxjMXs1oR8Inq2.jpg")));
        personDate.add(new Person("自来也", "天蝎座", "男", "火之国·木叶隐村",
                LocalDate.of(1980, 11, 11), new Image("https://i.loli.net/2021/10/10/hGdkIoQYw3DaWqn.jpg")));
        personDate.add(new Person("旗木卡卡西", "处女座", "男", "火之国·木叶隐村",
                LocalDate.of(1980, 9, 15), new Image("https://i.loli.net/2021/10/10/AazXvpFZ6He9Tcn.jpg")));
        personDate.add(new Person("我爱罗", "摩羯座", "男", "风之国·砂隐村",
                LocalDate.of(2000, 1, 11), new Image("https://i.loli.net/2021/10/10/VySHmA8dNYFn24E.jpg")));
        personDate.add(new Person("日向雏田", "摩羯座", "女", "火之国·木叶隐村",
                LocalDate.of(2000, 12, 27), new Image("https://i.loli.net/2021/10/10/nk5GZF4Pa1Bdvlp.jpg")));
        personDate.add(new Person("大蛇丸", "天蝎座", "男", "火之国木叶隐村",
                LocalDate.of(1980, 10, 27), new Image("https://i.loli.net/2021/10/10/gdP78aj6WvyDznq.jpg")));
        personDate.add(new Person("李洛克", "射手座", "男", "火之国·木叶隐村",
                LocalDate.of(2000, 11, 27), new Image("https://i.loli.net/2021/10/10/jxuYflNJcpnbvq7.jpg")));

    }

    public Stage getStage() {
        return this.primaryStage;
    }
    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.getIcons().add(new Image(Objects.requireNonNull(MainApp.class.getResourceAsStream(AppConfig.img))));
        primaryStage.setTitle(AppConfig.title);
        initRootLayout();
        showPerson();
    }

    public void initRootLayout() {
        try {
            //加载根布局
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(MainApp.class.getResource("view/root-layout.fxml"));
            rootLayout = fxmlLoader.load();
            RootController controller = fxmlLoader.getController();
            controller.setMainApp(this);
            //创建以根布局为内容的场景
            Scene scene = new Scene(rootLayout, AppConfig.stageWidth,AppConfig.stageHeight);
            //加载全局样式
            scene.getStylesheets().add(Objects.requireNonNull(MainApp.class.getResource("css/style.css")).toExternalForm());
            //主窗体加入根布局
            primaryStage.setScene(scene);
            primaryStage.setResizable(AppConfig.stageResizable);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showPerson() {
        try {
            //加载人员显示面板
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(MainApp.class.getResource("view/person.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();
            //根布局中间部分加入人员显示面板
            rootLayout.setCenter(anchorPane);
            //获得PersonController控制器
            PersonController controller = fxmlLoader.getController();
            //向控制器传参
            controller.setMainApp(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
    public void showNewPersonStage() {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(MainApp.class.getResource("view/person-edit.fxml"));
            AnchorPane editPersonPane = fxmlLoader.load();
            //根布局中间部分加入人员编辑面板
            rootLayout.setCenter(editPersonPane);
            /**Stage editStage = new Stage();
            editStage.setTitle("Edit Person");
            Scene scene = new Scene(anchorPane, 640, 480);
            editStage.setScene(scene);

            //获得PersonEditController控制器
            PersonEditController controller = fxmlLoader.getController();
            //向控制器传参
            controller.setMainApp(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }**/


    public void showEditPerson(Person person,String type){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(MainApp.class.getResource("view/person-edit.fxml"));
            AnchorPane editPersonPane = fxmlLoader.load();
            //根布局中间部分加入人员编辑面板
            rootLayout.setCenter(editPersonPane);
            //获得PersonEditController控制器
            PersonEditController controller = fxmlLoader.getController();
            controller.setArgs(person,type);
            controller.setMainApp(this);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void showBirthdayStatistics(){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/birthday-statistics.fxml"));
            AnchorPane page = loader.load();
            Stage dialogStage = new Stage();
            dialogStage.setTitle("birthday Statistics");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);
            BirthdayStatisticsController controller = loader.getController();
            controller.setPersonData(personDate);
            dialogStage.show();
        }catch(IOException e){
            e.printStackTrace();
        }
    }


    /**@Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("view/person.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 980, 600);
        PersonController controller = fxmlLoader.getController();
        controller.setMainApp(this);
        stage.setTitle("AddressBook");
        stage.setScene(scene);
        stage.show();
    }
    **/

    public ObservableList<Person> getPersonData() {
        return personDate;
    }

    public static void main(String[] args) {

        launch();
    }
}