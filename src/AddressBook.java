import java.util.*;

public class AddressBook {

    private HashMap<String, BuddyInfo> address;

    public void main(String[]args) {
        address = new HashMap<>();

        //System.out.print("Address book");
        BuddyInfo buddy1 = new BuddyInfo("Des", "Carleton", "229");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy("buddy1", buddy1);
        addressBook.removeBuddy("buddy1");
    }

    /**
     * Method: addBuddy(). Adds a buddy into Address Book Map
     * @param buddy The name of the Buddy (Key)
     * @param info The info of the buddy (Value)
     */
    private void addBuddy(String buddy, BuddyInfo info)
    {
        address.put(buddy, info);
    }

    /**
     * Method: removeBuddy(). Removes a buddy from the Address Book Map
     * @param buddy The name of the Buddy (Key)
     */
    private void removeBuddy(String buddy){
        address.remove(buddy);
    }



}




