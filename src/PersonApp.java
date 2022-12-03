public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Sig", "tar");
        person1.name = "Sigit";
        person1.address = "Tulungrejo";
//        person1.country = "Amerika"; // ERROR

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Bodi");

        Person person2 = new Person("Sig", "Tar");
        person2.sayHello("Tiwuk");

        Person person3;
        person3 = new Person("Sig", "Nar");

        person3.name = "Tiwuk";
        person3.sayHello("Turi");
    }
}
