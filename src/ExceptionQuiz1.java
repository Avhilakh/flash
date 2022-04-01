
public class ExceptionQuiz1 {
	void amethod() throws Exception {
		try {
			throw new Exception();
		}
		finally {
			System.out.println("Finally");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionQuiz1 obj = new ExceptionQuiz1();
		try {
//			obj.amethod();
			try {
//				throw new Exception();
				System.out.println("Inside nested try");
			}
			finally {
				System.out.println("Finally");
			}
		}
		catch(Exception e){
			System.out.println("Exception");
			
		}
		System.out.println("Finished");
	}

}
