package mirea.ru.lazarev_pavel.kvbo0121.pr3.frmt;

public class Report {
    public static void generateReport(Employee[] employees){
        for(Employee e : employees){
            System.out.println("Name: " + e.getFullname());
            System.out.print("Salary: ");
            System.out.printf("%10.2f", e.getSalary());
            System.out.println();
        }

    }
}
