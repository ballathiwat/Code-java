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
public class Division implements Expression{
     private final Expression operand1;
    private final Expression operand2;

    public Division(Expression operand1, Expression operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public double evaluate(HashMap<String, Double> context) throws Exception {
        return operand1.evaluate(context) / operand2.evaluate(context);
    }
    
    
}
