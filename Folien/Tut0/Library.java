package tut0;

public class Library {

	private Books books;
	
	public Library() {
		// creates library
	}

	public void createBooks() {
		// fills the library with some books
	}

	public void deleteBooks() {
		// deletes all books in the library		
	}

	public void borrow(int matnumber, String name) {
		// borrow a book 
	}

	public boolean isBorrowed(String name) {
		// return true if book is borrowed
	}
	
	public int getMatnumber(String name) {
		// returns matnumber of the borrower of book "name"
	}
}
