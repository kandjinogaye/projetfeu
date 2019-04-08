package projetfeu;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.Color;
 
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JComponent;
import javax.swing.JFrame;


public class feutricolor extends JPanel{
	    
	    
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		lampe L1,L2,L3;
	    int a,b,c,d;
	 
	 
	 
	     
	 
	   public void paint(Graphics G){
	 
	 
	       G.setColor(Color.BLACK);
	 
	          
	        G.fillRect(a,b,c,d);
	        
	        G.setColor(L1.cc);
	       
	 
	        G.fillOval(L1.a,L1.b,L1.c,L1.d);
	        G.setColor(L2.cc);
	        G.fillOval(L2.a,L2.b,L2.c,L2.d); 
	        G.setColor(L3.cc);
	        G.fillOval(L3.a,L3.b,L3.c,L3.d);
	        G.setColor(L3.cc);
	 
	 
	    }
	 
	    
	       feutricolor(int a, int b,int c,int d){
	           this.a=a;
	           this.b=b;
	           this.c=c;
	           this.d=d;
	           lampe L1=new lampe (Color.RED,a+10,b+20,c-20,c-20);
	           lampe L2=new lampe (Color.ORANGE,a+10,b+80,c-20,c-20);
	        lampe L3=new lampe (Color.GREEN,a+10,b+140,c-20,c-20);
	 
	       }
	 
	 
	 
	          public static void showOnFrame(JComponent component, String frameName) {
	        JFrame frame = new JFrame(frameName);
	        WindowAdapter wa = new WindowAdapter() {
	            public void windowClosing(WindowEvent e) {
	                System.exit(0);
	            }
	        };
	        frame.addWindowListener(wa);
	        frame.getContentPane().add(component);
	        frame.pack();
	        frame.setVisible(true);
	        }

}
