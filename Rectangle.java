import java.util.Scanner;

/*
 *  사각형의 색상, 가로, 세로를 입력받아 사각형의 면적을 출력하는 프로그램
 *   - 멤버 변수 : int width, int height, String color
 *   - 멤버 메소드 : int getArea(), String getColor()
 */
public class Rectangle {
	// 멤버 변수
	int width;
	int height;
	String color;
	
	//기본생성자
	public Rectangle() {
		width=0;
		height=0;
		color="";
	}
	
	//생성자 - 매개변수 3개
	public Rectangle(int w, int h, String c) {
		width = w;
		height = h;
		color = c;
	}
	
	// 멤버 메소드
	public int getArea() {
		return width*height;
	}
	
	public String getColor() {
		return color;
	}

	public static void main(String[] args) {
		// 객체 생성
		Rectangle rect = new Rectangle();
		
		Scanner sc = new Scanner(System.in);
		//가로, 세로 입력받기
		System.out.print("가로 입력>> ");
		rect.width = sc.nextInt();
		System.out.print("세로 입력>> ");
		rect.height = sc.nextInt();
		System.out.print("색상 입력>> ");
		rect.color = sc.next();
		
		Rectangle rect2 = new Rectangle(1, 1, "Black");    // 매개변수 3개를 갖는 생성자
		System.out.println("기본 "+rect2.getColor() +"사각형의 면적 = "+rect2.getArea());
		             //     기본 Black 사각현의 면적 = 1
		
		// 면적과 색상 출력
		System.out.println(rect.getColor() + "사각형의 면적 = "+ rect.getArea());
		sc.close();
		}
}
