package escapeRoom;

import java.util.ArrayList;
import java.util.Arrays;

public class Room1 extends Room {

    public Room1() {
        super(new ArrayList<>(Arrays.asList(new Door(), new Window(), new Key())));
    }

    @Override
    public boolean checkIfPlayerCanLeaveTheRoom() {
        return items.get(0).isUsed;
    }

}