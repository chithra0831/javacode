public class Employee {
    String name;
    int id;
    double salary;
    
    public Employee(String name,int id,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;

    }
    public void displayInfo() {
                                               
        System.out.println("Emloyee ID: " + id);
        System.out.println("Emloyee Name: " + name);
        System.out.println("Salary: " + salary);
    }
    public static void main(String[] args){
        Employee emp1 = new Employee("xyz",101,50000.0);
        emp1.displayInfo();
    }

    
}
