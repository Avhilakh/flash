
public class OverloadingAndOverriding {
	public static void main(String[] args) {
//		**Reference variable of superclass will call only the methods which are present in superclass
//		And implementation will be checked at runtime, if any method present in child only then it will
//		give compile time error, if method present in both classes then JVM will override the method at runtime
		Parent3 uobj = new Child3();
//		uobj.m
		Parent3 pobj = new Parent3();
//		pobj.m
		Child3 obj = new Child3();
		obj.m6(0);
	}
}

class Child3 extends Parent3 {
	int x=10;
	// Can be Overridden Or Overloaded
	public void m1() {
		System.out.println(" Overridden Public Inside Child ");
	}

	public void m1(int a) {
		System.out.println(" Overloaded Public Inside Child ");
	}

	// if same method is in parent this is called function hiding
	static void m2() {
		System.out.println("Overridden static Inside Child");
	}

	// Can be Overloaded only in same class
	// Can not be override
	private void m3() {
		System.out.println("Overridden Private Inside Child");
	}
//	Method must be protected or public for overriding
	protected void m4() {
		System.out.println("Overridden Protected Inside Child");
	}

	void m5() {
		System.out.println("Default Inside Child");
	}

//		We can not override final method
//		final void m6() {
//			System.out.println("Overridden Final Inside Child");
//		}
//	final void m6(int a) {
//		System.out.println("Overloaded Final Inside Child");
//	}
	
//	Need to discuss if return type changes in parent child relationship
//	String m7() {
//		System.out.println("Int return type Inside Parent");
//		return null;
//	}
	
	
}

class Parent3 {
	int y=20;
	public void m1() {
		System.out.println("Parent Inside Public");
	}

	static void m2() {
		System.out.println("Parent Inside static");
	}

	// Overloaded in same class
//	static void m2(int a) {
//		System.out.println("Overloaded static Inside Parent");
//	}
	private void m3() {
		System.out.println("Private Inside Parent ");
	}

//	private void m3(int a) {
//		System.out.println("Overloaded Private Inside Parent");
//	}
	protected void m4() {
		System.out.println("Protected Inside Parent");
	}

//	We can overload protected method in same class
//	protected void m4(int a) {
//		System.out.println("Overloaded Protected Inside Parent");
//	}
//	by default public modifier is used
	void m5() {
		System.out.println("Default Inside Parent");
	}

	final void m6() {
		System.out.println("Final Inside Parent");
	}
//	We can overload final in same class
	final void m6(int a) {
		System.out.println("Overloaded Final Inside Parent");
	}
	 int m7() {
		System.out.println("Int return type Inside Parent");
		return 0;
	}
//	 Return type do not play roll in method overloading
//	 String m7(int a) {
//			System.out.println("Int return type Inside Parent");
//			return a;
//		}
}





