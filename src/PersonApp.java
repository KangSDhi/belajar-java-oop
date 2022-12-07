public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Sigit", "Tulungrejo");

//        person1.country = "Amerika"; // ERROR

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Bodi");

        Person person2 = new Person("Sigit");
        person2.sayHello("Tiwuk");

        Person person3;
        person3 = new Person();

        person3.name = "Tiwuk";
        person3.sayHello("Turi");
    }
}
