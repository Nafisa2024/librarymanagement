package Lab_Part;

abstract class LibraryItem {
	private String title;
    private int itemId;
    private boolean checkedOut;

    public LibraryItem(String title, int itemId) {
        this.title = title;
        this.itemId = itemId;
        this.checkedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public int getItemId() {
        return itemId;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void checkOut() {
        checkedOut = true;
    }

    public void checkIn() {
        checkedOut = false;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayDetails();
}