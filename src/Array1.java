import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int[5];
		int max = 0;
		
		int sum = 0;
		
		System.out.println("��� 5���� �Է��ϼ���.");
		//for(int i=0; i<5; i++) {
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = sc.nextInt();
			
			sum+=intArray[i];
			
			if( max<intArray[i] )
				max = intArray[i];
		}
        System.out.println("���� ū ���� "+max+"�Դϴ�.");
        System.out.println("�Է��� ����� ��� = "+sum/intArray.length);
        sc.close();
	}

}