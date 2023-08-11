import java.util.*;

/*
 *  2000��~2009�� ���� 1������� Ű 10���� �Է¹޾� ���Ϳ� ����
 *  => ���� ���� �ڶ� Ű�� �⵵�� ���
 */
public class Tall {

	public static void main(String[] args) {
		// (1) ��ĳ�� ��ü ����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2000��~2009�� ���� 1�� ������ Ű�� 10�� �Է��ϼ���.");
		
		// (2) ���� ��ü ����
		Vector<Double> v = new Vector<Double>();
		
		// (3) 10���� Ű �Է¹޾� ���Ϳ� ����
		for(int i=1; i<=10; i++) {
			double cm = sc.nextDouble();  // Ű���忡 �Է�
			v.add( cm );                  //���Ϳ� ����
		}
		// (4) ���ؿ� ���� Ű�� ���Ͽ� ���̰� ���, ���̰��� ���� ū �⵵ ����ϱ� => �ݺ���
		double max = 0;
		int year = 0;
		for(int i=0; i<v.size(); i++) {
			double dist = v.get(i+1) - v.get(i);
			if( max<dist ) {
				max = dist;
				year = i;
			}
		}
		// (5) ���
		System.out.println("���� Ű�� ���� ū �⵵ "+ (2000+year)+"������ "+max+"cm �����ߴ�.");
		sc.close();

	}

}
