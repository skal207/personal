
public class RandomArray {

	public static void main(String[] args) {
		int intArray[][];
		intArray = new int[3][4];    // 2���� �迭 ����
		
        // 12���� ������ �����ϰ� �߻����� �迭�� ����
		for( int i=0; i<intArray.length; i++) {
			for( int j=0; j<intArray[i].length; j++ ) {
				intArray[i][j] = (int)(Math.random()*10);
			}
		}
		
		// 3�� 4���� ���� ���
		for( int i=0; i<intArray.length; i++ ) {
			for( int j=0; j<intArray[i].length; j++ )
				System.out.print(intArray[i][j] + "\t");
			
			System.out.println();
		}
		
		// 3�� 4���� ��� ���� ���Ͽ� �հ踦 ���ϱ�
		int sum=0, i=0;
		
		while( i<intArray.length ) {
			for( int j=0; j<intArray[i].length; j++ )
				sum += intArray[i][j];
			i++;
		}
		System.out.println("�迭�� �� = "+sum );
	}

}
