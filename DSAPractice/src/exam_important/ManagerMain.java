package exam_important;

public class ManagerMain {
	
	public static void main(String[] args) {
		ManagerStackLinkelist sl=new ManagerStackLinkelist();
		sl.push(new Manager(1, "abhi", 100000));
		sl.push(new Manager(2, "harsh", 20000));
		sl.push(new Manager(3, "mayuresh", 20980));
		sl.push(new Manager(4, "sarvesh", 7800));  
		
		System.out.println("~~~~~ Manager using Stack ~~~~~");
		System.out.println("~~~ Before ~~~");
		sl.display();
		System.out.println("~~~~~~~~~~~~~~~~~");
		System.out.println(sl.pop());
		System.out.println("~~~ After ~~~");
		sl.display();
		System.out.println("~~~~~~~~~~~~~~~~~");
		System.out.println(sl.pop());
		System.out.println("~~~ After ~~~");
		sl.display();
		
		
		
	}

}



