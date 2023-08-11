import java.util.Scanner;

/*  [문제] 피보나치 수열을 입력받은 개수만큼 0부터 출력하시오.
 *        출력하고자 하는 피보나치 수열의 개수를 입력하세요 >> 8
 *        : 0 1 1 2 3 5 8 13
 */
public class Pibo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력하고자 하는 피보나치 수열의 개수 입력>> ");
		int cnt = sc.nextInt();
		
		int num1=0;
		int num2=1;
		int next=0;
		
		System.out.print(num1 + "\t"+num2+"\t");
		for(int i=3; i<=cnt; i++) {
			next = num1+num2;
			System.out.print(next+"\t");
			
			num1 = num2;
			num2 = next;
			
			sc.close();
		}
	}

}
