/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaprojectfinal;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class PizzaProjectF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
    	//new PizzaGUI().setVisible(true);
        
       /* Pan p = new Pan(200.0);
        Dough d = new Dough(300);
        Mixer m = new Mixer();
        try{
            m.Pour(p);
        }
        catch(PanOverFlowException ex)
        {
          System.out.println("the dough is over flow the pan");
        }*/
		Scanner input = new Scanner (System.in);
               ArrayList<Ingredients>myIngredient =new ArrayList<>() ;
            

			
			System.out.println("\n**********************************************\n"
					+ "Hello\nyou can choose the size of pizza you want: \n"
				        + "1-small \n2-medium \n3-large\n"
					+ "************************************************\n ");
			
                        int pizzaSize=input.nextInt();
                       
                                System.out.println("\n**********************************************\n"
					+ "Choose the deep of dough: \n"
					           + "1-pan \n2-deep dish \n"
					           + "************************************************\n ");
                                int x =input.nextInt();
                                String pizzaDeep="";
                                if(x==1)
                                    pizzaDeep="pan";
                                else
                                    pizzaDeep="deep dish";
                              // Dough myDough=new Dough(pizzaSize, pizzaDeep);
                              
                                         System.out.println("Choose your pizza ingredients : \n1-pizza sauce"
              +   "\n2-mozzarella cheese \n3-mushroom\n4-tomato\n5-olive\n6-pepper\n7-corn\n8-chicken\n9-exite");
                                        int z = 0;
                                                while(z!=9)
                                         {
                                         z=input.nextInt();
                                         
                                         switch(z){
                           
                                                 
                                            case 1 :  Ingredients ps= new Ingredients ("pizza sauce",10,20);
                                            myIngredient.add(ps);
                                            break;
				            case 2 :  Ingredients mc= new Ingredients ("mozzarella cheese",20,50);
                                            myIngredient.add(mc);
                                            break;
				            case 3 :  Ingredients msh = new Ingredients ("mushroom",10,25);
                                            myIngredient.add(msh);
                                            break;
				            case 4 :  Ingredients tm= new Ingredients ("tomato",25,30);
                                            myIngredient.add(tm);
                                            break;
				            case 5 :  Ingredients ol= new Ingredients ("olive",10,15);
                                            myIngredient.add(ol);
                                            break;
				            case 6 :  Ingredients pp = new Ingredients ("pepper",15,10);
                                            myIngredient.add(pp);
                                            break;
                                            case 7 :  Ingredients cn = new Ingredients ("corn",15,13);
                                            myIngredient.add(cn);
                                            break;
				            case 8 :  Ingredients ch = new Ingredients ("chicken",20,60);
                                            myIngredient.add(ch);
                                            break;
                                            
                                    
				                
                }}
                                      
  System.out.println("\n**********************************************\n"+ "enter the size of the pan you want: \n"
					           + "1-15 inch \n2-25 inch \n3-35 inch\n"
					           + "************************************************\n ");
			
                        int n=input.nextInt();
                     double panSize;
                        if(n==1)
                            panSize = 15;
                        else if(n==2)
                            panSize = 25;
                        else
                            panSize = 35;
                      //  Pan myPan =new Pan(panSize, myIngredient, myDough);
                                       
    } 

}    
