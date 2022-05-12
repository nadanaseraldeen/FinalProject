/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaprojectfinal;

/**
 *
 * @author HP
 */
public class Ingredients {
    private String name;
    private double weight;
    protected double calories;
    
//default constructor --------------------------------------
    public Ingredients()
    {
   
    }
    

//constructor ------------------------------------------------
    public Ingredients(String name, double weight, double calories) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
    }
    
//setters\getters ---------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
    
//getInfo ---------------------------------------------------------
    public String getInfo() {
        return "Ingredients{" + "name=" + name + ", weight=" + weight + ", calories=" + calories + '}';
    }
    
}
