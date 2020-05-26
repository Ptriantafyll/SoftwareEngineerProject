package sample.teacher;

import Class_folder.Grade;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;


public class gradebooks_Controller<gradeList> implements Initializable {
    @FXML
    private ListView gradeList;

    @FXML public void select_Gradebook(MouseEvent arg0) {
        System.out.println("clicked on " + gradeList.getSelectionModel().getSelectedItem());
    }
    private final ObservableList<Grade> list = FXCollections.observableArrayList(
        new Grade("A3","����������","����������","�3:������� �'���������"),
        new Grade("A3","����������","����������","�3:������� �'���������"),
        new Grade("A3","����������","�������","�3.������� �������"),
        new Grade("�3","����������","����������", "�3.��������� �'���������")
    );

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        gradeList.setCellFactory(param -> new ListCell<Grade>() {
            @Override
            protected void updateItem(Grade item, boolean empty) {
                super.updateItem(item, empty);

                if (empty || item == null || item.getGr_title() == null) {
                    setText(null);
                } else {
                    setText(item.getGr_title());
                }
            }
        });
        gradeList.setItems(list);
    }
}
