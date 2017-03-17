package test.lombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by kruart on 17.03.2017.
 */
@Getter @Setter(AccessLevel.PUBLIC)
public class GetterSetterEx02_AccessLevelClass {
    private String address;

    //Overriding class level getter
    @Getter(AccessLevel.PRIVATE) private String name;
}

class Starter {

    public static void main(String[] args) {
    GetterSetterEx02_AccessLevelClass ex = new GetterSetterEx02_AccessLevelClass();
        ex.setName("Arthur");
        ex.setAddress("Kiev");

//      System.out.println("My name is " + ex.getName()); //we don't have access to 'name' field because it have the private modifier

        System.out.println("I live in " + ex.getAddress() + ".");
    }
}


