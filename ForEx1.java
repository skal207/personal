
public class ForEx1 {
	public static void main(String args[]) {
		int sum = 0;
		
		for(int i=100; i>=5; i-=5) {
			sum += i;
		}
		System.out.println("100~1까지 5의 배수의 합 = "+sum);
		
		int sum2 = 0;
		
		for(int l=100; l>=2; l-=2) {
			sum2 += l;
		}
		System.out.println("100~1까지 짝수의 합 = "+sum2);
	}

}
