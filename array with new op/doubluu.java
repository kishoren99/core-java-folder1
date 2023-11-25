class doubluu
{
public static void main(String[] args)
{
double[] d=new double[3];
d[1]=34.4;
d[0]=44.45;
d[2]=223.23;
System.out.println("index \t value");
for(int i=0; i<d.length; i++)
{
System.out.println(i+"\t"+d[i]);
}
}
}