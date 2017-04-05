/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prj_pattern;
import com.sun.xml.internal.ws.api.ha.StickyFeature;
import java.util.HashMap;

public interface Expression {
    public  double evaluate(HashMap<String,Double>context) throws Exception;
}
