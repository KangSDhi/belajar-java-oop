class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My Name is " + name);
    }
}
