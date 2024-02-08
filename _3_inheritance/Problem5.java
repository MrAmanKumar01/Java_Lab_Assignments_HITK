package _3_inheritance;
/*
Problem 5) Consider an example of book shop which sells books & video tapes. It's modeled by Book &
Tape classes. These two classes are inherited from the abstract class called Media. The Media
class has common data members such as title & publication. The Book class has data
member for storing a no. of pages in a book & Tape class has the playing time in a tape. Each
class will have method such as read ( ) & show ( ). Write a program that models this class
hierarchy & processes objects using reference to base class only.
 */
/*
    Media(Abstract Superclass)
    /        \
  Book      Tape

*/

//Abstract class Media
abstract class Media {
	private String title;
	private String publication;

	public Media(String title, String publication) {
		this.title = title;
		this.publication = publication;
	}

	public String getTitle() {
		return title;
	}

	public String getPublication() {
		return publication;
	}

	public abstract void read();
	public abstract void show();
}

//Class Book inherits from Media
class Book extends Media {
	private int pages;

	public Book(String title, String publication, int pages) {
		super(title, publication);
		this.pages = pages;
	}

	public int getPages() {
		return pages;
	}

	//Override
	public void read() {
		System.out.println("Reading the book: " + getTitle());
	}

	//Override
	public void show() {
		System.out.println("Book Details:");
		System.out.println("Title: " + getTitle());
		System.out.println("Publication: " + getPublication());
		System.out.println("Number of Pages: " + getPages());
	}
}

//Class Tape inherits from Media
class Tape extends Media {
	private double playingTime;

	public Tape(String title, String publication, double playingTime) {
		super(title, publication);
		this.playingTime = playingTime;
	}

	public double getPlayingTime() {
		return playingTime;
	}

	//Override
	public void read() {
		System.out.println("Playing the tape: " + getTitle());
	}

	//Override
	public void show() {
		System.out.println("Tape Details:");
		System.out.println("Title: " + getTitle());
		System.out.println("Publication: " + getPublication());
		System.out.println("Playing Time: " + getPlayingTime() +" hrs");
	}
}

//Main program
public class Problem5 {
	public static void main(String[] args) {
		// Create a Book object
		Book book = new Book("Java-The Complete Reference", "Oracle", 1200);

		// Process the Book object using a reference to the base class Media
		Media media = book;
		media.show();
		media.read();

		System.out.println("--------------------------------------------------");
		
		// Create a Tape object
		Tape tape = new Tape("Kota Factory", "TVF", 3.5);

		// Process the Tape object using a reference to the base class Media
		media = tape;
		media.show();
		media.read();
	}
}

/*
OUTPUT:
-------
Book Details:
Title: Java-The Complete Reference
Publication: Oracle
Number of Pages: 1200
Reading the book: Java-The Complete Reference
--------------------------------------------------
Tape Details:
Title: Kota Factory
Publication: TVF
Playing Time: 3.5 hrs
Playing the tape: Kota Factory

*/

