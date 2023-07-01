public class Main {
    public static void main(String[] args) {
        System.out.println("HRApp Starting...");

        Employee exampleEmployee = new Employee(1, "John", 16456.15);
        System.out.println("Example Employee Object -> " + exampleEmployee);

        Department itDepartment = new Department("IT");
        itDepartment.addEmployee(exampleEmployee);
        itDepartment.addEmployee(new Employee(2, "Jasmin", 12489.25));
        itDepartment.addEmployee(new Employee(3, "Alex", 18732.45));
        itDepartment.addEmployee(new Employee(4, "David", 44852.54));

        System.out.println(itDepartment);
        Employee[] employees = itDepartment.getEmployees();
        System.out.println("Employee list:");
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
        }
        System.out.println("Employee with id 3 -> " + itDepartment.getEmployeeById(3));
        System.out.println("Total salary of the department:" + itDepartment.getTotalSalary());
        System.out.println("Average salary of the department:" + itDepartment.getAverageSalary());

    }
}