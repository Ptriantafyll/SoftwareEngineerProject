package Class_folder;

import javafx.beans.property.SimpleStringProperty;

import java.util.HashMap;
import java.util.Map;

public class Gradebook {

        private String gr_class_id;
        private String gr_course;
        private String gr_type; //final, semester or test grades
        private SimpleStringProperty gr_title;
        protected int gr_id;


        public int getGr_id() {
            return gr_id;
        }

        public void setGr_id(int gr_id) {
            this.gr_id = gr_id;
        }

        public Gradebook(String gr_class_id, String gr_course, String gr_type, String gr_title, int gr_id) {
            this.gr_class_id = gr_class_id;
            this.gr_course = gr_course;
            this.gr_type = gr_type;
            this.gr_title = new SimpleStringProperty(gr_title);
            this.gr_id = gr_id;
        }
        public Gradebook(String gr_class_id) {
            this.gr_class_id = gr_class_id;
        }

        public Gradebook() {
        }

        public Gradebook(int gr_id) {
            this.gr_id = gr_id;
        }

        public String getGr_class_id() {
            return gr_class_id;
        }

        public void setGr_class_id(String gr_class_id) {
            this.gr_class_id = gr_class_id;
        }

        public String getGr_course() {
            return gr_course;
        }

        public void setGr_course(String gr_course) {
            this.gr_course = gr_course;
        }

        public String getGr_type() {
            return gr_type;
        }

        public void setGr_type(String gr_type) {
            this.gr_type = gr_type;
        }

        public Map getGrades(int gr_id){
            //��������� ��� ���� ���������
            //��� ������ dummy data
           // Class_folder.Grade grade1 = new Class_folder.Grade(gr_id);
              Map<String, Integer>  class_grades = new HashMap<String, Integer>();
//            class_grades.put("���������� ����������", 6);
//            class_grades.put("������������ ������", 19);
//            class_grades.put("�������� ������", 16);
//            class_grades.put("�������� ��������", 18);
//            class_grades.put("����������� ��������", 9);
//            class_grades.put("���������� �������", 17);
//            class_grades.put("������� �������", 14);
//            class_grades.put("�������� �����������", 15);
//            class_grades.put("������� ����������", 15);
//            class_grades.put("�������� �������", 20);
//            class_grades.put("����� ��������", 13);
//            class_grades.put("������������������ ����������",19);
//            class_grades.put("��������������� ������", 10);
//            class_grades.put("����������� �����", 12);
            return class_grades;
        }
        public void editGrade(){

        }
        public boolean createGrade(){
            return true;
        }
        public boolean saveGrade(){
            return true;
        }
        public boolean sendGrade(){
            return true;
        }

        public void setGr_title(String gr_title1) {
            gr_title.set( gr_title1);
        }

        public String getGr_title() {
            return gr_title.get();
        }
    }


