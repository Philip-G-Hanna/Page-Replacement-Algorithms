/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

public class LRUAlgo {

 void LRU(int NoReferences,int Noframes,int pageRef[])
 {
  int check[]=new int[NoReferences];
  for(int display_before_use=0;display_before_use<Noframes;display_before_use++)
  {
    check[display_before_use]=-1;
  }
  for(int Fill_In_empty=0;Fill_In_empty<Noframes;Fill_In_empty++)
      
//Display before LRU
  {
  System.out.print(" "+check[Fill_In_empty]);
  }
  System.out.println();
  int lru,pfault=0,rear=0;
  int PastOfRef[]=new int[Noframes];
  for(int The_First_Loop=0;The_First_Loop<Noframes;The_First_Loop++)
  PastOfRef[The_First_Loop]=0;
  for(int The_Second_Loop=0,The_First_Loop=0;The_First_Loop<NoReferences && The_Second_Loop<Noframes; The_Second_Loop=The_Second_Loop%Noframes,The_First_Loop=The_First_Loop+1)
  {
    lru=0;
     
    for(int y=0;y<Noframes;y++)
    {
    if(check[y]==pageRef[The_First_Loop])
    {
     //No Allocation
     lru=1;
     PastOfRef[y]=0; 
    }
    }
    if(lru==0)
    if(check[The_Second_Loop]==-1)
    { 
     check[The_Second_Loop]=pageRef[The_First_Loop];
     pfault++;
     rear++;
     The_Second_Loop++;
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
     check[loc]=pageRef[The_First_Loop];
     PastOfRef[loc]=0;
     The_Second_Loop++;
     } 
    for(int Display_After_LRU=0;Display_After_LRU<Noframes;Display_After_LRU++){
        //Display after LRU
    System.out.print(" "+check[Display_After_LRU]);
    }
    System.out.println(" The Number of Page Fault Now "+pfault);
    for(int Display_After_PageFault=0;Display_After_PageFault<Noframes;Display_After_PageFault++)
     {
     if(check[Display_After_PageFault]==-1)
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