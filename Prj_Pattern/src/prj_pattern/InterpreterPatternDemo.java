
package prj_pattern;
import java.util.HashMap;


public class InterpreterPatternDemo {
    public static void main(String[] args) throws Exception {
    HashMap<String, Double> context = new HashMap<String, Double>();
    context.put("base", 10.0);
    context.put("height", 5.0);

    Expression two = new Constant(2);
    Expression base = new Variable("base");
    Expression height = new Variable("height");

    Expression multi = new Multiplication(base, height);
    Expression triangleArea = new Division(multi, two);

    double result = triangleArea.evaluate(context);
    System.out.println(result);
     
     
    }
}

