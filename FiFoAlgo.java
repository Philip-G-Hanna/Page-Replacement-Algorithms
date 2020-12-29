package pagereplacment;
import java.util.Scanner;
public class FiFoAlgo {
    void fifo(int Size_Of_Reference,int Size_Of_Frame,int The_Reference_Input[]) {
         int PageFault_Number_Of_Occur=0;
         int count=0;
    int The_SubArray_Of_Reference[]=new int[Size_Of_Frame]; 
  for(int Fill_In_empty=0;Fill_In_empty<Size_Of_Frame;Fill_In_empty++)
  {
      The_SubArray_Of_Reference[Fill_In_empty]=-1; 
  }
  int Hitting_Counter=0,counter=0,updated=0;
    for(int The_First_Loop=0;The_First_Loop<The_Reference_Input.length;The_First_Loop++) //Move on thr reference string
    {
        boolean Indector=false; //flag
        for(int The_Second_Loop=0;The_Second_Loop<Size_Of_Frame;The_Second_Loop++)//Move on thr the Frame    
            //if value found in this that that entered string equal to the value in the frame will enter this condition
            if(The_Reference_Input[The_First_Loop]==The_SubArray_Of_Reference[The_Second_Loop])
            {
                 Indector=true;
            }
       counter=PageFault_Number_Of_Occur;
     if(Indector==false)
     {   
          System.out.println(" Miss Happened to Find Page "+The_Reference_Input[The_First_Loop]);
          System.out.println();
          System.out.println(" Page "+The_Reference_Input[The_First_Loop]+  " Replaced Page "+The_SubArray_Of_Reference[count]);
         The_SubArray_Of_Reference[count]=The_Reference_Input[The_First_Loop];
         count++;
         if(count>=Size_Of_Frame)
             count=0;
             PageFault_Number_Of_Occur+=1;
         System.out.println();
        for(int list=0;list<Size_Of_Frame;list++)
         {
              System.out.print("  "+The_SubArray_Of_Reference[list]+"  ");
         }
        System.out.println();
        updated=PageFault_Number_Of_Occur;
     }
    if(counter==updated)
    {
        System.out.println();
        System.out.println("Hit Happened As Page "+The_Reference_Input[The_First_Loop]+" is found");
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
