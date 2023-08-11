import java.util.*;

public class HashMapDict {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// (1)�ؽø� ����
		HashMap <String, String> dict = new HashMap<String, String>();
		
		// (2)�ؽøʿ� ����ܾ�� �ѱ۴ܾ� ����
		System.out.print("���ѻ����� ����� �ܾ��� ���� �Է�>> ");
		int cnt = sc.nextInt();
		for(int i=0; i<cnt; i++) {
			System.out.print("������ ����� ���� �ܾ� �Է�>> ");
			String eng = sc.next();  //Ű
			System.out.print(eng+ "�� �ش��ϴ� �ѱ� �ܾ� �Է�>> ");
			String kor = sc.next();  //��
			dict.put(eng, kor);      //�ؽøʿ� ����
		}
		// (3)�ؽøʿ� ��� �ִ� Ű�� ���� ������ ���� ���
		// ====> �ؽø��� ��� Ű�� Set�÷������� ����
		Set<String> keys = dict.keySet();
		Iterator<String> it = keys.iterator();  // =====>keys�� ��Ʈ�� ���������� �����ϱ� ����
		
		while( it.hasNext() ) {  // ====> �湮�� ���� ������ �ݺ�
			String k = it.next();  // it ��ü�� ���� Ű �湮
			String value = dict.get( k );  // k�� �ش��ϴ� ���� �ؽøʿ��� ��������
			System.out.println("( "+ k + ", " + value + " ) ");
		}
		
		System.out.println();
		
		// (4)����ڷκ��� �˻��� ����ܾ� �Է¹޾� �ѱ۴ܾ� ���
		for(int i=0; i<cnt; i++) {
			System.out.print("ã�� ���� �ܾ� �Է�>> ");
			String engWord = sc.next();
			
			String korWord = dict.get(engWord);  // �ؽøʿ��� engWord Ű�� �ش��ϴ� �ѱ۴ܾ� ã��
			                                     // Ű�� engWord�� ������ null ��ȯ
			if( korWord==null ) {
				System.out.println(engWord+"�� ���� �ܾ��Դϴ�.\n ���α׷��� �����մϴ�.");
				break;
			}
			else
				System.out.println(korWord);
		}
		sc.close();

	}

}
