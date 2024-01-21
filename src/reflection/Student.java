package reflection;

/**
 * The {@code Student} class represents a student with an ID, first name, and last name.
 * It follows the JavaBean conventions with a default constructor and accessor methods.
 */
public class Student {

    /**
     * The unique identifier of the student.
     */
    private int id;

    /**
     * The first name of the student.
     */
    private String firstName;

    /**
     * The last name of the student.
     */
    private String lastName;

    /**
     * Default constructor for the {@code Student} class.
     */
    public Student() {
    }

    /**
     * Parameterized constructor for the {@code Student} class.
     *
     * @param id        The unique identifier of the student.
     * @param firstName The first name of the student.
     * @param lastName  The last name of the student.
     */
    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Gets the ID of the student.
     *
     * @return The ID of the student.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the student.
     *
     * @param id The unique identifier of the student.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the first name of the student.
     *
     * @return The first name of the student.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the student.
     *
     * @param firstName The first name of the student.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name of the student.
     *
     * @return The last name of the student.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the student.
     *
     * @param lastName The last name of the student.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns a string representation of the {@code Student} object.
     *
     * @return A string representation of the {@code Student} object.
     */
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
