package test.lombok;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by kruart on 17.03.2017.
 */
public class GetterSetterEx01 {

    @Getter @Setter private String address;
    @Getter @Setter private String name;

    public static void main(String[] args) {
        GetterSetterEx01 ex = new GetterSetterEx01();
        ex.setName("Arthur");
        ex.setAddress("Kiev");
        System.out.println("My name is " + ex.getName() + " and I live in " + ex.getAddress() + ".");
    }
}
