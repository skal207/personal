import java.util.Scanner;

public class salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n�� ���� ������ ������ �� ���� �˷��帳�ϴ�.(�� ���������� 2%)");
		System.out.print("������ �Է��ϼ���(�� ������) >>");
		int mon = sc.nextInt();      //���� �Է�
		System.out.print("�� �� ���� �����Ͻðڽ��ϱ�? >>");
		int year = sc.nextInt();     //���� �� �Ⱓ �Է�
		
		                             //((����+������ 2%)*12����)*���� �� �Ⱓ = n�� ���� ������ ������ �Ѿ�(2%�� ���� ����)
		System.out.println("������ �ݾ���" + (((mon+mon*0.02)*12)*year));
		
		sc.close();
	}

}
