public class EmployeeBook {

    private static final Employee[] employees = {

            new Employee("Петров П.П.", 45000, 2),
            new Employee("Иванов И.И.", 60000, 1),
            new Employee("Сидоров С.С.", 30000, 2),
            new Employee("Васильев В.В.", 65000, 5),
            new Employee("Сергеев С.С.", 70000, 4),
            new Employee("Михайлов М.М.", 80000, 3),
            new Employee("Пантелеев П.П.", 75000, 2),
            new Employee("Кириллов К.К.", 60000, 1),
            new Employee("Елисеев Е.Е.", 63000, 4),
            new Employee("Максимов М.М.", 55000, 3)
    };


    public void printEmployeeArray() {
        for (Employee element : employees) {
            if (element != null) {
                System.out.println(element);
            }
        }
    }

    public int totalSalary() {
        int result = 0;
        for (Employee element : employees) {
            if (element != null) {
                result += element.getSalary();
            }
        }
        return result;
    }

    public int minSalary() {
        int min = employees[0].getSalary();
        for (Employee element : employees) {
            if (element != null && element.getSalary() < min) {
                min = element.getSalary();
            }
        }
        return min;
    }

    public int maxSalary() {
        int max = employees[0].getSalary();
        for (Employee element : employees) {
            if (element != null && element.getSalary() > max) {
                max = element.getSalary();
            }
        }
        return max;
    }

    public int numberOfEmploees() {
        int numberOfEmploees = 0;
        for (Employee element : employees) {
            if (element != null) {
                numberOfEmploees++;
            }
        }
        return numberOfEmploees;
    }

    public int averageSalary() {
        return totalSalary() / numberOfEmploees();
    }

    public void printNameEmployeeArray() {
        for (Employee element : employees) {
            if (element != null) {
                System.out.println(element.getName());
            }
        }
    }

    public void indexSalaryByPercentage(int percent) {
        for (Employee element : employees) {
            if (element != null) {
                element.setSalary(element.getSalary() + element.getSalary() * percent / 100);
            }
        }
    }

    public int minSalaryInDept(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Номер отдела должен быть от 1 до 5.");
        }
        int min = employees[0].getSalary();
        for (Employee element : employees) {
            if (element != null && element.getDepartment() == department && element.getSalary() < min) {
                min = element.getSalary();
            }
        }
        return min;
    }

    public int maxSalaryInDept(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Номер отдела должен быть от 1 до 5.");
        }
        int max = employees[0].getSalary();
        for (Employee element : employees) {
            if (element != null && element.getDepartment() == department && element.getSalary() > max) {
                max = element.getSalary();
            }
        }
        return max;
    }

    public int totalSalaryInDept(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Номер отдела должен быть от 1 до 5.");
        }
        int result = 0;
        for (Employee element : EmployeeBook.employees) {
            if (element != null && element.getDepartment() == department) {
                result += element.getSalary();
            }
        }
        return result;
    }

    public int averageSalaryInDept(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Номер отдела должен быть от 1 до 5.");
        }
        int counter = 0;
        for (Employee element : employees) {
            if (element != null && element.getDepartment() == department) {
                counter++;
            }
        }
        return totalSalaryInDept(department) / counter;
    }

    public void indexSalaryByPercentageInDept(int department, int percent) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Номер отдела должен быть от 1 до 5.");
        }
        for (Employee element : employees) {
            if (element != null && element.getDepartment() == department) {
                element.setSalary(element.getSalary() + element.getSalary() * percent / 100);
            }
        }
    }

    public void printDepartment(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Номер отдела должен быть от 1 до 5.");
        }
        for (Employee element : employees) {
            if (element != null && element.getDepartment() == department) {
                System.out.println("Сотрудник " + element.getName() + " Зарплата " + element.getSalary() + " руб.");
            }
        }
    }

    public void listSalariesLessThan(int number) {
        System.out.println("Список сотрудников с зарплатой менее " + number + ":");
        for (Employee element : employees) {
            if (element != null && element.getSalary() < number) {
                System.out.println("Сотрудник " + element.getName() + " (id " + element.getId() + ") Зарплата " + element.getSalary());
            }
        }
    }

    public void listSalariesNoLessThan(int number) {
        System.out.println("Список сотрудников с зарплатой не менее " + number + ":");
        for (Employee element : employees) {
            if (element != null && element.getSalary() >= number) {
                System.out.println("Сотрудник " + element.getName() + " (id " + element.getId() + ") Зарплата " + element.getSalary());
            }
        }
    }

    public void addEmploee(String name, int salary, int department) {
        if (numberOfEmploees() >= 10) {
            System.out.println("Нет свободного места.");
        } else {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] == null) {
                    employees[i] = new Employee(name, salary, department);
                    break;
                }

            }
        }
    }

    public void removeEmploee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                employees[i] = null;
                break;
            }
        }
    }

    public void findEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                System.out.println(employee);
                break;
            }
        }
    }

}
