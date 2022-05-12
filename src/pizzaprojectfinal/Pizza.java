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
public class Pizza {
    private Pan pan;
    private Dough dough;
    private Mixer mixer;
    private ArrayList<Ingredients> ingredient = new ArrayList<>();

//default constructor ----------------------------------------------
    public Pizza()
    {
        
    }
    
    
//constructor -------------------------------------------------------

    public Pizza(Pan pan, Dough dough, Mixer mixer) {
        this.pan = pan;
        this.dough = dough;
        this.mixer = mixer;
    }

 
   
//setters\getters -----------------------------------------------------

    public Pan getPan() {
        return pan;
    }

    public void setPan(Pan pan) {
        this.pan = pan;
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

    public Mixer getMixer() {
        return mixer;
    }

    public void setMixer(Mixer mixer) {
        this.mixer = mixer;
    }


//getInfo ----------------------------------------------------
    public String getInfo() {
        return "Pizza{" + "pan=" + pan + ", ingredient=" + ingredient + ", dough=" + dough + '}';
    }
    
// dough pizza ----------------------------------------   
     public String makeDough()
     {
       return  mixer.mix();
     }
     


}
