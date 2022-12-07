public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Eko");
        manager.sayHello("Sigit");

        var vp = new VicePresident("Sigit");
        vp.sayHello("Eko");
    }
}
