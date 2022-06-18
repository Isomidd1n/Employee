public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setLastname("Husniddinov");
        employee.setName("Isomiddin");
        employee.setIdentification(123456789);
        employee.setSalary(123);
        System.out.println("Lastname: " + employee.getLastname());
        System.out.println("Name: " + employee.getName());
        System.out.println("Identification: " + employee.getIdentification());
        System.out.println("Salary: " + employee.getSalary());
    }
}
