package week1.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library librarymanagement= new Library();
		String addbook = librarymanagement.addBook("another book added successfully");
		librarymanagement.bookIssued();
		System.out.println("addbook");
		

	}

}
