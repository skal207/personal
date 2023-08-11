import java.util.Scanner;

public class Dict {

	public static void main(String[] args) {
		// 영어단어 배열과 한글 배열 생성
		String eng[] = { "student", "love", "happy", "dirty", "future", "old", "notify", "university", "adult", "baby" };
		//                  [0]       [1]     [2]      [3]       [4]     [5]      [6]         [7]        [8]      [9]
		String kor[] = {   "학생",    "사랑", "행복한",  "더러운",  "미래",  "오래된", "알리다",      "대학",     "성인",   "아기" };
		
		Scanner sc = new Scanner(System.in);
		String word;        // 키보드로부터 입력받는 영단어
		
		// 영어단어 입력받고, exit와 감은지 비교  => 무한반복
		while(true) {
			System.out.print("영어 단어를 입력하세요>> ");
			word = sc.next();
			word = word.toLowerCase();    // 소문자로 변환
			
			if( word.equals("exit") ) {
				System.out.println("\n프로그램을 종료합니다...");
				break;      // 무한반복문 종료
			}
			
			int i;
			for( i=0; i<eng.length; i++) {        // 영어단어 찾는 반복문
				if( eng[i].equals(word) ) {          // 영어단어가 있으면 한글 출력
					System.out.println( kor[i] );
					break;
				}
			}
			
			if( i==eng.length )       // 배열 마지막까지 검색했음에도 불구하고 못찾은 경우
				System.out.println("없는 단어입니다.");
		}
		sc.close();
		// 영어단어 배열에서 검색 => 위치(인덱스)
		
		
		//인덱스에 해당하는 한글 배열의 값을 출력

	}

}
