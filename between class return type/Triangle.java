class Area_Triangle
{
static double area()
{
int b=21;
double h=21.34;
double x=1.0/2*b*h;
return x;
}
}
class Triangle
{
public static void main(String[] args)
{
double z=Area_Triangle.area();
System.out.println(z);
}
}