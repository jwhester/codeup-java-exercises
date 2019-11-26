public class Person {

    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello " + name);
    }

    public Person(String name){
        setName(name);
    }

    public static void main(String[] args) {
        Person nandrew = new Person("nandrew");
        nandrew.sayHello();
    }
}

