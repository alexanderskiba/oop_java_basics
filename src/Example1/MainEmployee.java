package Example1;

import java.util.Scanner;

class MainEmployee {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Employee employee = new Employee();

        employee.lastName = scan.next();
        employee.sex = scan.next();
        employee.age = scan.nextInt();
        employee.salary = scan.nextInt();
        if (employee.isPensioner()){
            employee.changeSalary(0.9);
        }

        employee.show();

    }
}
