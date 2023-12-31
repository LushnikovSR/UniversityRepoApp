package Controller;

import Controller.Interfaces.IController;
import Controller.Interfaces.IModel;
import Controller.Interfaces.IView;
import Model.Domain.Student;
import View.View;
import Model.Model;

import java.util.List;

public class Controller implements IController {
    IView view;
    IModel model;
    List<Student> students;

    public Controller(IView view, IModel model) {
        this.view = view;
        this.model = model;
    }

    public boolean test(List<Student> students){
        if (students.size()>0) return true;
        else return false;
    }

    public void update(){
        //MVP
        students = model.getAllStudents();
        if(test(students)){
            view.printAllStudents(students);
        } else {
            System.out.println("Model is empty");
        }

        //MVC
//        view.printAllStudents(model.getAllStudents());
    }
}
