package Example1;

public class Demo {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.surname = "Иванов";
        System.out.println(student1.calculateScolarShip());
        Student.raseScholarship(1.2);
        student1.raseScholarship(1.2);
    }

}
