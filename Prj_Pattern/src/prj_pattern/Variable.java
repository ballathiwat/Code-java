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
public class Variable implements Expression{
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    public double evaluate(HashMap<String, Double> context) throws Exception {
        Double value = context.get(name);
        if (value == null)
            throw new Exception("Unbound variable: " + name);

        return value;
    }
}
