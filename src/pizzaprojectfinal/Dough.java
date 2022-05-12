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
    private double sizeDough;
    private String panDeep;
    private double weight;
    private ArrayList<Ingredients>ingredient;
    private double doughCalories;
    
 
//default constructor ---------------------------------------------
    public Dough()
    {
        
    }
    
//constructor -----------------------------------------------------


    public Dough( String panDeep, ArrayList<Ingredients> ingredient) {
        this.sizeDough = sizeDough;
        this.panDeep = panDeep;
        this.ingredient = ingredient;
         for (int i = 0; i < this.ingredient.size(); i++) {
            
           this.weight+= this.ingredient.get(i).getWeight();
           this.doughCalories+= this.ingredient.get(i).getCalories(); 
        }
         
    }
   
//getters & setters

    public double getSizeDough() {
        return sizeDough;
    }

    public void setSizeDough(double sizeDough) {
        this.sizeDough = sizeDough;
    }

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
    
    
//getInfo --------------------------------------------------------
    public String getInfo() {
        String ing="";
        for (int i = 0; i < this.ingredient.size(); i++)
          ing+= ingredient.get(i).getName()+"\n";
          
       // double sizeWeight=sizeDough=="small"?250:sizeDough=="medium"?500:1000;
     return   "\npanDeep=" + panDeep + "\nweight the dough=" + weight + "g\ningredient:\n"+ing+"Dough Total calories= " +doughCalories;       
    }
// 
 
//calCulate the calories about the dough -------------------------------------
public double getDoughCalories()
{
    return doughCalories;
}


}
