/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.Scanner;
import javafx.application.Platform;
import javafx.scene.control.Button;

/**
 *
 * @author SHRUTHI
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField text1;
    @FXML
    private TextField text2;
    @FXML
    private TextField text3;
    @FXML
    private TextField text4;
    
   
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
   
   
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String op=((Button)event.getSource()).getText();
        switch(op)
        {
            case "+":
                text4.setText("+");
                break;
                
            case "-":
                text4.setText("-");
                break;
                
            case"*":
                text4.setText("*");
                break;
             
            case ">":
                 text4.setText(">");
                break;
            
            case "<":
                 text4.setText("<");
                break;
                
             case"==":
                  text4.setText("==");
                break;
                
             case "Quit":
                 Platform.exit();
                 break;
                 
             case "Compute":
                 String num1=text1.getText();
                 String num2=text2.getText();
                 //text3.setText(num1);
                   append(num1,num2);   
                   
                 break;
                 
             default:
                 break;
                 
        }
    }     
    //inserting each number in string to the linked list.
  public void BigNumber(String n1,String n2)
  {
    String num1=n1;
    String num2=n2;
    System.out.println(num1);
    System.out.println(num2);
    DLLnode list1=null,list2=null;
    DLL bn=new DLL();//list1
    DLL sn=new DLL();//list2
  for(int i=0;i<num1.length();i++)
    {
      list1=bn.Dinsert(num1.substring(i, i+1));
    }
    
    for(int j=0;j<num2.length();j++)
    {
       list2=sn.Dinsert(num2.substring(j, j+1));
    }
    
    //printing linkedlist
    
        for(DLLnode Dcurr=list1;Dcurr!=null;Dcurr=Dcurr.getprev())
        {
            System.out.print(Dcurr.getValue()+" ");
           
        }
         System.out.println();
    for(DLLnode Dcurr=list2;Dcurr!=null;Dcurr=Dcurr.getprev())
        {
            System.out.print(Dcurr.getValue()+" ");
        }
    System.out.println();
    String op1=text4.getText();
   operations o=new operations();
   String result=o.operations(list1,list2,op1);
   text3.setText(result);
    //text3.setText(op1);//testcase
  //text3.setText((String)list1.getValue());//testcase
  }
 //appending zeros to the string
  public void append(String num1,String num2)
    {
        String newnum1=num1;
        String newnum2=num2;
        int nl1=newnum1.length();
        int nl2=newnum2.length();
         int x=newnum1.indexOf('.');
        int y=newnum2.indexOf('.');
        
        String beforedot="";
        String afterdot="";
        
       if(x>y)
       {
        for(int i=0;i<(x-y);i++)
         {
             //String beforedot=null;
             beforedot=beforedot+"0";
         }
         newnum2=beforedot+newnum2;
       }
       else
       {
           for(int i=0;i<(y-x);i++)
           {
               beforedot=beforedot+"0";
           }
           newnum1=beforedot+newnum1;
       }
        
       if((nl1-x-1)>(nl2-y-1))
       {
           for(int i=0;i<(nl1-x-1)-(nl2-y-1);i++)
           {
               afterdot=afterdot+"0";
           }
           newnum2=newnum2+afterdot;
       }
       else
       {
           for(int i=0;i<(nl2-y-1)-(nl1-x-1);i++)
           {
               afterdot=afterdot+"0";
           }
           newnum1=newnum1+afterdot;
       }
      
     BigNumber(newnum1,newnum2);
      // text3.setText(newnum2);
    }


 }
