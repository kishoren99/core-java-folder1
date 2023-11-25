class Rec1
{
static int area()
{
int a=23;
int b=34;
int x=a*b;
return x;
}
}
class Rec2
{
public static void main(String[] args)
{
int z=Rec1.area();
System.out.println(z);
}
}