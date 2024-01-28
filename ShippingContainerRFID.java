import java.util.LinkedList;
/**
 * Represents a shipping container with RFID (Radio-Frequency Identification) functionality.
 * This class extends the ShipContainer class and provides methods to manage container contents and count.
 */
public class ShippingContainerRFID extends ShipContainer {
    private final LinkedList<String> contents = new LinkedList<>();
    private final LinkedList<Integer> count = new LinkedList<>();

    /**
     * Creates a new ShippingContainerRFID instance with the given ID.
     */
    public ShippingContainerRFID(int newID) {
        super();
    }

    /**
     * Searches for an item within the contents list and returns its index.
     *
     * @param s The item to search for.
     * @return The index of the item in the contents list, or -1 if not found.
     */
    private int searchItem(String s) {
        // TODO: Implement the search logic.
        return -1;
    }

    /**
     * Adds an item to the container's contents. If the item already exists in the contents,
     * increments its count; otherwise, adds the item to the contents list with a count of 1.
     *
     * @param item The item to add to the container.
     */
    public void setContents(String item) {
        if (contents.contains(item)) {
            int index = contents.indexOf(item);
            int currentValue = count.get(index);
            count.set(index, currentValue + 1);
        } else {
            contents.add(item);
            count.add(1);
        }
    }

    /**
     * Generates and returns a formatted list of container contents along with their counts.
     *
     * @return A formatted string containing the list of container contents and their counts.
     */
    @Override
    public String containerContentList() {
        String containerName = "";
        String num;
        for (int i = 0; i < contents.size(); i++) {
            num = Integer.toString(count.get(i));
            containerName += num + " " + contents.get(i) + ". ";
        }
        return containerName;
    }
}
