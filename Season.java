import java.util.Scanner;

/* [��2-14] 1~12 ������ ���ڸ� �Է¹޾� ��, ����, ����, �ܿ��� �Ǵ��ϴ� ���α׷�
 *             =>switch~case�� ���
 */
public class Season {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���(1~12 ������ ���ڸ� �Է�)>> ");
		int month = sc.nextInt();
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println(month+"���� ���Դϴ�.");
			break;
			
		case 6:
		case 7:
		case 8:
			System.out.println(month+"���� �����Դϴ�.");
			break;
			
		case 9:
		case 10:
		case 11:
			System.out.println(month+"���� �����Դϴ�");
			break;
			
		case 12: case 1: case 2:
			System.out.println(month+"���� �ܿ��Դϴ�.");
			break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			
		}
		sc.close();
	}

}
