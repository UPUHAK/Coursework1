public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Иванов И.И.", 60000, 1);
        employees[1] = new Employee("Петров П.П.", 45000, 2);
        employees[2] = new Employee("Сидоров С.С.", 30000, 2);
        employees[3] = new Employee("Васильев В.В.", 65000, 5);
        employees[4] = new Employee("Сергеев С.С.", 70000, 4);
        employees[5] = new Employee("Михайлов М.М.", 80000, 3);
        employees[6] = new Employee("Пантелеев П.П.", 75000, 2);
        employees[7] = new Employee("Кириллов К.К.", 60000, 1);
        employees[8] = new Employee("Елисеев Е.Е.", 63000, 4);
        employees[9] = new Employee("Максимов М.М.", 55000, 3);

        printEmployeeArray(employees);

        System.out.println(totalSalary(employees));

        System.out.println(minSalary(employees));

        System.out.println(maxSalary(employees));

        System.out.println(averageSalary(employees));

        printNameEmployeeArray(employees);

    }

    public static void printEmployeeArray(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
            }
        }
    }

    public static int totalSalary(Employee[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                result += arr[i].getSalary();
            }
        }
        return result;
    }

    public static int minSalary(Employee[] arr) {
        int min = arr[0].getSalary();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getSalary() < min) {
                min = arr[i].getSalary();
            }
        }
        return min;
    }

    public static int maxSalary(Employee[] arr) {
        int max = arr[0].getSalary();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getSalary() > max) {
                max = arr[i].getSalary();
            }
        }
        return max;
    }

    public static int averageSalary(Employee[] arr) {
        return totalSalary(arr) / Employee.getCounter();
    }

    public static void printNameEmployeeArray(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].getName());
            }
        }
    }

}