/* [���� 3-3] do~while���� �̿��ؼ� 'a'~'z'���� ���
 * 
 */
public class DoWhile1 {

	public static void main(String[] args) {
	    char word = 'a';
	    do {
	    	System.out.print (word);   //a���
	    	word = (char)(word+1);
	    }while(word<='z');

	}

}
