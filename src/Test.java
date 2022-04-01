import java.util.LinkedList;

public class Test {
	public boolean print(LinkedList<Integer> l2, LinkedList<Integer> l3) {
		int i=0;
		while(l2.size()==l3.size() && l2.get(i)==l3.get(i) && i<=l2.size()) {
			i++;
			return true;
		}
	return false; 
		
}
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();	
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(9);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(9);
		Test obj = new Test();
		//boolean bool = obj.compare(list);
		boolean bool = obj.print(list, list1);
		System.out.println(bool);
	}

}