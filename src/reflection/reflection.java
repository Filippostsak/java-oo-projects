package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * The {@code reflection} class demonstrates the usage of Java Reflection
 * to create an instance of the {@code Student} class using its default constructor.
 */
public class reflection {

    /**
     * The main method serves as the entry point of the program.
     * It uses Java Reflection to create an instance of the {@code Student} class
     * with the default constructor and prints the created instance.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try {
            // Get the class object for the Student class
            Class<?> studentClass = Class.forName("reflection.Student");

            // Get the default constructor of the Student class
            Constructor<?> constructor = studentClass.getDeclaredConstructor();

            // Make the constructor accessible if it's private
            constructor.setAccessible(true);

            // Create an instance of the Student class using Reflection
            Student studentInstance = (Student) constructor.newInstance();

            // Print the created Student instance
            System.out.println("Created Student instance using Reflection: " + studentInstance);
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException |
                 IllegalAccessException | InvocationTargetException e) {
            // Print any exceptions that may occur during the reflection process
            e.printStackTrace();
        }
    }
}
