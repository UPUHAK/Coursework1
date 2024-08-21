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

        indexSalaryByPercentage(employees, 10);

        printEmployeeArray(employees);

        System.out.println(minSalaryInDept(employees, 3));

        System.out.println(maxSalaryInDept(employees, 5));

        System.out.println(totalSalaryInDept(employees, 4));

        System.out.println(averageSalaryInDept(employees, 1));

        indexSalaryByPercentageInDept(employees, 2, 3);

        printEmployeeArray(employees);

        printDepartment(employees, 4);

        listSalariesLessThan(employees, 60000);

        listSalariesNoLessThan(employees, 80000);

    }

    public static void printEmployeeArray(Employee[] arr) {
        for (Employee element : arr) {
            if (element != null) {
                System.out.println(element);
            }
        }
    }

    public static int totalSalary(Employee[] arr) {
        int result = 0;
        for (Employee element : arr) {
            if (element != null) {
                result += element.getSalary();
            }
        }
        return result;
    }

    public static int minSalary(Employee[] arr) {
        int min = arr[0].getSalary();
        for (Employee element : arr) {
            if (element != null && element.getSalary() < min) {
                min = element.getSalary();
            }
        }
        return min;
    }

    public static int maxSalary(Employee[] arr) {
        int max = arr[0].getSalary();
        for (Employee element : arr) {
            if (element != null && element.getSalary() > max) {
                max = element.getSalary();
            }
        }
        return max;
    }

    public static int averageSalary(Employee[] arr) {
        return totalSalary(arr) / Employee.getCounter();
    }

    public static void printNameEmployeeArray(Employee[] arr) {
        for (Employee element : arr) {
            if (element != null) {
                System.out.println(element.getName());
            }
        }
    }

    public static Employee[] indexSalaryByPercentage(Employee[] arr, int percent) {
        for (Employee element : arr) {
            if (element != null) {
                element.setSalary(element.getSalary() + element.getSalary() * percent / 100);
            }
        }
        return arr;
    }

    public static int minSalaryInDept(Employee[] arr, int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Номер отдела должен быть от 1 до 5.");
        }
        int min = arr[0].getSalary();
        for (Employee element : arr) {
            if (element != null && element.getDepartment() == department && element.getSalary() < min) {
                min = element.getSalary();
            }
        }
        return min;
    }

    public static int maxSalaryInDept(Employee[] arr, int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Номер отдела должен быть от 1 до 5.");
        }
        int max = arr[0].getSalary();
        for (Employee element : arr) {
            if (element != null && element.getDepartment() == department && element.getSalary() > max) {
                max = element.getSalary();
            }
        }
        return max;
    }

    public static int totalSalaryInDept(Employee[] arr, int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Номер отдела должен быть от 1 до 5.");
        }
        int result = 0;
        for (Employee element : arr) {
            if (element != null && element.getDepartment() == department) {
                result += element.getSalary();
            }
        }
        return result;
    }

    public static int averageSalaryInDept(Employee[] arr, int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Номер отдела должен быть от 1 до 5.");
        }
        int counter = 0;
        for (Employee element : arr) {
            if (element != null && element.getDepartment() == department) {
                counter++;
            }
        }
        return totalSalaryInDept(arr, department) / counter;
    }

    public static Employee[] indexSalaryByPercentageInDept(Employee[] arr, int department, int percent) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Номер отдела должен быть от 1 до 5.");
        }
        for (Employee element : arr) {
            if (element != null && element.getDepartment() == department) {
                element.setSalary(element.getSalary() + element.getSalary() * percent / 100);
            }
        }
        return arr;
    }

    public static void printDepartment(Employee[] arr, int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Номер отдела должен быть от 1 до 5.");
        }
        for (Employee element : arr) {
            if (element != null && element.getDepartment() == department) {
                System.out.println("Сотрудник " + element.getName() + " Зарплата " + element.getSalary() + " руб.");
            }
        }
    }

    public static void listSalariesLessThan(Employee[] arr, int number) {
        System.out.println("Список сотрудников с зарплатой менее " + number + ":");
        for (Employee element : arr) {
            if (element != null && element.getSalary() < number) {
                System.out.println("Сотрудник " + element.getName() + " (id " + element.getId() + ") Зарплата " + element.getSalary());
            }
        }
    }

    public static void listSalariesNoLessThan(Employee[] arr, int number) {
        System.out.println("Список сотрудников с зарплатой не менее " + number + ":");
        for (Employee element : arr) {
            if (element != null && element.getSalary() >= number) {
                System.out.println("Сотрудник " + element.getName() + " (id " + element.getId() + ") Зарплата " + element.getSalary());
            }
        }
    }

}