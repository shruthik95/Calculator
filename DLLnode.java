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
public class DLLnode {
  private  DLLnode next;
  private DLLnode prev;
  private Object value;

public DLLnode(Object val) 
{
    next=null;
    prev=null;
    value=val;
}

public Object getValue()
{
    return value;
}

public void setValue(Object val)
{
    value=val;
}

public void setnext(DLLnode n)
   {
       next=n;
   }
   public DLLnode getnext()
   {
       return next;
   }
   
    public void setprev(DLLnode p)
   {
       prev=p;
   }
   public DLLnode getprev()
   {
       return prev;
   }
   public int length()
   {
       int count=0;
       DLLnode curr=this;
       while(curr!=null)
       {
           curr=curr.getnext();
           count++;
       }
       return count;
   }
}
