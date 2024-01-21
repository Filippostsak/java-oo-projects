package singleton;

/**
 * The {@code AnotherKnight} class represents another knight and implements the {@code MissionBehavior} interface.
 * It provides a specific implementation for the {@code embarkOnMission} method,
 * displaying a message indicating that another knight is embarking on a mission.
 */
public class AnotherKnight implements MissionBehavior {

    /**
     * Implements the embarkOnMission method from the MissionBehavior interface.
     * Displays a message indicating that another knight is embarking on a mission.
     */
    @Override
    public void embarkOnMission() {
        System.out.println("Another knight is embarking on a mission!");
    }
}
