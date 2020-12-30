package test;
import java.util.Scanner;
public class FiFoAlgo {
    void fifo(int Size_Of_Reference,int Size_Of_Frame,int The_Reference_Input[]) {
         int PageFault_Number_Of_Occur=0;
         int count=0;
    int TheSubOfString[]=new int[Size_Of_Frame]; 
  for(int FillingTheSubArray=0;FillingTheSubArray<Size_Of_Frame;FillingTheSubArray++)
  {
      TheSubOfString[FillingTheSubArray]=-1; 
  }
  int Hitting_Counter=0,counter=0,updated=0;
    for(int TheLooping=0;TheLooping<The_Reference_Input.length;TheLooping++) //Move on thr reference string
    {
        boolean Indector=false; //flag
        for(int TheLoopingCondition=0;TheLoopingCondition<Size_Of_Frame;TheLoopingCondition++)//Move on thr the Frame    
            //if value found in this that that entered string equal to the value in the frame will enter this condition
            if(The_Reference_Input[TheLooping]==TheSubOfString[TheLoopingCondition])
            {
                 Indector=true;
            }
       counter=PageFault_Number_Of_Occur;
     if(Indector==false)
     {   
          System.out.println(" Miss Happened to Find Page "+The_Reference_Input[TheLooping]);
          System.out.println();
          System.out.println(" Page "+The_Reference_Input[TheLooping]+  " Replaced Page "+TheSubOfString[count]);
         TheSubOfString[count]=The_Reference_Input[TheLooping];
         count++;
         if(count>=Size_Of_Frame)
             count=0;
             PageFault_Number_Of_Occur+=1;
         System.out.println();
        for(int list=0;list<Size_Of_Frame;list++)
         {
              System.out.print("  "+TheSubOfString[list]+"  ");
         }
        System.out.println();
        updated=PageFault_Number_Of_Occur;
     }
    if(counter==updated)
    {
        System.out.println();
        System.out.println("Hit Happened As Page "+The_Reference_Input[TheLooping]+" is found");
        System.out.println();
        System.out.println("-----------------------");
    }
    else
    {
        System.out.println();
        System.out.println("The PageFault now is "+PageFault_Number_Of_Occur);
        System.out.println();
        System.out.println("-----------------------");
    }
    }
    System.out.println();
    System.out.println("The Total Number of Page Fault in the End is : "+PageFault_Number_Of_Occur);
    System.out.println();
    Hitting_Counter=The_Reference_Input.length-PageFault_Number_Of_Occur;
    float Hitten_Value=Hitting_Counter;
    float Ratio=Hitten_Value/The_Reference_Input.length;
    System.out.println("The Total Number of Hits Happened is : "+Hitting_Counter);
    System.out.println();
    System.out.println("The Hit Ratio is : "+Ratio);
    }
}