package FifthExercise;

public class Action {
    public static void main(String[] args) {    
    Person person = new Person();
    person.printAge();
    person.makeOlder();
    person.printAge();
    person.makeYounger();
    person.printAge();
    person.setAge(19);
    person.printAge();
    person.setAgeAndName(20, "Abhinav");
    person.printAge();
    person.printName();
    person.getter();
    }
}
