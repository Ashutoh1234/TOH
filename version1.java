import java.util.*;
public class first
{
    public static void TOH(int n,String src,String helper,String dest)
    {
        if(n==1)
        {
            System.out.println("Transfer disk  "+n+" From  "+src+" To "+dest);
            return;
        }
        TOH(n-1,src,dest,helper);
        System.out.println("Transfer disk "+n+" From  "+src+" To "+dest );
        TOH(n-1,helper,src,dest);

    }

    public static void main(String[] args)
{

   System.out.println("Enter the number of Disks to Be Transfered Yash");
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   TOH(n,"S","H","D");
  
}
}

