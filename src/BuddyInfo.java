/**
 * Class BuddyInfo - An object containing information about each Buddy
 *
 * @author Desmond Blake
 * @version Sept 25, 2020
 */

public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber) {
    }

    public static void main(String[] args) {

        BuddyInfo person1 = new BuddyInfo("Desmond","Ottawa", "61322" );
        person1.name = "Desmond";
        System.out.println("Hello " + person1.getName() + "!");
    }

    //Getter
    private String getName() {
        return name;
    }

}
