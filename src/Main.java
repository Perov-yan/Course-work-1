//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Иванов Иван Иванович", 1, 25000);
        employeeBook.addEmployee("Иванов Иван Петрович", 2, 30000);
        employeeBook.addEmployee("Иванов Иван Михайлович", 3, 40000);
        employeeBook.addEmployee("Иванов Иван Борисович", 4, 20000);
        employeeBook.addEmployee("Иванов Иван Дмитриевич", 5, 50000);
        employeeBook.addEmployee("Иванов Иван Владимирович", 1, 20000);
        employeeBook.addEmployee("Иванов Иван Данилович", 2, 10000);
        employeeBook.addEmployee("Иванрв Иван Максимович", 3, 23000);
        employeeBook.addEmployee("Иванов Иван Ильич", 4, 24000);
        employeeBook.addEmployee("Иванов Иван Кузьмич", 5, 25000);

        employeeBook.printAllEmployees();
        // Распечатываем всех сотрудников

        System.out.println("Размер штата: " + employeeBook.getCurrentSize());
        // Распечатываем размер штата


        employeeBook.findEmployee("Иванов Иван Иванович");
        // Ищем сотрудника по имени Иванов Иван Иванович


        employeeBook.findIdEmployee(10);
        // Ищем сотрудника по ID


        employeeBook.removeEmployee("Иванов Иван Петрович");
        // удаляем сотрудника
        employeeBook.printAllEmployees();


        employeeBook.addEmployee("Иванов Иван Кузьмич", 5, 25000);

        employeeBook.printAllEmployees();
        // поск зарплаты сотрудникам за месяц
        employeeBook.findTotalSalary();
        //поск отрудника с меньшей зарплатой за месяц
        employeeBook.findEmployeeMinSalary();
        //реализуем поск отрудника с наибольшей зарплатой за месяц
        employeeBook.findEmployeeMaxSalary();
        //Печать всех имен сотрудников
        employeeBook.printAllTotalNameEmployees();
        //поиск средней зарплаты за месяц
        employeeBook.findMediumSalary();


    }

}
