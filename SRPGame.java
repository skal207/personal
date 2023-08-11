import java.util.Scanner;
/*
 * 가위바위보 게임
 */
public class SRPGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<< 가위/바위/보 게임 시작! >>");
		System.out.println("== 가위,바위,보 중 하나를 입력하세요 : ");
		
		System.out.print("철수>> ");
		String cheol = sc.next();
		System.out.print("영희>> ");
		String young = sc.next();
		
		if( cheol.equals("가위") ) {     //철수 = 가위
			if( young.equals("가위") )   //영희 = 가위
				System.out.println("비겼습니다.");
			else if( young.equals("바위") )    //영희 = 바위
				System.out.println("영희가 이겼습니다.");
			else                              //영희 = 보
				System.out.println("철수가 이겼습니다.");
		}
		else if( cheol.equals("바위") ) {  //철수 = 바위
			if( young.equals("가위") )
				System.out.println("철수가 이겼습니다.");
			else if( young.equals("바위") )
				System.out.println("비겼습니다.");
			else
				System.out.println("영희가 이겼습니다.");
			
		}
		else {        //철수 = 보
			if( young.equals("가위") )
				System.out.println("영희가 이겼습니다.");
			else if( young.equals("바위") )
				System.out.println("철수가 이겼습니다.");
			else
				System.out.println("비겼습니다.");
			
			sc.close();
		}
	}
}
