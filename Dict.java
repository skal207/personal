import java.util.Scanner;

public class Dict {

	public static void main(String[] args) {
		// ����ܾ� �迭�� �ѱ� �迭 ����
		String eng[] = { "student", "love", "happy", "dirty", "future", "old", "notify", "university", "adult", "baby" };
		//                  [0]       [1]     [2]      [3]       [4]     [5]      [6]         [7]        [8]      [9]
		String kor[] = {   "�л�",    "���", "�ູ��",  "������",  "�̷�",  "������", "�˸���",      "����",     "����",   "�Ʊ�" };
		
		Scanner sc = new Scanner(System.in);
		String word;        // Ű����κ��� �Է¹޴� ���ܾ�
		
		// ����ܾ� �Է¹ް�, exit�� ������ ��  => ���ѹݺ�
		while(true) {
			System.out.print("���� �ܾ �Է��ϼ���>> ");
			word = sc.next();
			word = word.toLowerCase();    // �ҹ��ڷ� ��ȯ
			
			if( word.equals("exit") ) {
				System.out.println("\n���α׷��� �����մϴ�...");
				break;      // ���ѹݺ��� ����
			}
			
			int i;
			for( i=0; i<eng.length; i++) {        // ����ܾ� ã�� �ݺ���
				if( eng[i].equals(word) ) {          // ����ܾ ������ �ѱ� ���
					System.out.println( kor[i] );
					break;
				}
			}
			
			if( i==eng.length )       // �迭 ���������� �˻��������� �ұ��ϰ� ��ã�� ���
				System.out.println("���� �ܾ��Դϴ�.");
		}
		sc.close();
		// ����ܾ� �迭���� �˻� => ��ġ(�ε���)
		
		
		//�ε����� �ش��ϴ� �ѱ� �迭�� ���� ���

	}

}
