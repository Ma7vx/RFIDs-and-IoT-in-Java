/**
 * The ShipContainer class represents a container on a ship.
 */
public class ShipContainer {

    /**
     * The unique identifier for the container.
     */
    protected int containerID;

    /**
     * Constructs a ShipContainer object with a default constructor.
     */
    public ShipContainer() {
    }

    /**
     * Retrieves the container's unique identifier.
     *
     * @return The container's ID.
     */
    public int getContainerID() {
        return containerID;
    }

    /**
     * Sets the container's unique identifier.
     *
     * @param containerID The new container ID.
     */
    public void setContainerID(int containerID) {
        this.containerID = containerID;
    }

    /**
     * Sets the contents of the container.
     *
     * @param contents The contents to be set.
     */
    public void setContents(String contents) {
        // TODO: Implement this method to set the contents of the container.
    }

    /**
     * Returns a list of contents within the container.
     *
     * @return A list of contents within the container.
     */
    public String containerContentList() {
        // TODO: Implement this method to return a formatted list of container contents.
        return "";
    }

    /**
     * Prints the details of the container, including its ID and contents.
     */
    public void printContent() {
        System.out.println("Container " + getContainerID() + " contains " + containerContentList());
    }
}
