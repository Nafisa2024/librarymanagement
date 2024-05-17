package Lab_Part;

class DVD extends LibraryItem{
	 private String director;

	    public DVD(String title, int itemId, String director) {
	        super(title, itemId);
	        this.director = director;
	    }

	    public String getDirector() {
	        return director;
	    }

	    @Override
	    public void displayDetails() {
	        System.out.println("DVD Title: " + getTitle());
	        System.out.println("Director: " + getDirector());
	        System.out.println("Item ID: " + getItemId());
	        System.out.println("Checked Out: " + isCheckedOut());
	    }
}