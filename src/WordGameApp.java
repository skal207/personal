import java.util.Scanner;

class Player{
	Scanner sc;
	private String name;            // �������� �̸�
	private String word;            // �����ڰ� ���� �ܾ�
	
	public Player(String name) {    // �̸��� ���޹޾� ������� name�� �����ϴ� ������ ����
		this.name = name;
		sc = new Scanner(System.in);
	}
	public String gerName() {       // �� ����� �̸��� ��ȯ�ϴ� �޼ҵ�
		return name;
	}
	
	public String sayWord() {       // Ű����κ��� �Է¹��� �ܾ WordGameAppŬ������run()�� ��ȯ
		System.out.print(name+">> ");
		word = sc.next();
		return word;
	}
	
	// lastWord="�ƹ���" �� ������ "��"�� �Է��� ù���ڰ� ������ ��
	public boolean succeed(String lastWord) {
		int lastIndex = lastWord.length()-1;     // �� ������ �ε���
		
		// �������ܾ� �� ���� == �����ڰ� ���� �ܾ��� ù ���� ��      �ƹ���"��"==������"��"    ������"��"==�̾��ð�"��"
		if( lastWord.charAt(lastIndex)==word.charAt(0) )
			return true;
		else
			return false;
	}
}

public class WordGameApp {
	private Scanner sc;
	private String startWord = "�ƹ���";
	private Player[] players;    //�����ڵ� ��ü�迭�� ����
	public WordGameApp() {
		sc = new Scanner(System.in);
	}
	
	private void createPlayer() {   //========== ������ ���� �Է¹ް�, �ο��� ��ŭ Player[]�� �����ϴ� �޼ҵ�
		System.out.print("���ӿ� �����ϴ� �ο��� �� ���Դϱ�?>> ");
		int nPlayer = sc.nextInt();
		
		players = new Player[nPlayer];  // ������ �� ��ŭ �迭 ����
		
		for( int i=0; i<nPlayer; i++ ) {
			System.out.print( (i+1)+"�� ������ �̸��� �Է��ϼ���>> ");
			String name = sc.next();
			players[i] = new Player(name);  // ������ �̸��� �����Ͽ� �ɹ� ������ �����ϴ� ������ ȣ��
		}
	}
	
	public void run() {         //=============���� �������� �޼ҵ�
		createPlayer();         // ���� ������ ���� �̸� �Է¹޴� �޼ҵ� ȣ��
		
		String lastWord = startWord;    // "�ƹ���"���� ����
		System.out.println("���۴ܾ�� <"+lastWord+"> �Դϴ�");
		
		// 3���̶��, 0��-1��-2��-0��-1��-2��.....
		int next=0;
		
		while(true) {
			String newWord = players[next].sayWord();    //�ܾ� �Է¹޴� �޼ҵ� ȣ�� : ������ - �̾��ð�
			
			if( !players[next].succeed(lastWord) ) {
				System.out.println( players[next].gerName()+"�� �����ϴ�.");
				break;      // ���ӿ� �����Ƿ�, ���ѹݺ��� ����
			}
			next++;         // ���� ����� ���ϵ��� ����(�� �ѱ�)               => 1
			next %= players.length; //next = next%players.length();      next=1%
			lastWord = newWord;     // ������ �ܾ ������Ʈ                 lastWord=������
		}
		sc.close();
	}
	public static void main(String[] args) {
		WordGameApp game = new WordGameApp();
        game.run();             //���� ���� �޼ҵ� ȣ��
	}

}
