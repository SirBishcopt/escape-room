package escapeRoom;

import java.util.ArrayList;
import java.util.List;

public abstract class Room {

    protected List<Item> items;

    public Room(List<Item> items) {
        this.items = items;
    }

    public abstract boolean checkIfPlayerCanLeaveTheRoom();

    public List<Item> getPlayersOptions() {
        List<Item> options = new ArrayList<>();
        for (Item item : items) {
            if (!(item.isUsed() && item.goesToInventory())) {
                options.add(item);
            }
        }
        return options;
    }

    public String fulfillPlayersRequest(String playersRequest) {
        playersRequest = playersRequest.toLowerCase();
        List<Item> options = getPlayersOptions();
        for (Item item : options) {
            if (playersRequest.contains(item.getName())) {
                item.use(listItemsInInventory());
                return item.getMessage();
            }
        }
        return "Errr... What? I didn't get it. One more time...";
    }

    private List<Item> listItemsInInventory() {
        List<Item> inventory = new ArrayList<>();
        for (Item item : items) {
            if (item.isUsed() && item.goesToInventory()) {
                inventory.add(item);
            }
        }
        return inventory;
    }

}
