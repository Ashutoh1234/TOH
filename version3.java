package revesion;
import java.util.*;
 public class findxin2d
 {
 public static void main(String[] args)
 {
        System.out.println("Enter the size of Array");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int colm=sc.nextInt();
        int number[][]=new int[row][colm];
         for(int i=0;i<row;i++)
         {
             for(int j=0;j<colm;j++)
             {
                 number[i][j]=sc.nextInt();
             }
            }

            int x=sc.nextInt();
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<colm;j++)
                {
                    if(number[i][j]==x)
                    {
                        System.out.println("X found by yash(" + i + ", " + j + ")");

                    }
                    System.out.println();
                }}}}
            

