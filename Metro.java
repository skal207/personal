import java.util.Scanner;

public class Metro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//==================================================================================
		// ���� �Ǵ� ���α׷� : 4�� ����̸鼭 100�� ����� �ƴϰų� 400�� ����� ������ ����
		System.out.println("�⵵�� �Է��ϸ� ���� ���θ� �Ǵ��� �ݴϴ�.");
		System.out.print("�⵵ �Է� >> ");
		int year = sc.nextInt();
		
		System.out.println( year+"���� "+ ( (year%4==0 && year%100!=0 || year%400==0)? "����":"���" )+"�Դϴ�.");
		
		//==================================================================================
		
		
		System.out.print("�����Դϱ�?(1=����, 0=�����ƴ�) >> ");
		int city = sc.nextInt();   //1 �Ǵ� 0�� �Է¹���
		System.out.print("�α� ���� �Է��ϼ���(����:�鸸) >> ");
		int cnt = sc.nextInt();
		System.out.print("�� �ҵ��� 1���̻��� �α�����? >> ");
		int rich = sc.nextInt();
		
		// ��Ʈ�������� ���� ���           (ù��° ����) || (�ι�° ����)
		//                        (city==1 && cnt>=100) || (rich>=50)
		System.out.println("�������� ���� = "+ ((city==1 && cnt>=100) || (rich>=50)? true: false));
		sc.close();
	}

}
