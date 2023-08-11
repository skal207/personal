import java.util.Scanner;

// ����=> 2589630 ó�� ū ���� �Է½� �� ��, �� �ð�, �� ��, �� �� ���

public class TimetoSecond {
	public static void main(String[] args) {
		// [1] ��ĳ�� ��ü ����
		Scanner sc = new Scanner(System.in);
		
		// [2] ���� �Է¹ޱ�
		System.out.print("�ʴ����� ������ �Է��ϼ���>> ");
		int time = sc.nextInt();           //���������� �Է¹ޱ� if time=4000
		
		// [3] ��, ��, �ð� ����ϱ�
		int second = time % 60;            //�����ʸ� 60���� ���� �������� �ʷ� ���� 2589630%60 = 30��
		int minute = (time/60)%60;         //2589630/60 = 43160, 43160%60 = 20��
		int hour = (time/60)/60%24;       //(2589630/60)/60 => 43160/60 => 719%24 = 23�ð�
		int day = (time/60)/60/24;       //(2589630/60)/60 => 43160/60 => 719/24 = 29��
		
		// [4] ��� �� ��ĳ�� �ݱ�
		System.out.println(time+"�� ��ȯ >> "+day+"��, "+hour+"�ð�, "+minute+"��, "+second+"��");
		
		sc.close();
	}

}
