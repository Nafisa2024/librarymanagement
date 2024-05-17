package Lab_Part;

class Member extends LibraryItem {
    private String name;

    public Member(String name, int itemId) {
        super(name, itemId);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void displayDetails() {
        System.out.println("Member Name: " + getName());
        System.out.println(" ID: " + getItemId());
    }
}