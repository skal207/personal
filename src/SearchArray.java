import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �� �� �Է��Ͻðڽ��ϱ�?>> ");
		
		int size = sc.nextInt();
		int score[] = new int[size];
		
		for(int i=0; i<score.length; i++) {
			System.out.print( (i+1)+"��° �� �Է� : ");
			score[i] = sc.nextInt();
		}
		
		System.out.print("ã���� �ϴ� ���� �Է��ϼ���>> ");
		int v = sc.nextInt();
		
		int find = 0;
		
		int i;
		for( i=0; i<score.length; i++) {
			if( v==score[i] ) {
				find = 1;
				//System.out.println(v+"���� "+i+"�� �濡 �ֽ��ϴ�.");
				break;
			}
		}
		
		if( find==0 )
			System.out.println("ã�� ����!");
		else
			System.out.println(v+"���� "+i+"�� �濡 �ֽ��ϴ�.");
		
		sc.close();
	}
}
