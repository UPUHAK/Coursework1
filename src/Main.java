public class Main {

    public static void main(String[] args) {

        EmployeeBook book = new EmployeeBook();

        book.printEmployeeArray();

        System.out.println(book.totalSalary());

        System.out.println(book.minSalary());

        System.out.println(book.maxSalary());

        System.out.println(book.averageSalary());

        System.out.println(book.numberOfEmploees());

        book.printNameEmployeeArray();

        book.indexSalaryByPercentage(10);

        book.printEmployeeArray();

        System.out.println(book.minSalaryInDept(3));

        System.out.println(book.maxSalaryInDept(5));

        System.out.println(book.totalSalaryInDept(4));

        System.out.println(book.averageSalaryInDept(1));

        book.indexSalaryByPercentageInDept(2, 3);

        book.printEmployeeArray();

        book.printDepartment(4);

        book.listSalariesLessThan(60000);

        book.listSalariesNoLessThan(80000);

        book.addEmploee("Семенов С.С.", 65000, 5);

        book.removeEmploee(4);

        book.printEmployeeArray();

        book.addEmploee("Семенов С.С.", 65000, 5);

        System.out.println("Новый список:");

        book.printEmployeeArray();

        book.findEmployeeById(11);

    }


}