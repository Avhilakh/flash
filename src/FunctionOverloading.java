public class FunctionOverloading {
//     Overloaded methods
	private void fun(int i) {
		System.out.println("Inside Private");
	}

	private void fun(int i, String str) {
		System.out.println("Overloaded Private in same class");
	}

	public final void fun(String name) {
		System.out.println("inside final ");

	}

	public final void fun(String name, int i) {
		System.out.println("Overload final in same class");

	}

	static void fun(char c) {
		System.out.println("inside static");
	}

	static void fun(char c, String str) {
		System.out.println("Overloaded static in same class");
	}

	public void fun() {
		System.out.println("inside public");
	}

	public void fun(int a, int b) {
		System.out.println("Overloaded public in same class");
	}

	class FunctionOverrideandOverload extends FunctionOverloading{
		private void fun(int i) {
			System.out.println("Overridden Private");
		}

		private void fun(int i, String str) {
			System.out.println("Overridden Private");
		}

//		public final void fun(String name) {     // Can not override final method
//			System.out.println("Overridden final ");
//
//		}

		public final void fun(String name, int i, int j) {    // We can overload final method
			System.out.println("Overload final in child class");

		}

		static void fun(char c) {
			System.out.println("Overridden static");
		}

		static void fun(char c, String str) {
			System.out.println("Overridden static in child class");
		}

		public void fun() {
			System.out.println("Overridden public");
		}

		public void fun(int a, int b, int c) {
			System.out.println("Overloaded public in child class");
		}
	}

//    // Driver code 
	public static void main(String[] args) {
		FunctionOverloading mv = new FunctionOverloading();
//    	mv.fun(null);
		// int a = null;
		// This line causes
		mv.fun('a');
	}
}