import java.util.Arrays;

public class Main {
    static int id = 1;
    private static Employee[] archiveOfEmployees = new Employee[10];

    private static void addEmployee(Employee employee){
        for (int i = 0; i < archiveOfEmployees.length; i++){
            if (archiveOfEmployees[i] == null){
                archiveOfEmployees[i] = employee;
                break;
            }
        }
    }

    private static void printAllEmployees(){
        int i = 0;
        System.out.println("\nСписок всех сотрудников:");
        System.out.println("____________________________________________________________________");
        System.out.println("| id |" + "ФИО                           |" + "Отдел          |" + "Зарплата      |");
        while (archiveOfEmployees[i] != null){
            System.out.printf("| %-3d|%-30s|%-15s|%-14d|\n",archiveOfEmployees[i].getId(), archiveOfEmployees[i].getName(), archiveOfEmployees[i].getDepartament(), archiveOfEmployees[i].getSalary());
            i++;
        }
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
    }

    private static int allSalaries(){
        int i = 0;
        int sumOfSalaries = 0;
        while (archiveOfEmployees[i] != null){
             sumOfSalaries += archiveOfEmployees[i].getSalary();
             i++;
        }
        return sumOfSalaries;
    }

    private static int minSalary(){
        int i = 0;
        int minSalary = Integer.MAX_VALUE;
        while (archiveOfEmployees[i] != null){
            if (minSalary > archiveOfEmployees[i].getSalary()){
                minSalary = archiveOfEmployees[i].getSalary();
            }
            i++;
        }
        return minSalary;
    }

    private static void printEmployeesWithMinSalary(){
        int i = 0;
        int id = 1;
        System.out.printf("\nСписок сотрудников с минимальной зарплатой (%d рублей):\n", minSalary());
        while (archiveOfEmployees[i] != null){
            if (archiveOfEmployees[i].getSalary() == minSalary()){
                System.out.printf("%d) %s\n", id++, archiveOfEmployees[i].getName());
            }
            i++;
        }
    }

    private static int maxSalary(){
        int i = 0;
        int maxSalary = Integer.MIN_VALUE;
        while (archiveOfEmployees[i] != null){
            if (maxSalary < archiveOfEmployees[i].getSalary()){
                maxSalary = archiveOfEmployees[i].getSalary();
            }
            i++;
        }
        return maxSalary;
    }

    private static void printEmployeesWithMaxSalary(){
        int i = 0;
        int id = 1;
        System.out.printf("\nСписок сотрудников с максимальной зарплатой (%d рублей):\n", maxSalary());
        while (archiveOfEmployees[i] != null){
            if (archiveOfEmployees[i].getSalary() == maxSalary()){
                System.out.printf("%d) %s\n", id++, archiveOfEmployees[i].getName());
            }
            i++;
        }
    }

    private static double averageSalary(){
        double averageSalary = allSalaries()/(id-1);
        return averageSalary;
    }

    private static void printAllNamesOfEmployees(){
        int i = 0;
        System.out.println("\nСписок ФИО всех сотрудников:");
        while (archiveOfEmployees[i] != null){
            System.out.printf("%s\n", archiveOfEmployees[i].getName());
            i++;
        }
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Иванов Иван Иванович", "First", 30000);
        System.out.println(employee1);
        Employee employee2 = new Employee("Смирнов Федор Николаевич", "First", 25000);
        System.out.println(employee1);
        System.out.println(employee2);
        employee2.setDepartament("Second");
        employee2.setSalary(20000);
        System.out.println(employee2);
        addEmployee(employee1);
        addEmployee(employee2);
        System.out.println((Arrays.toString(archiveOfEmployees)));
        printAllEmployees();
        Employee employee3 = new Employee("Соколов Петр Васильевич", "First", 250000);
        addEmployee(employee3);
        System.out.println(employee3);
        printAllEmployees();
        System.out.printf("\nЗатраты на зарплаты всех сотрудников: %d", allSalaries());
        System.out.println("\nminSalary() = " + minSalary());
        printEmployeesWithMinSalary();
        Employee employee4 = new Employee("Никитин Иван Андреевич", "12", 20000);
        addEmployee(employee4);
        printEmployeesWithMinSalary();
        System.out.println("\nmaxSalary() = " + maxSalary());
        printEmployeesWithMaxSalary();
        printAllEmployees();
        System.out.println("\naverageSalary() = " + averageSalary());
        printAllNamesOfEmployees();
    }
}