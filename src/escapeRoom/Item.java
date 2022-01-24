package escapeRoom;

import java.util.List;

public abstract class Item {

    String name;
    String messageIfNotUsed;
    String messageIfUsed;
    boolean isUsed = false;
    boolean goesToInventory;

    public Item(String name, String messageIfNotUsed, String messageIfUsed, boolean goesToInventory) {
        this.name = name;
        this.messageIfNotUsed = messageIfNotUsed;
        this.messageIfUsed = messageIfUsed;
        this.goesToInventory = goesToInventory;
    }

    public String getName() {
        return name;
    }

    public void use(List<Item> inventory) {
        if (isUsed){
            isUsed = false;
        } else {
            isUsed = true;
        }
    }

    public String getMessage() {
        if (isUsed()) {
            return messageIfUsed;
        } else {
            return messageIfNotUsed;
        }
    }

    public boolean isUsed() {
        return isUsed;
    }

    public boolean goesToInventory() {
        return goesToInventory;
    }

    @Override
    public String toString() {
        return name;
    }

}
