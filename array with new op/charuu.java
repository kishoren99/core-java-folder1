class charuu
{
public static void main(String[] args)
{
char[] ca=new char[3];
ca[0]='2';
ca[1]='a';
ca[2]='&';
System.out.println("index \t value");
for(int i=0;i<ca.length;i++)
{
System.out.println(i+"\t"+ca[i]);
}
}
}