package pagereplacment;
/**
 *
 * @author Seif
 */
public class OptimalAlgo {
  void Optimal(int Size_Of_Reference,int Size_Of_Frame,int The_Reference_Input[] ){
   boolean Indector3=false;
   int temp[]=new int[Size_Of_Frame];
   int The_SubArray_Of_Reference[]=new int[Size_Of_Frame]; 
   int max,pos=0;
   boolean f1=false,f2=false;
  for(int Fill_In_empty=0;Fill_In_empty<Size_Of_Frame;Fill_In_empty++)
  {
      The_SubArray_Of_Reference[Fill_In_empty]=-1; 
  }
  int Pagefault=0;
        for(int The_First_Loop = 0; The_First_Loop < The_Reference_Input.length; ++The_First_Loop){
        boolean Indector1 =false,Indector2 = false;
        
        for(int j = 0; j < Size_Of_Frame; ++j)
        {
            //This condition will be applied only if frame and refrence are equal then skip the rest of progam
            if(The_SubArray_Of_Reference[j] == The_Reference_Input[The_First_Loop])
            {
               Indector1 = Indector2 = true;
                break;
            }
        }
        int count =0;
        if(Indector1 == false)
        {
            for(int The_Second_Loop = 0; The_Second_Loop < Size_Of_Frame; ++The_Second_Loop){
                if(The_SubArray_Of_Reference[The_Second_Loop] == -1)
                {
                    Pagefault++;
                    The_SubArray_Of_Reference[The_Second_Loop] = The_Reference_Input[The_First_Loop];
                    Indector2 = true;
                    break;
                }
            }
        }
        if(Indector2 == false)
        {
            Indector3 =false;
            for(int Check_First_Condition = 0; Check_First_Condition < Size_Of_Frame; Check_First_Condition++)
            {
                temp[Check_First_Condition]=-1;
            	for(int Looping = The_First_Loop+1; Looping < Size_Of_Reference; Looping++)
                {
            	    if(The_SubArray_Of_Reference[Check_First_Condition] == The_Reference_Input[Looping])
                    {
                       temp[Check_First_Condition] = Looping;
            	       break;
            	    }
            	}
            }
            for(int Check_Second_Condition = 0; Check_Second_Condition < Size_Of_Frame; ++Check_Second_Condition)
            {
            	if(temp[Check_Second_Condition] == -1)
                {
            	    pos = Check_Second_Condition;
            	    Indector3 = true;
            	    break;
            	}
            }
           // int a=0;
            if(Indector3 ==false)
            {
            	max = temp[0];
            	pos = 0;
            	for(int j = 1; j < Size_Of_Frame; ++j)
                {
            	    if(temp[j] > max)
                    {
            		max = temp[j];
            		pos = j;   
            	    }                 
            	}
            }           
			The_SubArray_Of_Reference[pos] = The_Reference_Input[The_First_Loop];
			Pagefault++;
        }
   //Display For The Output
     for(int g=0;g<Size_Of_Frame;++g)
     {
         System.out.print(The_SubArray_Of_Reference[g]+"  ");
     }
     System.out.println("The Number of Page Fault Now  "+Pagefault);
    }
              int hit=Size_Of_Reference-Pagefault;  
              float Hitten_Value=hit;
              float Ratio=Hitten_Value/Size_Of_Reference;
             System.out.println("The Total Number of Hits Happened is : "+hit);
             System.out.println();
             System.out.println("The Hit Ratio is : "+Ratio);
    }
}


