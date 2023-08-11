/*  [문제]
 *       ★ 를 5행 10열에 찍어보기 => 중첩 For 사용
 */
public class NestedFor {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {         
			for(int j=0; j<10; j++) {
				System.out.print("★ ");
			}
			System.out.println();      //10개의 별 출력후 줄 바꾸기
		}

	}

}
