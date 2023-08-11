import java.util.InputMismatchException;
import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		int []movie = new int[10];
		int count = 10, seat;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//좌석번호 출력
			System.out.println("====================================");
			for(int i=0; i<movie.length; i++)
				System.out.print(i+"  ");
			
			System.out.println();
			//예약현황 출력
			for(int i=0; i<movie.length; i++)
				System.out.print( movie[i]+"  ");
			System.out.println("\n====================================");
			
			//잔여좌석 수 출력
			System.out.println("\n현재 잔여 좌석수 = "+ count);
			
			// [과제] 99를 입력받으면 프로그램을 종료하는 코드를 완성하세요
			//좌석번호 입력받아 예약성공할 자리인지 조건판단
			System.out.print("몇 번째 자리를 예약하시겠습니까?>> ");
			try {
				seat = sc.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println("정수를 입력하셔야 합니다.");
				sc.next();
				continue;
			}
			if( seat==99 ) {
				break;
			}
			
			else if( movie[seat]==0 ) {      // 빈 자리인 경우
				movie[seat] = 1;
				count--;
				System.out.println("\n"+seat+"번 자리 예약 완료.");
			}
			else {                      // 이미 예약된 자리인 경우
				System.out.println("\n"+seat+"번 자리는 이미 예약된 자리입니다.");
				System.out.println("다른 자리를 예약해 주세요.");
			}
			
			// 매진인 경우
			if( count==0) {
				System.out.println("\n매진입니다, 다음에 다시 이용해주세요.");
				break;
			}
		}
		System.out.println("극장 예약 프로그램 종료");
		sc.close();
	}
}
