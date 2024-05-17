package Lab_Part;

 class Book extends LibraryItem {
	 private String author;

	    public Book(String title, int itemId, String author) {
	        super(title, itemId);
	        this.author = author;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    @Override
	    public void displayDetails() {
	        System.out.println("Book Title: " + getTitle());
	        System.out.println("Author: " + getAuthor());
	        System.out.println("Item ID: " + getItemId());
	        System.out.println("Checked Out: " + isCheckedOut());
	    }
	}