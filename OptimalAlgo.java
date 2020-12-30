package pagereplacment;
public class OptimalAlgo {
  void Optimal(int Size_Of_Reference,int Size_Of_Frame,int The_Reference_Input[] ){
   boolean Indector3=false;
   int SubOfSub[]=new int[Size_Of_Frame];
   int TheSubOfString[]=new int[Size_Of_Frame]; 
   int max,pos=0;
   boolean f1=false,f2=false;
  for(int FillingTheSubArray=0;FillingTheSubArray<Size_Of_Frame;FillingTheSubArray++)
  {
      TheSubOfString[FillingTheSubArray]=-1; 
  }
  int Pagefault=0;
        for(int TheLooping = 0; TheLooping  < The_Reference_Input.length; ++TheLooping ){
        boolean Indector1 =false,Indector2 = false;
        
        for(int TheLoopingEquality = 0; TheLoopingEquality < Size_Of_Frame; ++TheLoopingEquality)
        {
            //This condition will be applied only if frame and refrence are equal then skip the rest of progam
            if(TheSubOfString[TheLoopingEquality] == The_Reference_Input[TheLooping ])
            {
               Indector1 = Indector2 = true;
                break;
            }
        }
        int count =0;
        if(Indector1 == false)
        {
            for(int TheLoopingIncreasingFault = 0; TheLoopingIncreasingFault < Size_Of_Frame; ++TheLoopingIncreasingFault){
                if(TheSubOfString[TheLoopingIncreasingFault] == -1)
                {
                    Pagefault++;
                    TheSubOfString[TheLoopingIncreasingFault] = The_Reference_Input[TheLooping ];
                    Indector2 = true;
                    break;
                }
            }
        }
        if(Indector2 == false)
        {
            Indector3 =false;
            for(int TheLoopingSearchingEquality = 0; TheLoopingSearchingEquality < Size_Of_Frame; TheLoopingSearchingEquality++)
            {
                SubOfSub[TheLoopingSearchingEquality]=-1;
            	for(int Looping = TheLooping +1; Looping < Size_Of_Reference; Looping++)
                {
            	    if(TheSubOfString[TheLoopingSearchingEquality] == The_Reference_Input[Looping])
                    {
                       SubOfSub[TheLoopingSearchingEquality] = Looping;
            	       break;
            	    }
            	}
            }
            for(int ThePositioning = 0; ThePositioning < Size_Of_Frame; ++ThePositioning)
            {
            	if(SubOfSub[ThePositioning] == -1)
                {
            	    pos = ThePositioning;
            	    Indector3 = true;
            	    break;
            	}
            }
           // int a=0;
            if(Indector3 ==false)
            {
            	max = SubOfSub[0];
            	pos = 0;
            	for(int j = 1; j < Size_Of_Frame; ++j)
                {
            	    if(SubOfSub[j] > max)
                    {
            		max = SubOfSub[j];
            		pos = j;   
            	    }                 
            	}
            }           
			TheSubOfString[pos] = The_Reference_Input[TheLooping];
			Pagefault++;
        }
   //Display For The Output
     for(int Displaying=0;Displaying<Size_Of_Frame;++Displaying)
     {
         System.out.print(TheSubOfString[Displaying]+"  ");
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