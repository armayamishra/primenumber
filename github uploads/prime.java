import java.util.Scanner;
class prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,count=0,n;
System.out.println("Enter the number=");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
if(n%i==0)
{
count++;
}
}
if(count==2)
{
System.out.println("Prime");
}
else
{
System.out.println("Not Prime");
}
}
}
