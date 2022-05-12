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
    private double volume;//nn
    private ArrayList<Ingredients>ingredient;
     private Dough dough;
     private double totalCalories;
     private Ingredients ingre;
     private double capacity;
    
//default constructor ---------------------------------------------
    public Pan()
    {
        this.capacity=capacity;
        this.sizePan=0;
        this.calories=0;
        this.ingredient=new ArrayList();
    }
    //n
    Pan(double capacity){
        this.ingredient = new ArrayList();
    }
    
//constructor ----------------------------------------------------

    public Pan(double sizePan, ArrayList<Ingredients> ingredient,Dough dough) {
        this.sizePan = sizePan;
        this.ingredient = ingredient;
        this.dough=dough;
        
        
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
    

    public Pan(double sizePan, double calories, double weight, ArrayList<Ingredients> ingredient, Dough dough, double totalCalories) {
        this.sizePan = sizePan;
        this.calories = calories;
        this.weight = weight;
        this.ingredient = ingredient;
        this.dough = dough;
        this.totalCalories = totalCalories;
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

   

  

 
   
    
//setters\getters ------------------------------------------------
    public double getSizePan() {
        return sizePan;
    }

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

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public double getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(double totalCalories) {
        this.totalCalories = totalCalories;
    }

    public Ingredients getIngre() {
        return ingre;
    }

    public void setIngre(Ingredients ingre) {
        this.ingre = ingre;
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
    
    

    //getInfo -----------------------------
    @Override
    public String toString() {
        return  "sizePan=" + sizePan + ", \ncalories=" + calories + ", \nweight=" + weight + ", \ningredient=" + ingredient + ", \ndough=" + dough.getPanDeep()+ ", \ntotalCalories=" + totalCalories +  '}';
    }
  
        public String getInfo() {
        String ing="";
        for (int i = 0; i < this.ingredient.size(); i++)
          ing+= ingredient.get(i).getName()+"\n";
          
     return  "ingredient:\n"+ing+"ingredients Total calories= " +calories + "\nweight = "+ weight+"\ncalories per piece "+this.caloriesPerPiece()  ;       
    }
        public String getIInfo()
        {
        return "\npan capacity:"+capacity+"\nthe total amount of calories :" + 
                this.getCalories() +"\nthe ingredients weight is : " +
                this.getWeight();
        }
//add dough in the pan -------------------------------------------
  public  void addS(Dough d) {
     // d.setWeight(weight);
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
          	  
}
//N
      public void blend() throws IngredientsEmpty {
        
        
        for(Ingredients ing: this.ingredient){
            this.calories += ing.getCalories();
          
        }
      }
//calculate the total calories ------------------------------------------------------
    public double totalCalories()
    {
        return this.getCalories()+dough.getDoughCalories();
    }
    
//caluclate the calories per piece ------------------------------------------------
    public double caloriesPerPiece()
    {
        return this.totalCalories()/8;
    }
    



}
