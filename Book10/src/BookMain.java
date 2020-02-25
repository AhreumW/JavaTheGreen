
public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookVo book = new BookVo();
			
		book.setTitle("콩쥐팥쥐");
		book.setAuthor("작자미상");
		book.setPublisher("아이동심");
		book.setPrice(5000);
		book.setDate("2019/05/11");

		System.out.println(book);
		
		System.out.println(book.getTitle());
		System.out.println(book.getAuthor());
		System.out.println(book.getPublisher());
		System.out.println(book.getPrice());
		System.out.println(book.getDate());
		
	}

}
