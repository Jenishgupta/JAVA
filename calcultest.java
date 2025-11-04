class calcul
{
	static void add (int i1, int i2){
		int i3 = i1 + i2;
		System.out.printf("The Addition of %d and %d is %d%n", i1,i2,i3);
	}
	static void sub (int i1, int i2){
		int i3 = i1 - i2;
		System.out.printf("The Subtraction of %d and %d is %d%n", i1,i2,i3);
	}
	static void mul (int i1, int i2){
		int i3 = i1 * i2;
		System.out.printf("The Multiplication of %d and %d is %d%n", i1,i2,i3);
	}
	static void div (int i1, int i2){
		int i3 =  i1 / i2;
		System.out.printf("The Division of %d and %d is %d%n", i1,i2,i3);
	}
}

class calcultest
{
	public static void main(String[] args)
	{
		calcul.add(10, 20);
		calcul.sub(50, 30);
		calcul.mul(20, 20);
		calcul.div(80, 20);
	}
}
