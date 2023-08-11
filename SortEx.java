import java.util.Scanner;

public class SortEx {

	public static void main(String[] args) {
		// 정수형 배열 10개 생성, 스캐너 객체 생성
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 10개를 입력하세요.");
		
		// 10개 정수 배열에 입력받기 : a[0]=sc.nextInt()   a[1]=sc.nextInt();   a[2]=sc.nextInt()
		for( int i=0; i<a.length; i++ )
			a[i] = sc.nextInt();
		
		// 오름차순 절렬 : a[0]에 가장 작은 값 => a[0] > 1번방~끝번방   a[1] > 2번방~끝번방 ... a[8] > 끝번방
        for( int i=0; i<a.length-1; i++ )
        	for( int j=i+1; j<a.length; j++ ) {
        		if( a[i]>a[j] ) {
        			int imsi = a[i];
        			a[i] = a[j];
        			a[j] = imsi;
        		}
        	}
        
        // 출력
        System.out.println("정렬된 결과>> ");
        for( int i=0; i<a.length; i++ )
        	System.out.print(a[i]+"  ");
        
        sc.close();
	}

}
