import java.util.Scanner;

public class Game369 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<< 369 게임 시작! >>");
		System.out.print("(1~99까지의)정수를 입력하세요 : ");
		int sum = sc.nextInt();
		
		if(sum >= 10) {                    //입력받은 값이 두 자릿수 일 때
			
		    int first = sum/10;
		    int second = sum%10;
	
		    if((first%3 == 0) && (second%3 == 0)) 
			    System.out.println("박수짝짝");
		    else if((first%3 == 0) || (second%3 == 0)) 
			    System.out.println("박수짝");
		    else
			    System.out.println("박수없음");
		}
		else {                            //입력받은 값이 한 자릿수 일 때
			if(sum%3 == 0)
				System.out.println("박수짝");
			else
				System.out.println("박수없음");
			
			sc.close();
		}
	}
}
