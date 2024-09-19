public class BuddyInfo {
    private String name;

    public BuddyInfo(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer");
        System.out.println("Hello world!");
    }
}
