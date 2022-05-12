package hweiyu.com.score;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student("Jack",60,58);
        Student hank = new Student("Hank",60,70);
        GraduateStudent jane = new GraduateStudent("Jane",40,66,88);
        List<Student> students = new ArrayList<>();
        students.add(jack);
        students.add(hank);
        students.add(jane);
        //for (int i = 0; i < students.size(); i++) {
        //    Student stu = students.get(i);
            for(Student stu : students){
            stu.print();
        }
    }
}

