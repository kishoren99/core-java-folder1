class Trap1
{
static double area()
{
int a=23;
int b=34;
double h=23.89;
double x=1/2.0*(a+b)*h;
return x;
}}
class Trap
{
public static void main(String[] args)
{
double z=Trap1.area();
System.out.println(z);
}}