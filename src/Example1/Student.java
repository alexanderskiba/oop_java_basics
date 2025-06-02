package Example1;

public class Student {
    private String surname;  // у каждого студента свое значение
    private double averageMark; // у каждого студента свое значение
    private int age; // у каждого студента свое значение
    public static int baseScholarship = 110; // одно значение у всех студентов

    public Student() {} // конструктор без параметров, дефолтные значения

    public Student(String surname, double averageMark, int age) { // конструктор заполняет все поля
        this.surname = surname;
        this.averageMark = averageMark;
        if(age > 0) {
            this.age = age;
        } else {
            this.age = 18;
        }
    }

    public Student(String surname, int age) { // конструктор заполняет два поля
        this.surname = surname;
        if(age > 0) {
            this.age = age;
        } else {
            this.age = 18;
        }
    }

    int calculateScholarship() {
        if(averageMark >= 9) {
            return (int)(baseScholarship * 1.6);
        } else if(averageMark >=8) {
            return (int)(baseScholarship * 1.4);
        } else if (averageMark >= 6) {
            return (int)(baseScholarship * 1.2);
        } else if (averageMark >= 5) {
            return baseScholarship;
        } else {
            return 0;
        }
    }


}
