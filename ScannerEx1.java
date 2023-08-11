import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   //(ctrl)+(shift)+(o)
		
		System.out.println("이름, 나이, 체중, 독신여부를 반칸으로 분리하여 입력하세요.");
		String name = sc.next();   //다음 문자열토큰 읽어오기
		int age = sc.nextInt();    //다음 정수형 토큰 읽어오기
		double kg = sc.nextDouble();//다음 실수값토큰 읽어오기
	    boolean single = sc.nextBoolean();  //다음 불리언토큰 읽어오기
	    
	    System.out.println("당신의 이름 = " + name + "이고, " + age +"살 입니다.");
	    System.out.println("당신의 몸무게는 "+kg +"이고, 독신여부는 "+ single+"입니다." );
	    
	    sc.close();     //Scanner스트림 닫기
	}

}
