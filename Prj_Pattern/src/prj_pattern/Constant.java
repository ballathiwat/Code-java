/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj_pattern;
import java.util.HashMap;
/**
 *
 * @author SCM
 */
public class Constant implements Expression{
     private final double value;

    public Constant(double value) {
        this.value = value;
    }

    public double evaluate(HashMap<String, Double> context) {
        return value;
    }
    
    
}
