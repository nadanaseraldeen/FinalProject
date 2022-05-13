/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaprojectfinal;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Dough {
    private String panDeep;
    private double weight;
    private ArrayList<Ingredients>ingredient;
    private double doughCalories;
    
 
//default constructor ---------------------------------------------
    public Dough()
    {
        
    }
    
//constructor -----------------------------------------------------
    public Dough(String panDeep, double weight, ArrayList<Ingredients> ingredient, double doughCalories) {
        this.panDeep = panDeep;
        this.weight = weight;
        this.ingredient = ingredient;
        this.doughCalories = doughCalories;
            Ingredients flour=new Ingredients("flour", 20, 105);         
            Ingredients water = new Ingredients("water", 10, 1);
            Ingredients yeast=new Ingredients("yeast", 15, 20);
            Ingredients salt=new Ingredients("salt", 5, 1);
    }
     public Dough( String panDeep, ArrayList<Ingredients> ingredient) {
        this.panDeep = panDeep;
        this.ingredient = ingredient;
         for (int i = 0; i < this.ingredient.size(); i++) {
            
           this.weight+= this.ingredient.get(i).getWeight();
           this.doughCalories+= this.ingredient.get(i).getCalories(); 
        }
         
    }
    
//getters & setters ---------------------------------------------------------
    public String getPanDeep() {
        return panDeep;
    }

    public void setPanDeep(String panDeep) {
        this.panDeep = panDeep;
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

    public void setDoughCalories(double doughCalories) {
        this.doughCalories = doughCalories;
    }
    public double getDoughCalories()
    {
    return doughCalories;
    }
    
    
//getInfo --------------------------------------------------------
    public String getInfo() {
        String ing="";
        for (int i = 0; i < this.ingredient.size(); i++)
          ing+= ingredient.get(i).getName()+"\n";
          
     return   "\npanDeep=" + panDeep + "\nweight the dough=" + weight + "g\ningredient:\n"+ing+"Dough Total calories= " +doughCalories;       
    }
 


}
