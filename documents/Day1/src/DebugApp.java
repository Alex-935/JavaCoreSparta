public class DebugApp {

    public static void main(String[] args) {

        String name, occupation, location, activityLevel;
        name = "John Crabtree";
        occupation = "trainee";
        location = "London";
        activityLevel = "moderate";

        System.out.println("My name is " + name);
        System.out.printf("I am a %s in %s", occupation, location);

        int age = 21;
        System.out.printf("%nI am %d years of age with a %s activity level%n", age, activityLevel);
    }
}
