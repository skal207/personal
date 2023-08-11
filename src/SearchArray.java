import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 몇 개 입력하시겠습니까?>> ");
		
		int size = sc.nextInt();
		int score[] = new int[size];
		
		for(int i=0; i<score.length; i++) {
			System.out.print( (i+1)+"번째 값 입력 : ");
			score[i] = sc.nextInt();
		}
		
		System.out.print("찾고자 하는 값을 입력하세요>> ");
		int v = sc.nextInt();
		
		int find = 0;
		
		int i;
		for( i=0; i<score.length; i++) {
			if( v==score[i] ) {
				find = 1;
				//System.out.println(v+"값은 "+i+"번 방에 있습니다.");
				break;
			}
		}
		
		if( find==0 )
			System.out.println("찾기 실패!");
		else
			System.out.println(v+"값은 "+i+"번 방에 있습니다.");
		
		sc.close();
	}
}
