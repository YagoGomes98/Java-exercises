// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Person class with age validation
public class Person {
    private int age;

    public Person(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Invalid age: " + age);
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        try {
            Person p1 = new Person(25);
            System.out.println("Person's age: " + p1.getAge());

            Person p2 = new Person(-5); // This will throw an exception
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
