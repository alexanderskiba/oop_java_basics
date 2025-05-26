package Example1;

class Employee {
    String lastName;
    String sex;
    int age;
    int salary;

    boolean isPensioner() {
        return sex.equals("male") && age >= 63 || sex.equals("female") && age >= 58;
    }

    void changeSalary(double koef) {
        salary*=koef;
    }

    void show() {
        System.out.printf("%s;%s;%d;%d", lastName, sex, age, salary);
    }
}
