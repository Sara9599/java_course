class aptitudequesincrementdecrement{

    public static void main(String[] args) 
    {
        int i = 11;
        i = i++ + ++i;
        System.out.println(i);

	int a=11, b=22, c;
        c = a + b + a++ + b++ + ++a + ++b;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);

	
 	int x=0;
        x = x++ - --x+ ++x - x--;
        System.out.println(i);


	int l=1, j=2, k=3;
        int m = i-- - j-- - k--;
        System.out.println("l="+l);
        System.out.println("j="+j);
        System.out.println("k="+k);
        System.out.println("m="+m);


	int y= 0, z = 0;
        int p = --y * --z * z-- * y--;
        System.out.println(p);

    }
}