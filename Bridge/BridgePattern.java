public class BridgePattern{
	public static void main(String[] args) {
		

		System.out.println("Display Artist in Long View form\n");
		//create an artist 
		//display it using long view
		Artist a = new Artist("Leonardo da Vinci","#Some bio","XYZ.com");
		View longViewArtist = new LongView(new ArtistResource(a));
		longViewArtist.show();

	}
}

//1st inheritance hierarchy
abstract class View{
	Resource r;
	View(Resource r){
		this.r = r;
	}
	abstract void show();
}
class LongView extends View{
	
	LongView(Resource r){
		super(r);
	}

	void show(){
		System.out.println(r.getTitle()+"\n"+r.getBody()+"\n"+r.getUrl());
	}
}
class ShortView extends View{
	
	ShortView(Resource r){
		super(r);
	}

	void show(){
		System.out.println(r.getTitle());
	}
}


//2nd inheritance hierarchy
interface Resource{
	public String getTitle();
	public String getBody();
	public String getUrl();
}
class ArtistResource implements Resource{

	Artist a;

	ArtistResource(Artist a){
		this.a = a;
	}

	public String getTitle(){
		return a.name;
	}
	public String getBody(){
		return a.bio;
	}
	public String getUrl(){
		return a.webPageLink;
	}
}

class BookResource implements Resource{
	Book b;

	public BookResource(Book b){
		this.b = b;
	}

	public String getTitle(){
		return b.bookTitle;
	}
	public String getBody(){
		return b.coverText;
	}
	public String getUrl(){
		return b.authorWebPageLink;
	}
}


//Adaptees
class Artist{
	String name;
	String bio;
	String webPageLink;
	Artist(String a,String b,String c){
		name = a;
		bio = b;
		webPageLink = c;
	}
}
class Book{
	String bookTitle;
	String coverText;
	String authorWebPageLink;
	Book(String a,String b,String c){
		bookTitle = a;
		coverText = b;
		authorWebPageLink = c;
	}
}











