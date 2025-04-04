package Assesments10;

public class PersonRunner {
    public static void main(String[] args) {
        Person person=new Person();
        person.wake();
        person.walk();
        person.eat();
        person.talk();
        person.sleep();
        System.out.println("----------------");
        Person person1=new PersonDetails();
        person1.wake();
        person1.walk();
        person1.eat();
        person1.talk();
        person1.sleep();
        System.out.println("-------------");
        PersonDetails personDetails=new PersonDetails();
        personDetails.eat();
        personDetails.talk();
        personDetails.walk();
        personDetails.wake();
        personDetails.sleep();
    }
}
