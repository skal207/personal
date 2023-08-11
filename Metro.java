import java.util.Scanner;

public class Metro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//==================================================================================
		// 윤년 판단 프로그램 : 4의 배수이면서 100의 배수가 아니거나 400의 배수는 무조건 윤년
		System.out.println("년도를 입력하면 윤년 여부를 판단해 줍니다.");
		System.out.print("년도 입력 >> ");
		int year = sc.nextInt();
		
		System.out.println( year+"년은 "+ ( (year%4==0 && year%100!=0 || year%400==0)? "윤년":"평년" )+"입니다.");
		
		//==================================================================================
		
		
		System.out.print("수도입니까?(1=수도, 0=수도아님) >> ");
		int city = sc.nextInt();   //1 또는 0을 입력받음
		System.out.print("인구 수를 입력하세요(단위:백만) >> ");
		int cnt = sc.nextInt();
		System.out.print("연 소득이 1억이상인 인구수는? >> ");
		int rich = sc.nextInt();
		
		// 메트로폴리스 여부 출력           (첫번째 조건) || (두번째 조건)
		//                        (city==1 && cnt>=100) || (rich>=50)
		System.out.println("광역도시 여부 = "+ ((city==1 && cnt>=100) || (rich>=50)? true: false));
		sc.close();
	}

}
