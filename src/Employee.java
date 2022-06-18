public class Employee {
    private int identification;
    private double salary;
    private String name;
    private String lastname;

    public Employee() {
    }

    public Employee(int identification, double salary, String name, String lastname) {
        this.identification = identification;
        this.salary = salary;
        this.name = name;
        this.lastname = lastname;
    }

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
