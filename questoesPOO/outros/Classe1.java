package outros;

public class Classe1 {
	
	private Classe2 c;
	
	public Classe1() {
		System.out.print("1");
		c = new Classe2();
	}
	
	public void doSomething() {
		System.out.print("2");
	}
	
	private class Classe2 {
		
		public Classe2() {
			System.out.print("3");
		}
		
		public void doSomething() {
			System.out.print("4");
		}
		
	}
	
	public static void main(String[] args) {
		new Classe1().c.doSomething();
	}
}

