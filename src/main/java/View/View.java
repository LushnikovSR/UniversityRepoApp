package View;

import Controller.Controller;
import Controller.Interfaces.IController;
import Controller.Interfaces.IView;
import Model.Domain.Student;

import java.util.List;

public class View implements IView {
    private IController controller;

//    public View(Controller controller){
//        this.controller = controller;
//    }
    public void setController(Controller controller){
        this.controller = controller;
    }

    public void printAllStudents(List<Student> students){
        System.out.println("----------- Список студентов ----------");
        for (Student student: students) {
            System.out.println(student);
        }
    }

    public void callModel(){
        controller.update();
    }
}
