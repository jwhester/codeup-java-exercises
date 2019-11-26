
package sandbox;

public class NewPeople {
    public static void main(String[] args) {


        Person ada = new Person();
        ada.firstName = "Ada";
        ada.lastName = "Lovelace";

        Person grace = new Person();
        grace.firstName = "Grace";
        grace.lastName = "Hopper";

        Person rick = new Person();
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";
        System.out.println(rick.sayHello());
        // prints "Hello from Rick Sanchez!"
    }
}