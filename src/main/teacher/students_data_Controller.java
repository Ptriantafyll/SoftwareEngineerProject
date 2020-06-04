package main.teacher;

import Class_folder.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class students_data_Controller implements Initializable {

    @FXML
    public void click_Excursion(javafx.event.ActionEvent actionEvent) throws IOException { //create excursion button listener
        Node node = (Node) actionEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = stage.getScene();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("excursions.fxml"));
        var root = (Parent) fxmlLoader.load();

        scene.setRoot(root);
    }
    public void click_Grades(javafx.event.ActionEvent actionEvent) throws IOException {
        Node node = (Node) actionEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = stage.getScene();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("grades_main.fxml"));
        var root = (Parent) fxmlLoader.load();

        scene.setRoot(root);
    }
    final ObservableList<Student> stlist = FXCollections.observableArrayList(
            new Student("st15","����������" ,"����������"),
            new Student("st16", "������������","������"),
            new Student("st17","��������", "������"),
            new Student("st18","��������", "��������"),
            new Student("st19","�����������", "��������"),
            new Student("st20","����������","�������"),
            new Student("st21","�������","�������"),
            new Student("st22","��������", "�����������"),
            new Student("st23","�������", "����������"),
            new Student("st24","��������","�������"),
            new Student("st25","�����", "��������" ),
            new Student("st26","������������������","����������"),
            new Student("st27","���������������","������"),
            new Student("st28","�����������", "�����")
    );

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
