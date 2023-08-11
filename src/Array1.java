import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int[5];
		int max = 0;
		
		int sum = 0;
		
		System.out.println("양수 5개를 입력하세요.");
		//for(int i=0; i<5; i++) {
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = sc.nextInt();
			
			sum+=intArray[i];
			
			if( max<intArray[i] )
				max = intArray[i];
		}
        System.out.println("가장 큰 수는 "+max+"입니다.");
        System.out.println("입력한 양수의 평균 = "+sum/intArray.length);
        sc.close();
	}

}
