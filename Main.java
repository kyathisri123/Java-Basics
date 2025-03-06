package JavaBasics;

class Person {
    public void greet() {
        System.out.println("Hello! Welcome to Java.");
    }
}

public class Main {  
    public static void main(String[] args) {
        Person person = new Person();
        person.greet();
    }
}
