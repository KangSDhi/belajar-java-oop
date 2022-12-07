class VicePresident extends Manager{

    VicePresident(String name) {
        super(name);
    }

    void sayHello(String name){
        System.out.println("Hello " + name + ", My Name is VP " + this.name);
    }

}
