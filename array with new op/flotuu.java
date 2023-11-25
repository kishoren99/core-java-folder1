class flotuu
{
public static void main(String[] args)
{
float[] d=new float[3];
d[1]=34.4f;
d[0]=44.45f;
d[2]=223.23f;
System.out.println("index \t value");
for(int i=0; i<d.length; i++)
{
System.out.println(i+"\t"+d[i]);
}
}
}