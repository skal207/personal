import java.util.Scanner;

// 과제=> 2589630 처럼 큰 정수 입력시 몇 일, 몇 시간, 몇 분, 몇 초 계산

public class TimetoSecond {
	public static void main(String[] args) {
		// [1] 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// [2] 정수 입력받기
		System.out.print("초단위의 정수를 입력하세요>> ");
		int time = sc.nextInt();           //정수형으로 입력받기 if time=4000
		
		// [3] 초, 분, 시간 계산하기
		int second = time % 60;            //정수초를 60으로 나눈 나머지가 초로 계산됨 2589630%60 = 30초
		int minute = (time/60)%60;         //2589630/60 = 43160, 43160%60 = 20분
		int hour = (time/60)/60%24;       //(2589630/60)/60 => 43160/60 => 719%24 = 23시간
		int day = (time/60)/60/24;       //(2589630/60)/60 => 43160/60 => 719/24 = 29일
		
		// [4] 출력 후 스캐너 닫기
		System.out.println(time+"초 변환 >> "+day+"일, "+hour+"시간, "+minute+"분, "+second+"초");
		
		sc.close();
	}

}
