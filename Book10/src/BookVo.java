/*
 VO객체 (Value Object) 			//미래에 Dto도 다룰 예정
	- 데이터만 저장
	- 가공처리는 다른 클래스에서 
*/
// 작성 순서 
// 생성자 -> getter setter -> toString
public class BookVo {
	
	private String title = "";			//제목
	private String author = "";			//지은이
	private String publisher = "";		//출판사
	private int price = 0;				//가격
	private String date = "0000/00/00";	//출판날짜 
	
	
	public BookVo() {
		super();
	}
	
	public BookVo(String title, String author, String publisher, int price, String date) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.date = date;
	}


	//getter - setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", price=" + price
				+ ", date=" + date + "]";
	}
	
	
	
}
