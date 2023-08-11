import java.util.Scanner;

public class salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n년 동안 저축한 월급의 총 액을 알려드립니다.(단 이자이율은 2%)");
		System.out.print("월급을 입력하세요(만 단위로) >>");
		int mon = sc.nextInt();      //월급 입력
		System.out.print("몇 년 동안 저축하시겠습니까? >>");
		int year = sc.nextInt();     //저축 할 기간 입력
		
		                             //((월급+월급의 2%)*12개월)*저축 할 기간 = n년 동안 저축한 월급의 총액(2%의 이자 포함)
		System.out.println("저축한 금액은" + (((mon+mon*0.02)*12)*year));
		
		sc.close();
	}

}
