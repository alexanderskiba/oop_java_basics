package Example1;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.format.DateTimeParseException;

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
        //Test for converting
        String str = "2025-11-13T17:25:00Z";
        System.out.println(StringToTimestamp(str));
    }


    private static Timestamp StringToTimestamp(String string) {
        try {
            Instant instant = Instant.parse(string);
            return Timestamp.from(instant);
        } catch (DateTimeParseException e) {
            return null;
        }
    }
}
