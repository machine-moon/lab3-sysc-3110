import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo newBuddy) {
        if (newBuddy != null) {
            buddies.add(newBuddy);
        }
    }

    public void removeBuddy(BuddyInfo thisBuddy) {
        buddies.remove(thisBuddy);
    }

    public void printBuddies() {
        for (BuddyInfo buddy : buddies) {
            System.out.println(buddy.getName());
        }
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        AddressBook addressBook = new AddressBook();
        BuddyInfo buddy1 = new BuddyInfo("Buddy1");
        BuddyInfo buddy2 = new BuddyInfo("Buddy2");
        BuddyInfo buddy3 = new BuddyInfo("Buddy3");

        addressBook.addBuddy(buddy1);
        addressBook.addBuddy(buddy2);
        addressBook.addBuddy(buddy3);
        addressBook.removeBuddy(buddy1);
        addressBook.printBuddies();    }
}