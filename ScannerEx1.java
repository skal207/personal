import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   //(ctrl)+(shift)+(o)
		
		System.out.println("�̸�, ����, ü��, ���ſ��θ� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
		String name = sc.next();   //���� ���ڿ���ū �о����
		int age = sc.nextInt();    //���� ������ ��ū �о����
		double kg = sc.nextDouble();//���� �Ǽ�����ū �о����
	    boolean single = sc.nextBoolean();  //���� �Ҹ�����ū �о����
	    
	    System.out.println("����� �̸� = " + name + "�̰�, " + age +"�� �Դϴ�.");
	    System.out.println("����� �����Դ� "+kg +"�̰�, ���ſ��δ� "+ single+"�Դϴ�." );
	    
	    sc.close();     //Scanner��Ʈ�� �ݱ�
	}

}
