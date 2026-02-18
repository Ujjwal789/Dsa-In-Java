public class VariablesDemo {

    // Instance variable (belongs to each object)
    int instvar = 10;

    // Static variable (belongs to class and shared by all objects)
    static String staticvar = "I am a static variable";

    public void showVariables() {

        // Local variable (declared inside method)
        int localvar = 5;

        System.out.println("Instance variable: " + instvar);
        System.out.println("Static variable: " + staticvar);
        System.out.println("Local variable: " + localvar);
    }

    public static void main(String[] args) {

        // Creating object
        VariablesDemo obj1 = new VariablesDemo();
        obj1.showVariables();

        // Accessing static variable directly using class name
        System.out.println("Accessing Static Variable via class: " + VariablesDemo.staticvar);
    }
}