public class Employee {
    private final String totalName;
    // Объявили свойство nick (никнейм)
    private int department;
    // Объявили свойство phone (номер телефона)
    private int salary;
    private int id;

    public Employee(String totalName, int department, int salary, int id) {
        this.totalName = totalName;
        this.department = department;
        this.salary = salary;
        this.id = id;
    }

    public String getTotalName() {
        return totalName;
        // Создали геттер для фио
    }

    public int getDepartment() {
        return department;
        // Создали геттер для отдела
    }

    public int getSalary(){
        return salary;
        // Создали геттер для зарплаты
    }

    public int getId(){
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
        // Создали сеттер для отдела
    }

    public void setSalary(int salary){
        this.salary = salary;
        // Создали сеттер для зарплаты
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        Employee employee = (Employee) object;
        return totalName.equals(employee.totalName) && department == employee.department && salary == employee.salary;
    }

    @Override
    public int hashCode(){
        return java.util.Objects.hash(totalName, department, salary);
    }

}
