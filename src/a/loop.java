package a;

import java.util.*;
import java.io.*;

class loop{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of t");
        int t=in.nextInt();
        int sum=0;
        int x=0;
        for(int i=0;i<t;i++){
        	System.out.println("enter a");
            int a = in.nextInt();
            System.out.println("enter b");
            int b = in.nextInt();
            System.out.println("enter c");
            int n = in.nextInt();
            
            if(x==0)
                {
               sum=a+(int)(Math.pow(2,x)*b);
                System.out.print(sum+" ");
        
            }
            for(int j=1;j<=n;i++)
            {
            
            sum=sum+(int)(Math.pow(2,j)*b);
             System.out.print(sum+" ");
            
        }
            System.out.println();
        }
      
        
        
        in.close();
    }
}

