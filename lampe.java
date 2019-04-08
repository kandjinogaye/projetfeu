package projetfeu;


import javax.swing.*;
import java.awt.Color;
 

	public class lampe extends JPanel{
		  
		 
		     /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
			int a,b,c,d;
		    Color cc;
		 
		 
		   lampe(Color cc,int a,int b,int c,int d){
		    
		    this.cc=cc;
		    this.a=a;
		    this.b=b;
		    this.c=c;
		    this.d=d;
		    }
		 
		 
		    
		       public void allumerRouge(){
		          cc=Color.RED;
		       }
		 
		      
		       public void allumerVert(){
		           cc=Color.GREEN;
		       }
		 
		      
		       public void allumerOrange(){
		           cc=Color.ORANGE;
		        }
		 
		       
		       public void eteindreRouge(){
		           cc=new Color(100,0,0);
		 
		      }
		      public void eteindreVert(){
		           cc=new Color(10,80,10);
		 
		      }
		         public void eteindreOrange(){
		           cc=new Color(200,120,50);
		 
		      }
		}




