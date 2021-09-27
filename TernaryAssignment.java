
class TernaryAssignment{
public static void main(String[] args)
{
int x=50;
int y=100;int z=150;
int result=x>y?(x>z?x:z):(y>z?y:z);
System.out.println("the large number is:" +result);
int result1=x<y?(x<z?x:z):(y<z?y:z);
System.out.println("the small number is:" +result1);

}
}
