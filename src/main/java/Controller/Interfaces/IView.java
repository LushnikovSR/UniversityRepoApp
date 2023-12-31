package Controller.Interfaces;

import Model.Domain.Student;
import Controller.Controller;

import java.util.List;

public interface IView {
    public void printAllStudents(List<Student> students);
    public void setController(Controller controller);
    public void callModel();

}
