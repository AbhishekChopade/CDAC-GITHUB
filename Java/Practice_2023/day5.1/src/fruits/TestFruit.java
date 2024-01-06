package fruits;

public class TestFruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fruit f1 = new Fruit();
		Fruit f1 = new Apple();
		Object o = new Fruit();
		System.out.println(f1 instanceof Fruit);
		System.out.println(f1 instanceof Apple);
		System.out.println(f1 instanceof Orange);
		System.out.println(f1 instanceof Mango);
		System.out.println(o instanceof Fruit);
		

	}

}
