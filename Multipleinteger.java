class Multipleinteger 
{
	public static void main(String[] args) 
	{
		int [] ia = {3,4,5,6,7,};
		
		System.out.println("ia:" +ia);
		System.out.println();  // for line space
		
		// Approach -1 Reading and printing directly
		System.out.println("ia[0]:" +ia[0]);
		System.out.println("ia[1]:" +ia[1]);
		System.out.println("ia[2]:" +ia[2]);
		System.out.println("ia[3]:" +ia[3]);
		System.out.println("ia[4]:" +ia[4]);
		System.out.println(); // for line space

		
		// Approach -2 Reading and printing	by using loop with index
		for(int i=0; i<ia.length; i++){				
		
			System.out.println(ia[i]); 
		}
		System.out.println(); // for line space
		
		// Approach -3 Reading and priting by using for-each loop
		for(int value : ia){					
			System.out.println(value); 
		}
		System.out.println(); // for line space
		
		// Approach -4 Directly printing by using predefiend method Arrays.toString(-)
		System.out.println(java.util.Arrays.toString(ia));
	}
}
