package sample.teacher;

import Class_folder.Excursion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class excursions_Controller implements Initializable {
    @FXML
    private TableView<Excursion> table;
    @FXML
    private TableColumn<Excursion, String> ex_name;
    @FXML
    private TableColumn<Excursion, String> ex_date;
    @FXML
    private TableColumn<Excursion, Boolean> select;
    //@FXML
    //private TableColumn<Excursion, String> ex_title;
    // private  SimpleDateFormat;
    //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    @FXML
    public void click_Excursion(javafx.event.ActionEvent actionEvent) throws IOException { //create excursion button listener
        Node node = (Node) actionEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = stage.getScene();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("excursions_create.fxml"));
        Parent root = (Parent) fxmlLoader.load();

        scene.setRoot(root);
    }

    private final ObservableList<Excursion> list = FXCollections.observableArrayList(
            new Excursion("��������� ������� ���� �����", "�������� ��� ������� ��� ��������� ��� ��� �����", "�����", LocalDate.now(), 30),
            new Excursion("�������� ������� ��� ����", "�������� ��� ���� ��� ��� �����", "�����", LocalDate.now(), 60),
            new Excursion("��������� ������� ��� �������", "�������� ��� ������� ��� ��� ������ ������ ��� ���������", "�������", LocalDate.now(), 90)
    );
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ex_name.setCellValueFactory(new PropertyValueFactory<Excursion, String>("title"));
        ex_date.setCellValueFactory(new PropertyValueFactory<>("date"));
        select.setCellValueFactory(new PropertyValueFactory<>("check"));

        //ex_title.setCellValueFactory(new PropertyValueFactory<Excursion, String>("destination"));
        //ex_name.setCellValueFactory(cellData -> cellData.getValue().getDestination());
        table.setItems(list);
        //table.getColumns().addAll(ex_name);

    }


}
