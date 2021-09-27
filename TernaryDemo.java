class TernaryDemo{
public static void main(String[] args)
{
int x=50;
int y=100;int z=150;
int result=x>y?x:y;
int large=result>z?result:z;
System.out.println("the large number is:" +large);
int result1=x<y?x:y;
int small=result1<z?result1:z;
System.out.println("the small number is:" +small);

}
}
