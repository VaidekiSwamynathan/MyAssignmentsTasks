package week1.day2;

public class Library {

	public String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return bookTitle;
	}
		
		public void bookIssued(){
			System.out.println("bookissued successfully");
		}
		
		public static void main(String[] args) {
			// Object ---> ClassName objName = new ClassName();
			// Class Name --> Should Start with UpperCase
			// methods, variable and object name --> Should start with camelCase
			//Eg: addBook, bookIssued
			Library Book= new Library();
			String Library= Book.addBook("ethicstories added successfully");
			Book.bookIssued();
			System.out.println(Library);
			

		}
	}

	


