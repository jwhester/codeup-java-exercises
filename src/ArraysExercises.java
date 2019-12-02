import java.util.Arrays;

public class ArraysExercises {

    //    add a person method
//    adds a person then reassigns the value of the original array. adding a space in the array and then referencing the last index when adding the newPerson.
    public static Person[] addPerson(Person[] people, Person newPerson) {
        people = Arrays.copyOf(people, people.length + 1);
        people[people.length-1] = newPerson;
        System.out.println(Arrays.toString(people));
        return people;
    }

    public static void main (String[] args) {

        // Creation of person objects
        Person person1 = new Person("Andrew");
        Person person2 = new Person("Angela");

        Person person3 = new Person("Mike");

        Person person4 = new Person("Jacob");



        // Creation of array of persons
//        Person[] people = new Person[3];
//        people[0] = person1;
//        people[1] = person2;
//        people[2] = person3;

        Person[] people = new Person[]{person1, person2, person3};

        people = addPerson(people, person4);

        // Iteration through array of persons to print names

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }

        for (Person person : people) {
            System.out.println(person.getName());
        }


    }

}