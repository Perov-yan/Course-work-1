public class EmployeeBook {
    private final Employee[] employees;
    // Объявили массив Employee, реализуемый в классе Employee
    private int size;
    // Объявили свойство Id

    public EmployeeBook() {
        this.employees = new Employee[10];
        // Задали массиву Employee длину — 10
    }

    // Реализуем метод addEmployee (создать Сотрудника):
    public void addEmployee(String totalName, int departament, int salary) {
        if (size >= employees.length) {
            throw new IllegalArgumentException("Нельзя добавить, штат заполнен");
        }
        int id = size + 1;
        Employee newEmployee = new Employee(totalName, departament, salary, id);
        employees[size++] = newEmployee;
    }

    // Реализуем метод removeEmployee (удалить Сотрудника)
    // Метод сдвигает массив влево на ячейку, удаляя ячейку под номером i
    public void removeEmployee(String totalName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getTotalName().equals(totalName)) {
                System.out.println(employees[i].getTotalName() + " удален");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;
            }
        }
    }

    // Реализуем метод findEmployee (найти сотрудника) через ФИО
    public void findEmployee(String totalName) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getTotalName().equals(totalName)) {
                System.out.println(employee.getTotalName() + " : " + employee.getDepartment()+ " : " + employee.getSalary());
                System.out.println(" ");
                return;
            }
        }
        System.out.println(totalName + " не найден");
        System.out.println(" ");
    }

    // Реализуем метод findEmployee (найти сотрудника) через ID
    public void findIdEmployee(int id) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getId() == id) {
                System.out.println(employee.getTotalName() + " : " + employee.getDepartment()+ " : " + employee.getSalary());
                System.out.println(" ");
                return;
            }
        }
        System.out.println("Сотрудник с ID " + id + " не найден");
        System.out.println(" ");
    }

    // Реализуем метод printAllEmployee (распечатать всех Сотрудников)
    public void printAllEmployees() {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getTotalName() + " : " + employee.getDepartment() + " : "+ employee.getSalary() + " : "+ employee.getId());
        }
        System.out.println(" ");
    }

    // Реализуем метод getCurrentSize (получить текущий размер Штата)
    public int getCurrentSize() {
        return size;
    }

    // реализуем поск зарплаты сотрудникам за месяц
    public void findTotalSalary() {
        int sum;
        int totalSum = 0;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            sum = employee.getSalary();
            totalSum = totalSum +sum;
            }
        System.out.println("Сумма траты на зарплату всех сотрудников " + totalSum);
        System.out.println(" ");
    }

    // реализуем поск отрудника с меньшей зарплатой за месяц
    public void findEmployeeMinSalary() {
        int currentId = 0;
        int currentSalary = employees[0].getSalary();
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            int current = employee.getSalary();
            if (current < currentSalary){
                currentSalary = current;
                currentId = i;
            }
        }
        findIdEmployee(currentId);
    }

    // реализуем поск отрудника с наибольшей зарплатой за месяц
    public void findEmployeeMaxSalary() {
        int currentId = 0;
        int currentSalary = employees[0].getSalary();
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            int current = employee.getSalary();
            if (current > currentSalary){
                currentSalary = current;
                currentId = i;
            }
        }
        findIdEmployee(currentId);
    }

    // реализуем Печать всех имен сотрудников
    public void printAllTotalNameEmployees() {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getTotalName());
        }
        System.out.println(" ");
    }
    // реализуем поиск средней зарплаты за месяц

    public void findMediumSalary() {
        int sum;
        int totalSum = 0;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            sum = employee.getSalary();
            totalSum = totalSum +sum;
        }
        double mediumSalary = totalSum/(double) size;
        System.out.println("Средняя сумма трат на зарплату всех сотрудников " + mediumSalary);
        System.out.println(" ");
    }

}
