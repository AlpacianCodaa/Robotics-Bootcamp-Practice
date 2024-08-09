package FifthExercise;

public class Person {
    int age = 16;
    String name;
    public void printAge() {
        System.out.println(age);
    }

    public void printName() {
        System.out.println(name);
    }

    public void makeOlder() {
        age++;
    }

    public void makeYounger() {
        age--;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setAgeAndName(int newAge, String newName) {
        age = newAge;
        name = newName;
    }
    public int getter() {
        return age;
    }

}
