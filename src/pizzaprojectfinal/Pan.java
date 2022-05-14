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
public class Pan {
    private double sizePan;
    private double calories;
    private double weight;
    private ArrayList<Ingredients>ingredient;
    private Mixer mixer;
    private double capacity;
    private String sizePizza;    
    private double caloriesPerPiece;

    
//default constructor ---------------------------------------------
    public Pan()
    {
        this.capacity=capacity;
        this.calories=0;
        this.ingredient=new ArrayList();
    }
    
    
//constructor ----------------------------------------------------
    public Pan( ArrayList<Ingredients> ingredient,Mixer mixer) {
        this.ingredient = ingredient;
        this.mixer=mixer;
        
        
    }
    Pan(double capacity){
        this.ingredient = new ArrayList();
    }
    

    public Pan(ArrayList<Ingredients> ingredient) {
        this.ingredient = ingredient;
         for (int i = 0; i < this.ingredient.size(); i++) {
            
           this.weight+= this.ingredient.get(i).getWeight(); 
        }
         for (int i = 0; i < this.ingredient.size(); i++) {
            this.calories+= this.ingredient.get(i).getCalories(); 

        }
    }
    

    public Pan( double calories, double weight, ArrayList<Ingredients> ingredient, Mixer mixer) {
        this.calories = calories;
        this.weight = weight;
        this.ingredient = ingredient;
       
     ingredient=new ArrayList<>();
     Ingredients pizzaSauce = new Ingredients("pizzaSauce",10,20);
     ingredient.add(pizzaSauce);
     Ingredients mozzarellaCheese = new Ingredients("mozzarellaCheese",20,50);
     ingredient.add(mozzarellaCheese);
     Ingredients mushroom = new Ingredients("mushroom",10,25);
     ingredient.add(mushroom);
     Ingredients tomato = new Ingredients("tomato",25,30);
     ingredient.add(tomato);
     Ingredients olive = new Ingredients("olive",10,15);
     ingredient.add(olive);
     Ingredients pepper = new Ingredients("pepper",15,10);
     ingredient.add(pepper);
     Ingredients corn = new Ingredients("corn",15,13);
     ingredient.add(corn);
     Ingredients chicken = new Ingredients("chicken",20,60);
     ingredient.add(chicken);

  for (int i = 0; i < this.ingredient.size(); i++) {
            
           this.weight+= this.ingredient.get(i).getWeight(); 
        }
         for (int i = 0; i < this.ingredient.size(); i++) {
            this.calories+= this.ingredient.get(i).getCalories(); 

        }
      
    }
  Pan(String sizePizza,double capacity,double calories ,double weight,double caloriesPerPiece)
  {
      this.sizePizza = sizePizza;
      this.capacity=capacity;
      this.calories=calories;
      this.weight=weight;
      this.caloriesPerPiece =caloriesPerPiece;
  }
  
  public Pan(Logger logger)
  {
      logger.log("the logger");
  }

//setters\getters ------------------------------------------------
    public void setSizePan(double sizePan) {    
        this.sizePan = sizePan;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        if(calories<0)
            this.calories=0;
        else
        this.calories = calories;
    }

    
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    


    public ArrayList<Ingredients> getIngredient() {
        return ingredient;
    }

    public void setIngredient(ArrayList<Ingredients> ingredient) {
        this.ingredient = ingredient;
    }

    public Mixer getMixer() {
        return mixer;
    }

    public void setMixer(Mixer mixer) {
        this.mixer = mixer;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        if(capacity<0)
            this.capacity=1000;
        else
        this.capacity = capacity;
    }

    public String getSizePizza() {
        return sizePizza;
    }

    public void setSizePizza(String sizePizza) {
        this.sizePizza = sizePizza;
    }

    public double getSizePan() {
        return sizePan;
    }


    //getInfo -----------------------------
        public String getInfo()
        {
        return "size pizza :" +this.sizePizza+"\npan capacity:"+capacity+"\nthe ingredients calories is  :" + 
                this.getCalories() +"\nthe ingredients weight is : " +
                this.getWeight()+"\ncalories per piece : " + this.caloriesPerPiece();
        }
       
//add dough in the pan -------------------------------------------
  public  void addS(Dough d) {
	d.setDoughCalories(50);	     
       this.calories+=   d.getDoughCalories();
	       
	   
   }
//add ingredients in the pan ---------------------------------------------------
public void add(Ingredients ingredient) throws IngredientsOverFlowWeigh  {
	double freeCapacity= this.capacity-this.weight; 
	 

  
  	  if ( freeCapacity< ingredient.getWeight()) {
  		throw new IngredientsOverFlowWeigh();
}
  	  else { 
  	  this.ingredient.add(ingredient);
         }
       
  	 
  	  this.weight+=ingredient.getWeight(); 
           this.calories += ingredient.getCalories();

          	  
}
    
//caluclate the calories per piece ------------------------------------------------
    public double caloriesPerPiece()
    {
        return this.getCalories()/8;
    }
    



}
