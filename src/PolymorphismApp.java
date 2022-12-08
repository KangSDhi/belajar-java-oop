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
        sayHello(new VicePresident("Budi"));
    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
