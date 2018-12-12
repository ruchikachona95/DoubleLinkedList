
public class DLListExample {
	public static void main(String[] args) {
		DLList list = new DLList();

		list.addAtHead("Bob");
		list.addAtHead("Tom");
		list.addAtHead("Joe");
		list.addAtHead("Doe");
		list.addAtHead("Sam");
		list.addAtHead("George");
		System.out.println("The list from head  is ");
		list.displayFromHead();

		System.out.println("The list from tail  is ");
		list.displayFromTail();
		
		System.out.println("Deleting Joe");
		list.searchAndDelete("Joe");
		
		System.out.println("After removing Joe, the list from head  is ");
		list.displayFromHead();

		System.out.println("After removing Joe, the list from tail  is ");
		list.displayFromTail();
		
		System.out.println("Deleting George - head");
		list.searchAndDelete("George");
		
		System.out.println("After removing George, the list from head  is ");
		list.displayFromHead();

		System.out.println("After removing George, the list from tail  is ");
		list.displayFromTail();
		
		System.out.println("Deleting Bob - tail");
		list.searchAndDelete("Anu");
		
		System.out.println("After removing Bob, the list from head  is ");
		list.displayFromHead();

		System.out.println("After removing Bob, the list from tail  is ");
		list.displayFromTail();
		
		System.out.println("Deleting Dan - not found");
		list.searchAndDelete("Dan");
		
		System.out.println("After removing Dan, the list from head  is ");
		list.displayFromHead();

		System.out.println("After removing Dan, the list from tail  is ");
		list.displayFromTail();
		
	}
}
