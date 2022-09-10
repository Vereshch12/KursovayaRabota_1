public class Employee {
    private final String name;
    private String departament;
    private int salary;
    private int id;

    public Employee(String name, String departament, int salary) {
        this.name = name;
        this.departament = departament;
        this.salary = salary;
        this.id = Main.id;
        Main.id++;
    }

    public String getName() {
        return name;
    }

    public String getDepartament() {
        return departament;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " : " + name + " : " + departament + " : " + salary + " : ";
    }
}
