import java.util.Scanner;

/*
 *        Circle 클래스 만들기
 *       - 멤버변수 : int radius, String name
 *       - 멤버메소드 : double getArea()
 */
public class Circle {
	// 멤버변수
	int radius;
	String name;
	
	//멤버메소드
    public double getArea() {
    	return 3.14*radius*radius;
    }
    
    
	public static void main(String[] args) {
		// 객체를 생성하여 처리
		Circle pizza = new Circle();        // Circle 객체 pizza 하나 생성
		pizza.radius = 10;                  // pizza의 반지름 10
		pizza.name = "고르곤졸라";             // pizza의 이름 "고르곤졸라"
		
		double result = pizza.getArea();    //피자의 면적 계산하기
		System.out.println(pizza.name +" 파지의 면적은 "+ result);
		
		Circle donut = new Circle();        // Circle 객체 donut 하나 생성
		System.out.print("피자의 반지름 입력 : ");
		Scanner sc = new Scanner(System.in);
		donut.radius = sc.nextInt();
		System.out.print("드시고 싶은 피자는?>> ");
		donut.name = sc.next();
		
		System.out.println(donut.name+" 피자의 면적은 "+ donut.getArea());
		
		sc.close();
		

	}

}
