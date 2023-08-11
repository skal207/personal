import java.util.Scanner;

public class NestedIF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("점수를 입력하세요(0~100):");
	    int score = sc.nextInt();   //점수 작성
	    System.out.print("학년을 입력하세요(1~4):");
	    int year = sc.nextInt();    //학년 작성
	    
	    if(score >= 60) {   //60점 이상
	    	if(year != 4)
	    		System.out.println("합격!");  //4학년이 아니면 합격
	    	else if(score >= 70)
	    		System.out.println("합격!");  //4학년이 70점 이상이면 합격
	    	else
	    		System.out.println("불합격!");//4학년이 70점 미만이면 불합격
	    }
	    else
	    	System.out.println("불합격!");    //60점 미만 불합격
	    
	    sc.close();
	}

}
