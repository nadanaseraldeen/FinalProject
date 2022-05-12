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
public class MixerOverFlowException extends Exception{
    MixerOverFlowException(){
        super("the mixer is over flow ingredients");
    }
            
    MixerOverFlowException(String message){
        super(message);
    } 
}
