package aula11.exercicio2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;


public class Gradebook extends Student {
    

    public Gradebook(String name, List<Double> grades, HashMap<String, Float> gradebook) {
        super(name, grades);
    }

    public Double separateGrades(List<Double> grades){
        for (Double grade : grades) {
            
        }
    }

    public void addStudent(Student student, HashMap<String, List<Double> > gradebook) {
        gradebook.put(getName(), getGrades());
    }

    public void removeStudent(HashMap<String,List<Double>> gradebook){
        for(String stdt : gradebook.keySet()){
            if(stdt.equals()){
                gradebook.remove(stdt);
            }
        }
    }

    public Student getStudent(String name, ArrayList<Student> gradebook){
        for (Student student : gradebook) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }



    public double calculateAverageGrade(String name, ArrayList<Student> gradebook){
        Student student = getStudent(name, gradebook);
        if (student == null) {
            return 0.0;
        }
        else{
            double sum = 0.0;
            for (double grade : student.getGrades()) {
                sum += grade;
            }
            return sum/student.getGrades().size();

        }
    }

    public String PrintAllStudent (ArrayList<Student> gradebook){
        return for(Student student : gradebook){System.out.println(student.getName());};
    }
}
