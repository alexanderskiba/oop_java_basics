package Example1;

public class Main {
    public static void main(String[] args) {
        Student[] gruppa = new Student[3];
        gruppa[0] = new Student(); // Конструктор без параметров
        gruppa[1] = new Student("Иванов", 8.3, 20); // конструктор с тремя параметрами
        gruppa[2] = new Student("Петров", 22); // конструктор с тремя параметрами
        for(int i = 0; i < gruppa.length; i ++) {
            if(gruppa[i] != null) { // убедимся, что объект действительно создан
                System.out.println(gruppa[i].calculateScholarship()); // Вывод стипендии каждого стедента
            }
        }
    }
}
