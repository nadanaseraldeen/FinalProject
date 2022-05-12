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
public class MixerIsEmptyException extends Exception{
       
    public MixerIsEmptyException(){
        super("The mixer is empty or the dough is less than the size of the pan!");
    }
    
}
