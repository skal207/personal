import java.util.Scanner;
/*
 * ���������� ����
 */
public class SRPGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<< ����/����/�� ���� ����! >>");
		System.out.println("== ����,����,�� �� �ϳ��� �Է��ϼ��� : ");
		
		System.out.print("ö��>> ");
		String cheol = sc.next();
		System.out.print("����>> ");
		String young = sc.next();
		
		if( cheol.equals("����") ) {     //ö�� = ����
			if( young.equals("����") )   //���� = ����
				System.out.println("�����ϴ�.");
			else if( young.equals("����") )    //���� = ����
				System.out.println("���� �̰���ϴ�.");
			else                              //���� = ��
				System.out.println("ö���� �̰���ϴ�.");
		}
		else if( cheol.equals("����") ) {  //ö�� = ����
			if( young.equals("����") )
				System.out.println("ö���� �̰���ϴ�.");
			else if( young.equals("����") )
				System.out.println("�����ϴ�.");
			else
				System.out.println("���� �̰���ϴ�.");
			
		}
		else {        //ö�� = ��
			if( young.equals("����") )
				System.out.println("���� �̰���ϴ�.");
			else if( young.equals("����") )
				System.out.println("ö���� �̰���ϴ�.");
			else
				System.out.println("�����ϴ�.");
			
			sc.close();
		}
	}
}
