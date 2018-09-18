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
public class DLL {
     DLLnode head,tail;
    DLLnode current,temp;
   
    public DLLnode Dinsert(Object val)
    {
        if(head==null)
        {
           head=new DLLnode(val);
        }
        else
        {
            temp=new DLLnode(val);
            current=head;
            
            while(current.getnext()!=null)
            {
                current=current.getnext();
            }
           
            current.setnext(temp);
              temp.setprev(current);
              tail=temp;
        }
       return tail;
      }
    public void print(){
        for(DLLnode Dcurr=tail;Dcurr!=null;Dcurr=Dcurr.getprev())
        {
            System.out.print(Dcurr.getValue()+" ");
           
        }
    }
   
   
    public String linktoString(){
        String x="";
        for(DLLnode Dcurr=tail;Dcurr!=null;Dcurr=Dcurr.getprev())
        {
            String s=Dcurr.getValue().toString();
             x=x+s;
        }
        return x;
    }
}

