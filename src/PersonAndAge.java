public class PersonAndAge implements Comparable{

    String firstName;
    String lastName;
    int age;

    public PersonAndAge(){
    }

    public PersonAndAge(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return firstName + " " + lastName + ": " + age;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
