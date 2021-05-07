import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public  class passenger implements ActionListener{
   
    JFrame jonnyMain;
    JTextField inputAge,inputName,imputNumberofPassenegrs;
    JButton passengerButtonNext1;

    public void x(){ 
        jonnyMain = new JFrame("This is a TEst");
        jonnyMain.setBounds(400,100,500,500);
        jonnyMain.setVisible(true);
        jonnyMain.setLayout(null);
        jonnyMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jonnyMain.setResizable(false);
        
        
        
        JPanel passengerDetails = new JPanel();
        
        jonnyMain.getContentPane().add(passengerDetails);
        passengerDetails.setLayout(null);
        JLabel passengerName = new JLabel("Name");
        passengerDetails.add(passengerName);
        passengerDetails.setBackground(Color.WHITE);
        
        
        //input name
         inputName = new JTextField();
        passengerDetails.add(inputName);
        
        
        JLabel passengerAge = new JLabel("Age");
        passengerDetails.add(passengerAge);
        
         inputAge = new JTextField();
        passengerDetails.add(inputAge);
        
        
        JLabel numberofPassenegrs = new JLabel("# of passenger");
        passengerDetails.add(numberofPassenegrs);
        
         imputNumberofPassenegrs = new JTextField();
        passengerDetails.add(imputNumberofPassenegrs);
        imputNumberofPassenegrs.setEditable(false);
        
        
        imputNumberofPassenegrs.setBounds(110,120,160,30);
        numberofPassenegrs.setBounds(20,120,90,30);
        inputAge.setBounds(70,80,160,30);
        passengerAge.setBounds(20,80,90,30);
        inputName.setBounds(70,40,160,30);
        passengerName.setBounds(20,40,90,30);
        passengerDetails.setBounds(100,20,300,300);
        
        
        //button
        passengerButtonNext1 = new JButton("Next");
        passengerDetails.add(passengerButtonNext1);
        
        passengerButtonNext1.setBounds(100,180,120,40);
        
        passengerButtonNext1.addActionListener(this);
        
        
        
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
