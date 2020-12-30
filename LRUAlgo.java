package test;
import java.util.Scanner;
public class LRUAlgo {

 void LRU(int NoReferences,int Noframes,int pageRef[])
 {
  int TheSubOfString[]=new int[NoReferences];
  for(int  FillingTheSubArray=0; FillingTheSubArray<Noframes; FillingTheSubArray++)
  {
    TheSubOfString[ FillingTheSubArray]=-1;
  }
  for(int DisplayingTheSubArray=0;DisplayingTheSubArray<Noframes;DisplayingTheSubArray++)
      
//Display before LRU
  {
  System.out.print(" "+TheSubOfString[DisplayingTheSubArray]);
  }
  System.out.println();
  int lru,pfault=0,rear=0;
  int PastOfRef[]=new int[Noframes];
  for(int TheLooping=0;TheLooping<Noframes;TheLooping++)
  PastOfRef[TheLooping]=0;
  for(int TheLoopingCondition=0,TheLooping=0;TheLooping<NoReferences && TheLoopingCondition<Noframes; TheLoopingCondition=TheLoopingCondition%Noframes,TheLooping=TheLooping+1)
  {
    lru=0;
     
    for(int y=0;y<Noframes;y++)
    {
    if(TheSubOfString[y]==pageRef[TheLooping])
    {
     //No Allocation
     lru=1;
     PastOfRef[y]=0; 
    }
    }
    if(lru==0)
    if(TheSubOfString[TheLoopingCondition]==-1)
    { 
     TheSubOfString[TheLoopingCondition]=pageRef[TheLooping];
     pfault++;
     rear++;
     TheLoopingCondition++;
    }
    else
    {
     int max=PastOfRef[0];
     int loc=0;
     pfault++;

     for(int b=0;b<Noframes;b++)
     if(PastOfRef[b]>max)
     {
     max=PastOfRef[b];
     loc=b;
     }
     TheSubOfString[loc]=pageRef[TheLooping];
     PastOfRef[loc]=0;
     TheLoopingCondition++;
     } 
    for(int Display_After_LRU=0;Display_After_LRU<Noframes;Display_After_LRU++){
        //Display after LRU
    System.out.print(" "+TheSubOfString[Display_After_LRU]);
    }
    System.out.println(" The Number of Page Fault Now "+pfault);
    for(int Display_After_PageFault=0;Display_After_PageFault<Noframes;Display_After_PageFault++)
     {
     if(TheSubOfString[Display_After_PageFault]==-1)
     {
     PastOfRef[Display_After_PageFault]=0;
     }
     else
     {
     PastOfRef[Display_After_PageFault]++;
     }
     }
  }
 } 
}