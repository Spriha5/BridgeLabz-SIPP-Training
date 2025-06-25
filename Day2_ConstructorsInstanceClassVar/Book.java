package Day2_ConstructorsInstanceClassVar;

public class Book {

	String title;
	String author;
	float price;
	
	public Book(String title,String author,float price)
	{
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public Book()
	{
		title="othello";
		author="William";
		price=56.4f;
	}
	
	void DisplayBookDetail()
	{
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
	}
	public static void main(String[] args)
	{
		Book obj1=new Book();
		obj1.DisplayBookDetail();
             
		Book obj2=new Book("jouney of soul","micheal newton",100.1f);
		obj2.DisplayBookDetail();
	
}
}
