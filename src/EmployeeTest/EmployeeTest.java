package EmployeeTest;
import java.time.*;
/**
 * Ten program sprawdza działanie klasy Employee.
 * This program checks the functionality of the Employee class.
 *
 * @author Tomek
 *
 */
public class EmployeeTest {

    public static void main(String[] args) {

        //Wstawianie trzech obiektów pracowników do tablicy typu Employee o nazwie staff.
        //Inserting three employee objects into the Employee array named staff.
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Robert Siwiak ", 75000, 1987, 12, 15);
        staff[1] = new Employee("Jacek Cydejkko ", 50000, 1989, 10, 1);
        staff[2] = new Employee("Mariusz Romańczuk ", 40000, 1990, 3, 15);

        //Zwiększenie pensji wszystkich pracowników o 5%.
        //Increasing the salary of all employees by 5%.
        for (Employee e : staff)
            e.raiseSalary(5);

        //Drukowanie informacji o wszystkich obiektach klasy Employee.
        //Printing information about all Employee class objects.
        for(Employee e : staff)
            System.out.println("Name: " + e.getName()
                    + ", salary: " + e.getSalary()
                    + ", hireDay: " + e.getHireDay());
    }

}

class Employee{

    //pola
    private String name;
    private double salary;
    private LocalDate hireDay;

    //Konstruktor
    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, month);
    }

    //Metody
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
        //równierz poprawne
        //this.salary += raise;

    }
}
