package sample.student;

import Class_folder.Grade;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class ProgressController implements Initializable {
    @FXML
    private TableColumn grade_no_id;
    @FXML
    private TableColumn grade_title_id;
    @FXML
    private TableView grade_table_id;
    @FXML
    private ChoiceBox course_box_id;
    String[] courses_array;

    private final ObservableList<Grade> list = FXCollections.observableArrayList(
            new Grade(13, "Διαγώνισμα τετραμήνου"),
            new Grade(17, "Πρόχειρο διαγώνισμα απροειδοποίητο"),
            new Grade(20, "Προφορική εξέταση 24/5"),
            new Grade(15, "Διαγώνισμα τετραμήνου"),
            new Grade(17, "Άσκήσεις 22/2"),
            new Grade(20, "Προφορική εξέταση 15/1")
    );
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //search db for students
        courses_array = new String[]{"Μαθηματικά", "Ιστορία", "Γεωμετρία", "Γλώσσα", "Κείμενα"};
        for (int i = 0; i<courses_array.length; i++) {
            course_box_id.getItems().add(courses_array[i]);
        }
    }

    public void select_Course(ActionEvent mouseEvent) {
        String course =(String) course_box_id.getValue();
        //getGrades() for the selected course
        grade_title_id.setCellValueFactory(new PropertyValueFactory<Grade, String>("grade_title"));
        grade_no_id.setCellValueFactory(new PropertyValueFactory<Grade, Integer>("grade_no"));

        grade_table_id.setItems(list);
    }
}