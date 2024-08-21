import java.util.Objects;

public class Employee {
    private String name;
    private int salary;
    private int department;
    private static int counter = 0;
    private int id;

    public Employee(String name, int salary, int department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        counter++;
        this.id = counter;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Зарплата не может быть отрицательной.");
        }
        this.salary = salary;
    }

    public void setDepartment(byte department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Номер отдела должен быть от 1 до 5.");
        }
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Сотрудник " + name + ", отдел № " + department + ". Зарплата " + salary + " руб.";
    }

}
