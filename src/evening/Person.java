package evening;

public class Person {
    int age;
    String name;
    String surname;

    Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int calculateBirthYear(){
        return 2024 - age;
    }

    public void PrintFullName(){
        System.out.println( name + " " + surname);
    }

    public String getFullName(){
        return name + " " + surname;
    }
    public static void  main(String[] args){
        Person person = new Person("John", "Doe", 30);
        System.out.println("Full Name: " + person.getFullName());
        System.out.println("Birth Year: " + person.calculateBirthYear());
        person.PrintFullName();
    }

}