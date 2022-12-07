package mvc.engsoft.controller;

import mvc.engsoft.model.Student;
import mvc.engsoft.view.StudentView;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public String getStudentNumRoll() {
        return model.getNumRoll();
    }

    public void setStudentNumRoll(String numRoll) {
        model.setNumRoll(numRoll);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public void updateView(){
        view.viewDetails(model.getName(), model.getNumRoll());
    }


}
