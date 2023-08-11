import java.util.Scanner;

/*  [문제] do~while문을 이용하여 정답 55를 몇 번 만에 맞추는지 작성하시오.
 * 
 */
public class UpandDown {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int answer = 55;       //정답
		int tries = 0;         //시도횟수
		int guess;             //추측입력수
		
		do {
			System.out.print("1~100까지의 수 중, 정답을 맞추어 보세요 : ");
			guess = sc.nextInt();
			if( guess>answer )
				System.out.println("Down!");
			else if( guess<answer )
				System.out.println("Up!");
			
            tries++;
		}while( guess!=answer );
		System.out.println(tries+"번 만에 정답을 맞추셨군요, 축하합니다!");
		sc.close();
	}
}
