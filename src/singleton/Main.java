package singleton;

/**
 * The {@code Main} class serves as the entry point of the program
 * and demonstrates the usage of the Singleton pattern and the MissionBehavior interface.
 */
public class Main {

    /**
     * The main method creates instances of the SaintGeorgeKnight and AnotherKnight classes,
     * both implementing the MissionBehavior interface. It calls the embarkOnMission method
     * to demonstrate the mission behavior of each knight.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        SaintGeorgeKnight georgeKnight = SaintGeorgeKnight.getInstance();
        georgeKnight.embarkOnMission();

        AnotherKnight anotherKnight = new AnotherKnight();
        anotherKnight.embarkOnMission();
    }
}
