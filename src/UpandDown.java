import java.util.Scanner;

/*  [����] do~while���� �̿��Ͽ� ���� 55�� �� �� ���� ���ߴ��� �ۼ��Ͻÿ�.
 * 
 */
public class UpandDown {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int answer = 55;       //����
		int tries = 0;         //�õ�Ƚ��
		int guess;             //�����Է¼�
		
		do {
			System.out.print("1~100������ �� ��, ������ ���߾� ������ : ");
			guess = sc.nextInt();
			if( guess>answer )
				System.out.println("Down!");
			else if( guess<answer )
				System.out.println("Up!");
			
            tries++;
		}while( guess!=answer );
		System.out.println(tries+"�� ���� ������ ���߼̱���, �����մϴ�!");
		sc.close();
	}
}
