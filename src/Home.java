
public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Counter mycounter=new Counter("counter1");
		System.out.println(mycounter.getCurrentValue());
		mycounter.increament();
		System.out.println(mycounter.getCurrentValue());
		System.out.println(mycounter.toString());
		
		Counter mycounter1=new Counter("counter2");
		System.out.println(mycounter1.getCurrentValue());
		mycounter1.increament();
		mycounter1.increament();
		System.out.println(mycounter1.getCurrentValue());
		System.out.println(mycounter1.toString());
	}

}
