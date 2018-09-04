package delete;

	public class A {
		
		public static void main(String[] args) {
			C c1 = new C();
			B c2 = new C();
			B b1 = new B();
			
			c1.myMethod();
			c2.myMethod();
			b1.myMethod();
		}
			
	}
	
	class B {
		public void myMethod(){
			System.out.println("This is the myMethod of class B");
		}
	}
	
	class C extends B {
		@Override
		public void myMethod() {
			System.out.println("This is the overriden myMethod of class C");
		}
	}
	
