import java.util.*;

public class HashMapDict {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// (1)해시맵 생성
		HashMap <String, String> dict = new HashMap<String, String>();
		
		// (2)해시맵에 영어단어와 한글단어 저장
		System.out.print("영한사전에 등록할 단어의 개수 입력>> ");
		int cnt = sc.nextInt();
		for(int i=0; i<cnt; i++) {
			System.out.print("사전에 등록할 영어 단어 입력>> ");
			String eng = sc.next();  //키
			System.out.print(eng+ "에 해당하는 한글 단어 입력>> ");
			String kor = sc.next();  //값
			dict.put(eng, kor);      //해시맵에 저장
		}
		// (3)해시맵에 들어 있는 키와 값을 쌍으로 먼저 출력
		// ====> 해시맵의 모든 키를 Set컬렉션으로 저장
		Set<String> keys = dict.keySet();
		Iterator<String> it = keys.iterator();  // =====>keys인 세트에 순차적으로 접근하기 위해
		
		while( it.hasNext() ) {  // ====> 방문할 값이 있으면 반복
			String k = it.next();  // it 객체를 통해 키 방문
			String value = dict.get( k );  // k에 해당하는 값을 해시맵에서 가져오기
			System.out.println("( "+ k + ", " + value + " ) ");
		}
		
		System.out.println();
		
		// (4)사용자로부터 검색할 영어단어 입력받아 한글단어 출력
		for(int i=0; i<cnt; i++) {
			System.out.print("찾고 싶은 단어 입력>> ");
			String engWord = sc.next();
			
			String korWord = dict.get(engWord);  // 해시맵에서 engWord 키에 해당하는 한글단어 찾기
			                                     // 키에 engWord가 없으면 null 반환
			if( korWord==null ) {
				System.out.println(engWord+"는 없는 단어입니다.\n 프로그램을 종료합니다.");
				break;
			}
			else
				System.out.println(korWord);
		}
		sc.close();

	}

}
