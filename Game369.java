import java.util.Scanner;

public class Game369 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<< 369 ���� ����! >>");
		System.out.print("(1~99������)������ �Է��ϼ��� : ");
		int sum = sc.nextInt();
		
		if(sum >= 10) {                    //�Է¹��� ���� �� �ڸ��� �� ��
			
		    int first = sum/10;
		    int second = sum%10;
	
		    if((first%3 == 0) && (second%3 == 0)) 
			    System.out.println("�ڼ�¦¦");
		    else if((first%3 == 0) || (second%3 == 0)) 
			    System.out.println("�ڼ�¦");
		    else
			    System.out.println("�ڼ�����");
		}
		else {                            //�Է¹��� ���� �� �ڸ��� �� ��
			if(sum%3 == 0)
				System.out.println("�ڼ�¦");
			else
				System.out.println("�ڼ�����");
			
			sc.close();
		}
	}
}
