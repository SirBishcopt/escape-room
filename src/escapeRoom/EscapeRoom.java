package escapeRoom;

import java.util.ArrayList;
import java.util.List;

public class EscapeRoom {

    private List<Room> rooms = new ArrayList<>();

    public void playGame() {
        CommunicationModule communicationModule = new CommunicationModule();
        communicationModule.welcomePlayer();
        loadRooms();
        proceedWithRooms(rooms);
        CommunicationModule.endGame();
    }

    private void loadRooms() {
        rooms.add(new Room1());
    }

    private void proceedWithRooms(List<Room> rooms) {
        CommunicationModule communicationModule = new CommunicationModule();
        for (Room room : rooms) {
            communicationModule.informPlayerOnEnteringNewRoom();
            boolean canPlayerLeaveTheRoom = false;
            while (!canPlayerLeaveTheRoom) {
                List<Item> options = room.getPlayersOptions();
                communicationModule.givePlayerOptions(options);
                String playersRequest = communicationModule.askWhatPlayerWantsToDo();
                String responseToRequest = room.fulfillPlayersRequest(playersRequest);
                communicationModule.responseToPlayersRequest(responseToRequest);
                canPlayerLeaveTheRoom = room.checkIfPlayerCanLeaveTheRoom();
            }
            communicationModule.congratulatePlayerOnLeavingTheRoom();
        }
    }

}