import java.util.Scanner;
/*
 *    Book Ŭ������ Ȱ���Ͽ� 3��¥�� Book ��ü �迭�� �����, ����ڷκ��� å�� ����� ���ڸ� �Է¹޾� �迭�� �ϼ��Ͻÿ�.
 *      - ��� ���� : String title, author
 *      - ������
 *    [����] ����(���� long��)���� �Է¹޾� ����ϴ� ���α׷� �ϼ� 
 */
public class Book {
	// ��� ����
	String title, author;
	long price;
	
	// �⺻������
	public Book() {
		this("","",0);
		System.out.println("å�̸��� ���ڸ� �Է��� ���� ��� ������ ");
	}
	//������
	public Book(String title, String author, long price) {
		this.title = title;
		this.author = author;
	    this.price = price;
	}

	public static void main(String[] args) {
		// 3��¥�� Book ��ü �迭 ����
		Book book[] = new Book[3];       // �Ű����� 2���� ���� ������ ȣ��
		Book b = new Book();        // �⺻������ ȣ��
		
		Scanner sc = new Scanner(System.in);
		// ����� ���ڸ� �Է¹޾� ����
		for(int i=0; i<book.length; i++) {
			System.out.print( "\n"+(i+1)+"��° ����>> ");
			String title = sc.next();         // ���͸� �������� å���� ����
			System.out.print( "\n"+(i+1)+"��° ���ڸ�>> ");
			String author = sc.next();        // ���͸� �������� ���ڸ� ����
			System.out.print( "\n"+(i+1)+"��° ����>> ");
			long price = sc.nextLong();
			
			book[i] = new Book(title, author, price);
		}
		
		//��ü �迭�� �� ���� ���
		for(int i=0; i<book.length; i++)
			System.out.println(" <"+ book[i].title + ", "+ book[i].author +", "+ book[i].price +"��"+">");
		
		sc.close();
	}

}
