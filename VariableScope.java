package JavaBasics;

public class VariableScope {
    static int number = 100; // Global variable

    public static void main(String[] args) {
        int number = 50; // Local variable

        System.out.println("Local Variable: " + number);
        System.out.println("Global Variable: " + VariableScope.number);
    }
}
