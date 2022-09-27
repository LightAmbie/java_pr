package mirea.ru.lazarev_pavel.kvbo0121.pr3.frmt;

public class Employee {
    private String fullname;
    private float salary;


    public Employee(String fullname, float salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
