package Example1;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.surname = "Иванов";
        student1.age = 19;
        student1.averageMark = 8.2;
        System.out.println(student1.calculateScolarShip());
        System.out.println(student1.baseScolarship);
        Student.raseScholarship(1.2);
    }
}
