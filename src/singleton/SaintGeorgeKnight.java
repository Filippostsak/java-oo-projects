package singleton;

/**
 * The {@code SaintGeorgeKnight} class represents a knight named Sir George
 * and follows the Singleton pattern. It implements the {@code MissionBehavior} interface,
 * providing the ability to embark on missions.
 */
public class SaintGeorgeKnight implements MissionBehavior {

    /**
     * The single instance of the SaintGeorgeKnight class.
     */
    private static SaintGeorgeKnight instance;

    /**
     * Private constructor to prevent external instantiation.
     */
    private SaintGeorgeKnight() {
    }

    /**
     * Gets the single instance of the SaintGeorgeKnight class.
     * If an instance doesn't exist, it creates one and returns it.
     *
     * @return The single instance of the SaintGeorgeKnight class.
     */
    public static SaintGeorgeKnight getInstance() {
        if (instance == null) {
            instance = new SaintGeorgeKnight();
        }
        return instance;
    }

    /**
     * Implements the embarkOnMission method from the MissionBehavior interface.
     * Displays a message indicating that Sir George is embarking on a mission.
     */
    @Override
    public void embarkOnMission() {
        System.out.println("Sir George is embarking on a mission!");
    }
}
