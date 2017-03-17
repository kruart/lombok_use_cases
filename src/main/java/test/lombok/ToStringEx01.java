package test.lombok;

/**
 * Created by kruart on 17.03.2017.
 */

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @ToString : This is implementation of toString(), we can use only for the class level.
 *
 * Parameters :
        includeFieldNames() : boolean type => define all field inclusion
        callSuper(): boolean type => calling super
        doNotUseGetters() : boolean type => avoid using getters of the fields.
        exclude() : String array of field names=> define field exclusion
        of() : String array of field names = > defines which to be added (explicitly)
 */
@ToString(includeFieldNames = true)
public class ToStringEx01 {
    private String id;
    private String name;
}

@ToString(callSuper = false, doNotUseGetters = true)
class ToStringEx02_1 {
    private String id;
    private String name;
}

@ToString(of = {"name"})  //Normally, all non-static fields are printed
class ToStringEx03_2 {
    @Getter @Setter private String id;
    @Getter @Setter private String name;
}

@ToString(exclude = "id")
class ToStringEx04_3 {
    private String id;
    private String name;
}

class ToStringStarter {
    public static void main(String[] args) {
        ToStringEx03_2 str = new ToStringEx03_2();
        str.setId("1");
        str.setName("kruart");
        System.out.println(str);
    }
}


