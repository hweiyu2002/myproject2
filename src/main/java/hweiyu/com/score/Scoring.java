package hweiyu.com.score;

public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student("Jack",60,58);
        Student hank = new Student("Hank",60,70);
        GraduateStudent jane = new GraduateStudent("Jane",40,66,88);
        jack.print();
        hank.print();
        jane.print();
    }
}

