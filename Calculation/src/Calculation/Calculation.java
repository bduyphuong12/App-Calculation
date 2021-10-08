package Calculation;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;



public class Calculation extends JFrame implements ActionListener {
	TextField txtkq;
	Panel pn1,pn2,pn3,pn;
	Button BS,CE,C,MC,MR,MS,M,bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,cong,tru,nhan,chia,sqrt,phantram,bang,nghichdao,thapphan,dauam;
	
	public void GUI()
	{
		CE=new Button("CE");
		CE.addActionListener(this);
		BS=new Button("Backspace");
		BS.addActionListener(this);
		C=new Button("C");
		C.addActionListener(this);
		MC=new Button("MC");
		MC.addActionListener(this);
		MS=new Button("MS");
		MS.addActionListener(this);
		MR=new Button("MR");
		MR.addActionListener(this);
		M=new Button("M");
		M.addActionListener(this);
		bt0=new Button("0");
		bt0.addActionListener(this);
		bt1=new Button("1");
		bt1.addActionListener(this);
		bt2=new Button("2");
		bt2.addActionListener(this);
		bt3=new Button("3");
		bt3.addActionListener(this);
		bt4=new Button("4");
		bt4.addActionListener(this);
		bt5=new Button("5");
		bt5.addActionListener(this);
		bt6=new Button("6");
		bt6.addActionListener(this);
		bt7=new Button("7");
		bt7.addActionListener(this);
		bt8=new Button("8");
		bt8.addActionListener(this);
		bt9=new Button("9");
		bt9.addActionListener(this);
		cong=new Button("+");
		cong.addActionListener(this);
		tru=new Button("-");
		tru.addActionListener(this);
		nhan=new Button("*");
		nhan.addActionListener(this);
		chia=new Button("/");
		chia.addActionListener(this);
		sqrt=new Button("sqrt");
		sqrt.addActionListener(this);
		phantram=new Button("%");
		phantram.addActionListener(this);
		bang=new Button("=");
		bang.addActionListener(this);
		nghichdao=new Button("1/x");
		nghichdao.addActionListener(this);
		dauam=new Button("+/-");
		dauam.addActionListener(this);
		thapphan=new Button(".");
		thapphan.addActionListener(this);
		txtkq = new TextField();
		
		pn1 = new Panel(new GridLayout(4,6));
		pn1.add(txtkq);
		txtkq.setEditable(false);
		
		pn2 = new Panel(new GridLayout(1,3));
		pn2.add(BS);
		pn2.add(CE);
		pn2.add(C);
		
		pn3 = new Panel(new GridLayout(4,6));
		pn3.add(MC);
		pn3.add(bt7);
		pn3.add(bt8);
		pn3.add(bt9);
		pn3.add(chia);
		pn3.add(sqrt);
		
		pn3.add(MR);
		pn3.add(bt4);
		pn3.add(bt5);
		pn3.add(bt6);
		pn3.add(nhan);
		pn3.add(phantram);
		
		pn3.add(MS);
		pn3.add(bt1);
		pn3.add(bt2);
		pn3.add(bt3);
		pn3.add(tru);
		pn3.add(nghichdao);
		
		pn3.add(M);
		pn3.add(bt0);
		pn3.add(dauam);
		pn3.add(thapphan);
		pn3.add(cong);
		pn3.add(bang);
		
		pn = new Panel(new GridLayout(3,1));
		pn.add(pn1);
		pn.add(pn2);
		pn.add(pn3);
		add(pn);
		
		setSize(400,300);
		setVisible(true);
	}
	int casenumber = 0;
	double a = 0, b = 0,kq=0; 
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand() == "1")
	          txtkq.setText(txtkq.getText() + "1");
	      if(e.getActionCommand()=="2")
	    	  txtkq.setText(txtkq.getText() + "2");
	      if(e.getActionCommand()=="3")
	    	  txtkq.setText(txtkq.getText() + "3");
	      if(e.getActionCommand()=="4")
	    	  txtkq.setText(txtkq.getText() + "4");
	      if(e.getActionCommand()=="5")
	    	  txtkq.setText(txtkq.getText() + "5");
	      if(e.getActionCommand()=="6")
	    	  txtkq.setText(txtkq.getText() + "6");
	      if(e.getActionCommand()=="7")
	    	  txtkq.setText(txtkq.getText() + "7");
	      if(e.getActionCommand()=="8")
	    	  txtkq.setText(txtkq.getText() + "8");
	      if(e.getActionCommand()=="9")
	    	  txtkq.setText(txtkq.getText() + "9");
	      if(e.getActionCommand()=="0")
	    	  txtkq.setText(txtkq.getText() + "0");
	      if(e.getActionCommand()==".")
	    	  txtkq.setText(txtkq.getText() + ".");
	      if(e.getActionCommand()=="+/-")
	      {
            if(txtkq.getText() != "") {
          	  a = Double.parseDouble(txtkq.getText());
                a = a*(-1);
                txtkq.setText(Double.toString(a));
            }
            else {
            	txtkq.setText("-");
            }
        }
	      if(e.getActionCommand()=="Backspace")
	      {
            if(txtkq.getText().length() != 0)	{
            	txtkq.setText(txtkq.getText().substring(0, txtkq.getText().length() - 1));
          	  System.out.println(txtkq.getText());
            }
        }
	      if(e.getActionCommand()=="CE")
	      {
	    	  
	    	  txtkq.setText("");
        }
	      if(e.getActionCommand()=="C") {
	    	  kq = 0;
	    }
  	  if(e.getActionCommand() == "+")
        {
  		  if(txtkq.getText().length() != 0) {a = Double.parseDouble(txtkq.getText());}
            casenumber= 1;
            txtkq.setText("");
        }
        if(e.getActionCommand()=="-")
      	  
        {
      	  if(txtkq.getText().length() != 0) {a = Double.parseDouble(txtkq.getText());}
            casenumber= 2;
            txtkq.setText("");
        }
   
        if(e.getActionCommand()=="*")
        {
      	  if(txtkq.getText().length() != 0) {a = Double.parseDouble(txtkq.getText());}
            casenumber= 3;
            txtkq.setText("");
        }
   
        if(e.getActionCommand()=="/")
        {
      	  if(txtkq.getText().length() != 0) {a = Double.parseDouble(txtkq.getText());}
            casenumber= 4;
            txtkq.setText("");
        }
        if(e.getActionCommand()=="%")
        {
      	  if(txtkq.getText().length() != 0) {a = Double.parseDouble(txtkq.getText());}
            casenumber= 5;
            txtkq.setText("");
        }
        if(e.getActionCommand()=="sqrt")
        {
      	  if(txtkq.getText().length() != 0) {a = Double.parseDouble(txtkq.getText());}
            casenumber= 6;
            txtkq.setText("");
        }
        if(e.getActionCommand()=="1/x")
        {
      	  if(txtkq.getText().length() != 0) {a = Double.parseDouble(txtkq.getText());}
            casenumber= 7;
            txtkq.setText("");
        }
        if(e.getActionCommand() == "=")
        {
      	  if(txtkq.getText().length() != 0) {b = Double.parseDouble(txtkq.getText());}
             switch(casenumber)
             {
	              case 1: kq = a+b;
	              break;
	     
	              case 2: kq = a-b;
	              break;
	     
	              case 3: kq = a*b;
	               break;
	     
	              case 4: kq = a/b;
	              break;
	     
	              case 5: kq = a%b;
	              break;
	              
	              case 6: kq = Math.sqrt(a);
	              break;
	              
	              case 7: kq = 1/a;
	              break;
	             
             }
            
             txtkq.setText(Double.toString(kq));
        }
	}
	public Calculation(String st)
	{
		super(st);
		GUI();
	}
	public static void main(String []args) {
		new Calculation("Caculator");
	}
}
