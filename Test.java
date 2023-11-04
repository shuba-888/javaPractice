package javaPractice;

public class Test {
	public int i,j;
	//objects in java
	public Test() {
		i=10;
		j=20;
	}
	public Test(int i, int j) {
		
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.hashCode());
		System.out.println(t.i);
		System.out.println(t.j);
		System.out.println(t.add());
	}
	public int add()
	{
		return i+j;
	}
}
