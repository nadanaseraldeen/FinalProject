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
public abstract class MyLogger implements Logger{
    public void log(String msg){
        System.out.println(msg);
    }
}
