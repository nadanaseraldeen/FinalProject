/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaprojectfinal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Mixer {
   private ArrayList<Ingredients>ingredient;
   private double capacity;
   private Dough dough;
   private double calories;
   private double volume;
   
   
//default constructor ---------------------------------------
   public Mixer()
   {
       
   }
     
//constructor ---------------------------------------------------

    public Mixer(ArrayList<Ingredients> ingredient, double capacity, Dough dough, double calories, double volume) {
        this.ingredient = ingredient;
        this.capacity = capacity;
        this.dough = dough;
        this.calories = calories;
        this.volume = volume;
    }
    
    public Mixer(double capacity)
    {
        this.capacity = capacity;
    }
    
//setters/getters ----------------------------------------------

    public ArrayList<Ingredients> getIngredient() {
        return ingredient;
    }

    public void setIngredient(ArrayList<Ingredients> ingredient) {
        this.ingredient = ingredient;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    


//getInfo -----------------------------------------------------
    public String getInfo()
    {       return "Mixer{" + "ingredient=" + ingredient + ", capacity=" + capacity + ", dough=" + dough + ", calories=" + calories  + ", volume=" + volume + '}';
    }
     
//mix the ingredients to make pizza dough -------------------------------------
    public String mix() {
        String ing="mix ingredients to make pizza dough\n";
        for (int i = 0; i < this.ingredient.size(); i++)
            ing+= ingredient.get(i).getName()+"\n";
        return ing;   
    }
    
//free capacity for mixer and makee the exception if the ingredients over flow the capacity for the mixer  -------------------------
public void freeCapacityException(double capacity , Dough wegithDough) throws MixerOverFlowException  {
   
    double freeCapacity = this.capacity - dough.getWeight();
    
     if ( freeCapacity < dough.getWeight()) {
   	throw new MixerOverFlowException();
           }
   }
    
//pour the dough in the pan ---------------------------------------------------------
public void Pour (Pan p) throws MixerIsEmptyException{
	 
         double freePan = p.getCapacity()- p.getSizePan();

	 if (this.volume==0 ) 
             throw new MixerIsEmptyException();
		 if (freePan<=this.volume) {
			 p.setSizePan(freePan);
			 this.volume-=freePan;
			 
			 }
		 
		 else {
			 p.setSizePan(this.volume);
			 this.volume=0;
			 this.calories=0;
			 
		 }
 
 }

}
