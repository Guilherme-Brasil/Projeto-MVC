import mvc.engsoft.controller.StudentController;
import mvc.engsoft.model.Student;
import mvc.engsoft.view.StudentView;

public class Main {
    public static void main(String[] args){
        Student student = new Student();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView();
    }
}
