package Model;

import Controller.Interfaces.IModel;
import Model.Domain.Student;

import java.util.List;

public class Model implements IModel {
    List<Student> students;

    public Model(List<Student> students){
        this.students = students;
    }

    @Override
    public List<Student> getAllStudents(){
        return students;
    }
}
