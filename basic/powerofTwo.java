package basic;
class powerofTwo {
	/* Method to check if x is power of 2*/
	static boolean isPowerOfTwo(int x)
	{
        // If we subtract a power of 2 numbers by 1 then all unset bits after the only set bit become set; and the set bit becomes unset.
        // So, if a number n is a power of 2 then bitwise & of n and n-1 will be zero. We can say n is a power of 2 or not based on the value of n&(n-1). The expression n&(n-1) will not work when n is 0.
		return x != 0 && ((x & (x - 1)) == 0);
	}
	// Driver code
	public static void main(String[] args)
	{
		// Function call
		System.out.println(isPowerOfTwo(31) ? "Yes" : "No");
		System.out.println(isPowerOfTwo(64) ? "Yes" : "No");
	}
}

