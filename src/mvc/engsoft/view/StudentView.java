package mvc.engsoft.view;

import javax.swing.JOptionPane;

public class StudentView {
    public void viewDetails(String viewName, String viewRoll){
        viewName = JOptionPane.showInputDialog("Enter the student name");
        viewRoll = JOptionPane.showInputDialog("Enter the roll number");
        JOptionPane.showMessageDialog(null, "Student: " + viewName + "\n" + "Roll: " + viewRoll);

    }

}
