public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Eko";
        manager.sayHello("Sigit");

        var vp = new VicePresident();
        vp.name = "Sigit";
        vp.sayHello("Eko");
    }
}
