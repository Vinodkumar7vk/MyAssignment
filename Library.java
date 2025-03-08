package week1.day2.Homeassignment;

public class Library {

	String addBook(String bookTitle) {
		System.out.println("Book is added successfully");
		return bookTitle;
	}
	
	void issueBook() {
		System.out.println("Book is issued successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Library LB = new Library();
LB.addBook("Auto biography");
LB.issueBook();
	}

}
