import java.util.*;
/**
 * Class AddressBook - an address book containing BuddyInfo objects
 *
 * @author Desmond Blake
 * @version Sept 25, 2020
 */
public class AddressBook {

    //private HashMap<String, BuddyInfo> address;
    private ArrayList<BuddyInfo> myBuddyAddress;

    public AddressBook(){
        myBuddyAddress = new ArrayList<>();

    }

    public void main(String[]args) {
        //System.out.print("Address book");
        BuddyInfo buddy1 = new BuddyInfo("Des", "Carleton", "229");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy1);
        addressBook.removeBuddy(0);
    }

    /**
     * Method: addBuddy(). Adds a buddy into Address Book List
     * @param info The info of the buddy (Value)
     */
    private void addBuddy(BuddyInfo info)
    {
        if(info != null){
            myBuddyAddress.add(info);
        }
    }

    /**
     * Method: removeBuddy(). Removes a buddy from the Address Book List
     * @param index The index of the Buddy
     */
    private BuddyInfo removeBuddy(int index){
        if(index >= 0 && index < myBuddyAddress.size()){
            return myBuddyAddress.remove(index);
        }
        return null;
    }

}




