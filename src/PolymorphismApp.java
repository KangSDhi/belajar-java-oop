public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Sigit");
        employee.sayHello("Budi");

        employee = new Manager("Dani");
        employee.sayHello("Rans");

        employee = new VicePresident("Tar");
        employee.sayHello("Guts");

        sayHello(new Employee("Eko"));
        sayHello(new Manager("Eko"));
        sayHello(new Manager("Budi"));
    }

    static void sayHello(Employee employee){
        System.out.println("Hello " + employee.name);
    }
}
