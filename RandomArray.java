
public class RandomArray {

	public static void main(String[] args) {
		int intArray[][];
		intArray = new int[3][4];    // 2차원 배열 생성
		
        // 12개의 정수를 랜덤하게 발생시켜 배열에 저장
		for( int i=0; i<intArray.length; i++) {
			for( int j=0; j<intArray[i].length; j++ ) {
				intArray[i][j] = (int)(Math.random()*10);
			}
		}
		
		// 3행 4열의 값을 출력
		for( int i=0; i<intArray.length; i++ ) {
			for( int j=0; j<intArray[i].length; j++ )
				System.out.print(intArray[i][j] + "\t");
			
			System.out.println();
		}
		
		// 3행 4열의 모든 값에 대하여 합계를 구하기
		int sum=0, i=0;
		
		while( i<intArray.length ) {
			for( int j=0; j<intArray[i].length; j++ )
				sum += intArray[i][j];
			i++;
		}
		System.out.println("배열의 합 = "+sum );
	}

}
