package stringprograms;

public class ProveStringImmutable {

	public static void main(String[] args) {
		String x="abc";
		String y="abc";
		x.concat(y);
		System.out.println("Before Not providing ref variable :means string cant change its original value");
		System.out.println(x);//
		String z=x.concat(y);
		System.out.println("after providing ref var :new string will store concatnated value");
		System.out.println(z);
	}
}
