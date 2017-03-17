package test.lombok;

import lombok.experimental.var;
import lombok.val;

import java.util.HashMap;

/**
 * Created by kruart on 17.03.2017.
 *
 * val:  this makes local final variable (inside method)
 * var:  like val but not final
 */
public class ValAndVarExample01 {
    //val and var it's experimental features on 17.03.2017
    val items1;
    var items2;

    public void  aMethod() {
        val store = new HashMap<String, String>();
        store.put("one", "Shantonu");
        val func = store.get("one");
        System.out.println(func.toLowerCase());
        store.put("two", "Andrii");
        store.put("three", "Oleks");
        for(val v: store.entrySet()){
            System.out.println("KEY =" +v.getKey()+", VAL = "+ v.getValue());
        }
    }
}
