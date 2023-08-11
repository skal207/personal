class A {
	public A(int i) {  System.out.println("A");  }
}

class B extends A{
	public B(int i) {  super(100);  }
}

public class C {
	public static void main(String[] args) {
		new B(11);

	}

}
