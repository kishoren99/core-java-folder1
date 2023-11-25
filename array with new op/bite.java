class bite
{
public static void main(String[] args)
{
byte [] by=new byte[3];
by[0]=5;
by[1]=6;
by[2]=84;
System.out.println("index \t value");
for(int i=0; i<by.length; i++)
{
System.out.println(i+"\t"+by[i]);
}
}

}