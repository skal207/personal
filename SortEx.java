import java.util.Scanner;

public class SortEx {

	public static void main(String[] args) {
		// ������ �迭 10�� ����, ��ĳ�� ��ü ����
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 10���� �Է��ϼ���.");
		
		// 10�� ���� �迭�� �Է¹ޱ� : a[0]=sc.nextInt()   a[1]=sc.nextInt();   a[2]=sc.nextInt()
		for( int i=0; i<a.length; i++ )
			a[i] = sc.nextInt();
		
		// �������� ���� : a[0]�� ���� ���� �� => a[0] > 1����~������   a[1] > 2����~������ ... a[8] > ������
        for( int i=0; i<a.length-1; i++ )
        	for( int j=i+1; j<a.length; j++ ) {
        		if( a[i]>a[j] ) {
        			int imsi = a[i];
        			a[i] = a[j];
        			a[j] = imsi;
        		}
        	}
        
        // ���
        System.out.println("���ĵ� ���>> ");
        for( int i=0; i<a.length; i++ )
        	System.out.print(a[i]+"  ");
        
        sc.close();
	}

}
