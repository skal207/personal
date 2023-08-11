import java.util.InputMismatchException;
import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		int []movie = new int[10];
		int count = 10, seat;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//�¼���ȣ ���
			System.out.println("====================================");
			for(int i=0; i<movie.length; i++)
				System.out.print(i+"  ");
			
			System.out.println();
			//������Ȳ ���
			for(int i=0; i<movie.length; i++)
				System.out.print( movie[i]+"  ");
			System.out.println("\n====================================");
			
			//�ܿ��¼� �� ���
			System.out.println("\n���� �ܿ� �¼��� = "+ count);
			
			// [����] 99�� �Է¹����� ���α׷��� �����ϴ� �ڵ带 �ϼ��ϼ���
			//�¼���ȣ �Է¹޾� ���༺���� �ڸ����� �����Ǵ�
			System.out.print("�� ��° �ڸ��� �����Ͻðڽ��ϱ�?>> ");
			try {
				seat = sc.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println("������ �Է��ϼž� �մϴ�.");
				sc.next();
				continue;
			}
			if( seat==99 ) {
				break;
			}
			
			else if( movie[seat]==0 ) {      // �� �ڸ��� ���
				movie[seat] = 1;
				count--;
				System.out.println("\n"+seat+"�� �ڸ� ���� �Ϸ�.");
			}
			else {                      // �̹� ����� �ڸ��� ���
				System.out.println("\n"+seat+"�� �ڸ��� �̹� ����� �ڸ��Դϴ�.");
				System.out.println("�ٸ� �ڸ��� ������ �ּ���.");
			}
			
			// ������ ���
			if( count==0) {
				System.out.println("\n�����Դϴ�, ������ �ٽ� �̿����ּ���.");
				break;
			}
		}
		System.out.println("���� ���� ���α׷� ����");
		sc.close();
	}
}
