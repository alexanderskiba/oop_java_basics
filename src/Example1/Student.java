package Example1;

public class Student {
    String surname;
    double averageMark;
    int age;
    static int baseScolarship = 110;
    int calculateScolarShip() {
        if(averageMark >= 9) {
            return (int)(baseScolarship * 1.6);
        } else if(averageMark >=8) {
            return (int)(baseScolarship * 1.4);
        } else if (averageMark >=6) {
            return (int)(baseScolarship * 1.2);
        } else if(averageMark >= 5) {
            return baseScolarship;
        } else {
            return 0;
        }
    }

    static void raseScholarship(double k) {
        baseScolarship = (int)(baseScolarship * k);
    }
}
