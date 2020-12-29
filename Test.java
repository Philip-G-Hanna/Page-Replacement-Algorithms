/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Philip George
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
   {
       int num=7;
       while(num!=0){
       System.out.println();
       System.out.println("To Exit click 0");
       System.out.println("If you want to use the FiFo click num 1");
       System.out.println("If you want to use the FiFo with set values click num 2");
       System.out.println("If you want to use the Optimal click num 3");
       System.out.println("If you want to use the Optimal with set values click num 4");
       System.out.println("If you want to use the LRU click num 5");
       System.out.println("If you want to use the LRU with set values click num 6");
       
       Scanner reader=new Scanner(System.in);
       num=reader.nextInt();
       if(num==1)
       {
           FiFoAlgo fifo_enter=new FiFoAlgo();
           int length;
           int frames;
           System.out.println("Enter the Length of Refrence Sting you want");
           length=reader.nextInt();
           System.out.println("Enter Number of Frames you want");
           frames=reader.nextInt();
           int refer[]=new int[length];
           System.out.println("Now Enter Refrence String you want");
           for(int i=0;i<length;i++)
           {
               refer[i]=reader.nextInt();
           }
           fifo_enter.fifo(length,frames,refer);
       }
       else if(num==2)
       {
           FiFoAlgo fifo_enter=new FiFoAlgo();
           int length=20;
           int frames=3;
           System.out.println("The Length of Refrence Sting is : "+length);
           System.out.println("The Number of Frames is : "+frames);
           int refer[]={7, 2 ,3 ,1 ,2 ,5 ,3 ,4 ,6 ,7 ,7 ,1 ,0 ,5 ,4 ,6 ,2 ,3 ,0 ,1};
           System.out.println("Now The Refrence String is");
           for(int i=0;i<length;i++)
           {
               System.out.print(refer[i]+"  ");
           }
           fifo_enter.fifo(length,frames,refer); 
           
       }
       else if(num==3)
       {
          OptimalAlgo Opt_enter=new OptimalAlgo();
           int length;
           int frames;
           System.out.println("Enter the Length of Refrence Sting you want");
           length=reader.nextInt();
           System.out.println("Enter Number of Frames you want");
           frames=reader.nextInt();
           int refer[]=new int[length];
           System.out.println("Now Enter Refrence String you want");
           for(int i=0;i<length;i++)
           {
               refer[i]=reader.nextInt();
           }
           Opt_enter.Optimal(length,frames,refer);
       }
       else if(num==4)
       {
           OptimalAlgo Opt_enter=new OptimalAlgo();
           int length=20;
           int frames=3;
           System.out.println("The Length of Refrence Sting is : "+length);
           System.out.println("The Number of Frames is : "+frames);
           int refer[]={7, 2 ,3 ,1 ,2 ,5 ,3 ,4 ,6 ,7 ,7 ,1 ,0 ,5 ,4 ,6 ,2 ,3 ,0 ,1};
           System.out.println("Now The Refrence String is");
           for(int i=0;i<length;i++)
           {
               System.out.print(refer[i]+"  ");
           }
           Opt_enter.Optimal(length,frames,refer);
       }
       else if(num==5)
       {
           LRUAlgo lru=new LRUAlgo();
           int length;
           int frames;
           System.out.println("Enter the Length of Refrence Sting you want");
           length=reader.nextInt();
           System.out.println("Enter Number of Frames you want");
           frames=reader.nextInt();
           int refer[]=new int[length];
           System.out.println("Now Enter Refrence String you want");
           for(int i=0;i<length;i++)
           {
               refer[i]=reader.nextInt();
           }
           lru.LRU(length,frames,refer);
       }
       else if(num==6)
       {
           LRUAlgo lru=new LRUAlgo();
           int length=20;
           int frames=3;
           System.out.println("The Length of Refrence Sting is : "+length);
           System.out.println("The Number of Frames is : "+frames);
           int refer[]={7, 2 ,3 ,1 ,2 ,5 ,3 ,4 ,6 ,7 ,7 ,1 ,0 ,5 ,4 ,6 ,2 ,3 ,0 ,1};
           System.out.println("Now The Refrence String is");
           for(int i=0;i<length;i++)
           {
               System.out.print(refer[i]+"  ");
           }
           lru.LRU(length,frames,refer);
       }
   }
}
}