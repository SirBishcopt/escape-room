package escapeRoom;

import java.util.List;

public class Door extends Item {

    public Door() {
        super("door", "The door is closed. You need a key.", "The door is opened.", false);
    }

    public void use(List<Item> inventory) {
        boolean isKeyInInventory = false;
        for (Item item : inventory) {
            if (item instanceof Key) {
                isKeyInInventory = true;
            }
        }
        if (isUsed) {
            isUsed = false;
        } else if (isKeyInInventory) {
            isUsed = true;
        }
    }

}
