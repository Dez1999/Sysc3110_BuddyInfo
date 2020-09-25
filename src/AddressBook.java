import java.util.*;

public class AddressBook {

    private HashMap<String, BuddyInfo> address;

    public void main(String[]args) {
        address = new HashMap<>();

        System.out.print("Address book");

    }

    /**
     * Method: addBuddy(). Adds a buddy into Address Book Map
     * @param name The name of the Buddy (Key)
     * @param info The info of the buddy (Value)
     */
    private void addBuddy(String name, BuddyInfo info)
    {
        address.put(name, info);
    }

    /**
     * Method: removeBuddy(). Removes a buddy from the Address Book Map
     * @param name The name of the Buddy (Key)
     */
    private void removeBuddy(String name){
        address.remove(name);
    }



}




