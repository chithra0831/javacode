public class Employee {
    String name;
    int id;
    double salary;
    int age;
    
    public Employee(String name,int id,double salary,int age){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.age=age;

    }
    public void displayInfo() {
                                               
        System.out.println("Emloyee ID: " + id);
        System.out.println("Emloyee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);

    }
    public static void main(String[] args){
        Employee emp1 = new Employee("xyz",101,50000.0,35);
        emp1.displayInfo();
    }

    
}
