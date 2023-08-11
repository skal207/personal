import java.util.Scanner;
/*
 *    Book 클래스를 활용하여 3개짜리 Book 객체 배열을 만들고, 사용자로부터 책의 제목과 저자를 입력받아 배열을 완성하시오.
 *      - 멤버 변수 : String title, author
 *      - 생송자
 *    [과제] 가격(정수 long형)까지 입력받아 출력하는 프로그램 완성 
 */
public class Book {
	// 멤버 변수
	String title, author;
	long price;
	
	// 기본생성자
	public Book() {
		this("","",0);
		System.out.println("책이름과 저자명 입력이 없을 경우 실행함 ");
	}
	//생성자
	public Book(String title, String author, long price) {
		this.title = title;
		this.author = author;
	    this.price = price;
	}

	public static void main(String[] args) {
		// 3개짜리 Book 객체 배열 생성
		Book book[] = new Book[3];       // 매개변수 2개를 갖는 생성자 호출
		Book b = new Book();        // 기본생성자 호출
		
		Scanner sc = new Scanner(System.in);
		// 제목과 저자명 입력받아 저장
		for(int i=0; i<book.length; i++) {
			System.out.print( "\n"+(i+1)+"번째 제목>> ");
			String title = sc.next();         // 엔터를 기준으로 책제목에 저장
			System.out.print( "\n"+(i+1)+"번째 저자명>> ");
			String author = sc.next();        // 엔터를 가준으로 저자명에 저장
			System.out.print( "\n"+(i+1)+"번째 가격>> ");
			long price = sc.nextLong();
			
			book[i] = new Book(title, author, price);
		}
		
		//객체 배열의 값 보두 출력
		for(int i=0; i<book.length; i++)
			System.out.println(" <"+ book[i].title + ", "+ book[i].author +", "+ book[i].price +"원"+">");
		
		sc.close();
	}

}
