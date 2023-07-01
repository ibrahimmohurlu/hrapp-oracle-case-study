import java.util.Optional;

public class Department {
    private final int DEPARTMENT_CAPACITY = 10;
    private final Employee[] employees = new Employee[DEPARTMENT_CAPACITY];
    private int lastIndex = 0;
    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee[] getEmployees() {
        Employee[] employeeList = new Employee[lastIndex];
        for (int i = 0; i < lastIndex; i++) {
            Employee currentEmployee = employees[i];
            employeeList[i] = currentEmployee;
        }
        return employeeList;
    }

    public void addEmployee(Employee employee) {
        try {
            employees[lastIndex] = employee;
            lastIndex++;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Department capacity is full!");
        }
    }

    public int getNumberOfCurrentEmployees() {
        return lastIndex;
    }

    public Optional<Employee> getEmployeeById(int id) {
        for (Employee currentEmployee : employees) {
            if (currentEmployee != null && currentEmployee.getId() == id) {
                return Optional.of(currentEmployee);
            }
        }
        return null;
    }

    public double getTotalSalary() {
        double total = 0;
        for (Employee currentEmployee : employees) {
            if (currentEmployee == null) {
                continue;
            }
            total += currentEmployee.getSalary();
        }
        return total;
    }

    public double getAverageSalary() {
        double total = 0;
        for (Employee currentEmployee : employees) {
            if (currentEmployee == null) {
                continue;
            }
            total += currentEmployee.getSalary();
        }
        return lastIndex != 0 ? total / lastIndex : 0;
    }

    @Override
    public String toString() {
        return String.format("%s Department: { capacity:%d, currentEmployeeCount: %d }", departmentName, DEPARTMENT_CAPACITY, lastIndex);
    }
}
