import java.util.Scanner;

class Player{
	Scanner sc;
	private String name;            // 참가자의 이름
	private String word;            // 참가자가 말한 단어
	
	public Player(String name) {    // 이름을 전달받아 멤버변수 name에 셋팅하는 생성자 구현
		this.name = name;
		sc = new Scanner(System.in);
	}
	public String gerName() {       // 진 사람의 이름을 반환하는 메소드
		return name;
	}
	
	public String sayWord() {       // 키보드로부터 입력받은 단어를 WordGameApp클래스의run()로 반환
		System.out.print(name+">> ");
		word = sc.next();
		return word;
	}
	
	// lastWord="아버지" 의 끝글자 "지"와 입력한 첫글자가 같은지 비교
	public boolean succeed(String lastWord) {
		int lastIndex = lastWord.length()-1;     // 끝 글자의 인덱스
		
		// 마지막단어 끝 글자 == 참가자가 말한 단어의 첫 글자 비교      아버지"지"==지렁이"지"    지렁이"이"==이쑤시개"이"
		if( lastWord.charAt(lastIndex)==word.charAt(0) )
			return true;
		else
			return false;
	}
}

public class WordGameApp {
	private Scanner sc;
	private String startWord = "아버지";
	private Player[] players;    //참가자들 객체배열로 선언만
	public WordGameApp() {
		sc = new Scanner(System.in);
	}
	
	private void createPlayer() {   //========== 참가자 수를 입력받고, 인원수 만큼 Player[]을 생성하는 메소드
		System.out.print("게임에 참가하는 인원는 몇 명입니까?>> ");
		int nPlayer = sc.nextInt();
		
		players = new Player[nPlayer];  // 참가자 수 만큼 배열 생성
		
		for( int i=0; i<nPlayer; i++ ) {
			System.out.print( (i+1)+"번 참가자 이름을 입력하세요>> ");
			String name = sc.next();
			players[i] = new Player(name);  // 참가자 이름을 전달하여 맴버 변수로 셋팅하는 생성자 호출
		}
	}
	
	public void run() {         //=============게임 진행히는 메소드
		createPlayer();         // 게임 참가자 수와 이름 입력받는 메소드 호출
		
		String lastWord = startWord;    // "아버지"부터 시작
		System.out.println("시작단어는 <"+lastWord+"> 입니다");
		
		// 3명이라면, 0번-1번-2번-0번-1번-2번.....
		int next=0;
		
		while(true) {
			String newWord = players[next].sayWord();    //단어 입력받는 메소드 호출 : 지렁이 - 이쑤시개
			
			if( !players[next].succeed(lastWord) ) {
				System.out.println( players[next].gerName()+"이 졌습니다.");
				break;      // 게임에 졌으므로, 무한반복문 종료
			}
			next++;         // 다음 사람이 말하도록 증가(텀 넘김)               => 1
			next %= players.length; //next = next%players.length();      next=1%
			lastWord = newWord;     // 마지막 단어를 업데이트                 lastWord=지렁이
		}
		sc.close();
	}
	public static void main(String[] args) {
		WordGameApp game = new WordGameApp();
        game.run();             //게임 진행 메소드 호출
	}

}
