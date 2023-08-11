import java.util.Scanner;

/* [예2-14] 1~12 사이의 숫자를 입력받아 봄, 여름, 가을, 겨울을 판단하는 프로그램
 *             =>switch~case문 사용
 */
public class Season {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력하세요(1~12 사이의 숫자만 입력)>> ");
		int month = sc.nextInt();
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println(month+"월은 봄입니다.");
			break;
			
		case 6:
		case 7:
		case 8:
			System.out.println(month+"월은 여름입니다.");
			break;
			
		case 9:
		case 10:
		case 11:
			System.out.println(month+"월은 가을입니다");
			break;
			
		case 12: case 1: case 2:
			System.out.println(month+"월은 겨울입니다.");
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			
		}
		sc.close();
	}

}
