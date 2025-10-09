class Duoclass3 {

    int i1 = 5;
	int i2 = 6;
	int i3 = 7;
    double d1 = 6.7;
	double d2 = 7.8;
	double d3 = 8.9;
    char c1 = 'A';
	char c2 = 'B';
	char c3 = 'C';
    long[] la = {8, 9,10,11,12};  
    String s1 = "Jenish";  
	String s2 = "John";
	String s3 = "Marcos";
}


public class Test03_class {
    public static void main(String[] args) {

        Duoclass2 e1 = new Duoclass2();
        // print line by line
        System.out.println("int1:-" +e1.i1);
		System.out.println("int2:-" +e1.i2);
		System.out.println("int3:-" +e1.i3);
		System.out.println("----------------");
        System.out.println("float1:-" +e1.d1);
		System.out.println("float2:-" +e1.d2);
		System.out.println("float3:-" +e1.d3);
		System.out.println("----------------");
        System.out.println("character1:-" +e1.c1);
		System.out.println("character2:-" +e1.c2);
		System.out.println("character3:-" +e1.c3);
		System.out.println("----------------");
		
		int count = 1;
		for (long value : e1.la) {
			System.out.println("la" + count + ":-" +value);  // print in serial no. by using count
			count++;
		}
		System.out.println("----------------");
		for(int i=0; i<e1.la.length; i++){				
		
			System.out.println("la" + (i + 1) + ":-" +e1. la[i]);  // print in serial no. by using (i+1)
		}
		
		System.out.println("----------------");
        System.out.println("Name:-" +e1.s1);
		System.out.println("Names: " + e1.s1 + ", " + e1.s2 + ", " + e1.s3);  // print in , like this 
    }
}
