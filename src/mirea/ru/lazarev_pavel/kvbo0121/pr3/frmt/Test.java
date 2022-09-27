package mirea.ru.lazarev_pavel.kvbo0121.pr3.frmt;


public class Test {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Walter White", 15000f);
        employees[1] = new Employee("Jesse Pinkman", 20000f);
        employees[2] = new Employee("Obama", 100f);

        Report.generateReport(employees);
    }
}
