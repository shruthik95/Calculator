/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author SHRUTHI
 */
public class operations {
    DLLnode lin1;
    DLLnode lin2;
    String op2;
     DLL d=new DLL();
     DLL s=new DLL();
    /*operations()
    {
        
    }*/
    public String operations(DLLnode l1,DLLnode l2,String op2)
    {
        DLLnode current1=l1;
        DLLnode current2=l2;
        String result=null;
        int carry=0,borrow=0;
      switch(op2)  
      {
          case"<"://num1<num2
              while(current1!=null && current2!=null)
              {
                 if(current1.getValue().equals(".") && current2.getValue().equals(".")) 
                {
                   current1=current1.getprev();
                    current2=current2.getprev();
                }
                 else{
                  int value1=Integer.parseInt(current1.getValue().toString());
                 int value2=Integer.parseInt(current2.getValue().toString());
                 //System.out.println(value1);
                 for(int i=0;i<l1.length();)
                 {
                     if(current1.getValue().equals(".") && current2.getValue().equals(".")) 
                {
                   current1=current1.getprev();
                    current2=current2.getprev();
                   // System.out.println(".con");
                }else{
                    System.out.println("in for loop");
                     if(value1<value2)
                         result="true";
                     else if(value1>value2)
                         result="false";
                     i++;
                     }
                 }
                  current1=current1.getprev();
                   current2=current2.getprev(); 
                }
              }
              break;
              
          case ">"://num1>num2
               while(current1!=null && current2!=null)
              {
                 if(current1.getValue().equals(".") && current2.getValue().equals(".")) 
                {
                   current1=current1.getprev();
                    current2=current2.getprev(); 
                }
                 else
                {
                    int value1=Integer.parseInt(current1.getValue().toString());
                    int value2=Integer.parseInt(current2.getValue().toString());
                    
                    for(int i=0;i<l1.length();)
                 {
                     if(current1.getValue().equals(".") && current2.getValue().equals(".")) 
                         {
                            current1=current1.getprev();
                            current2=current2.getprev();
                   // System.out.println(".con");
                         }
                     else{
                         System.out.println("in for loop");
                            if(value1>value2)
                                 result="true";
                            else if(value1<value2)
                                 result="false";
                             i++;
                         }
                 }
                  current1=current1.getprev();
                   current2=current2.getprev(); 
                }
              }
              break;
              
          case "==": //num1==num2
               while(current1!=null && current2!=null)
              {
                 if(current1.getValue().equals(".") && current2.getValue().equals(".")) 
                {
                   current1=current1.getprev();
                    current2=current2.getprev(); 
                }
                 else
                {
                    int value1=Integer.parseInt(current1.getValue().toString());
                    int value2=Integer.parseInt(current2.getValue().toString());
                    
                    if(value1==value2)
                         result="true";
                    else
                        result="false";
                current1=current1.getprev();
                current2=current2.getprev();
              }
              }
               break;
               
          case"+":
              while(current1!=null && current2!=null)
              {
                if(current1.getValue().equals(".") && current2.getValue().equals(".")) 
                {
                   d.Dinsert(".");
                    current1=current1.getprev();
                    current2=current2.getprev(); 
                    
                }
                else
                {
                    int value1=Integer.parseInt(current1.getValue().toString());
                    int value2=Integer.parseInt(current2.getValue().toString());
                    
                    int sum1=carry+value1+value2;
                    int sum2=sum1;
                    sum1=sum1%10;
                    d.Dinsert(sum1);
                    carry=sum2/10;
                 current1=current1.getprev();
                current2=current2.getprev();
                }
              }
              if(carry>0)
               d.Dinsert(carry);
              d.print();
              result=d.linktoString();
               break;
               
          case "-":
              while(current1!=null && current2!=null)
              {
                  if(current1.getValue().equals(".") && current2.getValue().equals(".")) 
                {
                   s.Dinsert(".");
                    current1=current1.getprev();
                    current2=current2.getprev(); 
                    
                }
                else
                  {
                    int value1=Integer.parseInt(current1.getValue().toString());
                    int value2=Integer.parseInt(current2.getValue().toString());
                    System.out.println(value1);
                    System.out.println(value2);
                    int sub;
                 
                   sub=borrow+(value1-value2);
                    int temp=sub;
                    if(temp<0)
                    {
                         temp=temp*(-1);
                         borrow=-1;
                    }
                    if(temp>9)
                    {
                        int value=temp;
                        temp=temp%10;
                        value=value/10;
                        borrow=1;
                    }
                   System.out.println(" ouside if nd else loop");
                    s.Dinsert(temp);
                    current1=current1.getprev();
                    current2=current2.getprev();
                  }

               }
              System.out.println("hre1");
              s.print();
              System.out.println("hre1");
              result=s.linktoString();
              
          default:
              break;
              
      }
      return result;
    }

  
   
}
