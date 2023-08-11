import java.util.*;

/*
 *  2000년~2009년 까지 1년단위의 키 10개를 입력받아 백터에 저장
 *  => 가장 많이 자란 키와 년도를 출력
 */
public class Tall {

	public static void main(String[] args) {
		// (1) 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2000년~2009년 까지 1년 단위로 키를 10개 입력하세요.");
		
		// (2) 백터 객체 생성
		Vector<Double> v = new Vector<Double>();
		
		// (3) 10개의 키 입력받아 백터에 저장
		for(int i=1; i<=10; i++) {
			double cm = sc.nextDouble();  // 키보드에 입력
			v.add( cm );                  //백터에 저장
		}
		// (4) 올해와 내년 키를 비교하여 차이값 계산, 차이값이 가장 큰 년도 기억하기 => 반복문
		double max = 0;
		int year = 0;
		for(int i=0; i<v.size(); i++) {
			double dist = v.get(i+1) - v.get(i);
			if( max<dist ) {
				max = dist;
				year = i;
			}
		}
		// (5) 출력
		System.out.println("가장 키가 많이 큰 년도 "+ (2000+year)+"년으로 "+max+"cm 성장했다.");
		sc.close();

	}

}
