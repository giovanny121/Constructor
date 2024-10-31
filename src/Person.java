public class Person {
    private String name;
    private int age;
    private String username;
    private String password;

    // Constructor
    public Person(String name, int age, String username, String password) {
        this.name = name;
        this.age = age;
        this.username = username;
        this.password = password;
    }

    // Getters and Setters (optional)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Override toString method to print name and age
    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d", name, age);
    }

    // Override equals method to check for username and password equality
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return username.equals(person.username) && password.equals(person.password);
    }

    // Override hashCode if equals is overridden (best practice)
    @Override
    public int hashCode() {
        return username.hashCode() + password.hashCode();
    }

    // Main method to test
    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 30, "johndoe", "password123");
        Person person2 = new Person("Jane Smith", 28, "janesmith", "password456");

        // Testing toString
        System.out.println(person1);
        System.out.println(person2);

        // Testing equals method
        Person person3 = new Person("John Doe", 30, "johndoe", "password123");
        System.out.println(person1.equals(person3)); // true
        System.out.println(person1.equals(person2)); // false
    }
}
