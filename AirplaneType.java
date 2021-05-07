import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AirplaneType implements ActionListener{
	JFrame airplaneType;
    JButton buttonPrivate, buttonPublic, buttonRegular;
    
    
    public void Airplane(){ 
    	airplaneType = new JFrame("This is a TEst");
    	airplaneType.setBounds(400,100,500,500);
    	airplaneType.setVisible(true);
    	airplaneType.setLayout(null);
    	airplaneType.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	airplaneType.setResizable(false);
    	
    	
    	  
        JPanel airplaneTypePanel = new JPanel();
        
        airplaneType.getContentPane().add(airplaneTypePanel);
        airplaneTypePanel.setLayout(null);
        
        JLabel chooseAirplaneType = new JLabel("Choose Airplane Type");
        airplaneTypePanel.add(chooseAirplaneType);
        airplaneTypePanel.setBackground(Color.WHITE);
        
        
        
        chooseAirplaneType.setBounds(90,40,150,30);
        airplaneTypePanel.setBounds(100,20,300,300);
        
        buttonPrivate = new JButton("Private");
        buttonPublic = new JButton("Business");
        buttonRegular = new JButton("Regular Fare");
        
        airplaneTypePanel.add(buttonPrivate);
        airplaneTypePanel.add(buttonPublic);
        airplaneTypePanel.add(buttonRegular);
        
        
        buttonPrivate.setBounds(90,100,150,30);
        buttonPublic.setBounds(90,150,150,30);
        buttonRegular.setBounds(90,200,150,30);
        
        buttonPrivate.addActionListener(this);
        buttonPublic.addActionListener(this);
        buttonRegular.addActionListener(this);
    	
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		Destination Destination = new Destination();
		
		 if(e.getSource()== buttonPrivate ){
            
			 Destination.Private();
			 
         }else if(e.getSource()== buttonPublic){
            
        	 Destination.Business();
         }else if(e.getSource()== buttonRegular){
             
        	 Destination.Regular();
          }
		
	}
}
