package test.lombok;

import lombok.EqualsAndHashCode;

/**
 * Created by kruart on 17.03.2017.
 *
 * @EqualsAndHashCode : It simple add equals(Object other), and hashCode() to class. (so it is class level annotation).
 * It supports parameters to customize those equals and hash code methods. All parameters are same as @ToString.
 *
 * Parameters :
 *      callSuper(): boolean type => calling super
 *      doNotUseGetters() : boolean type => avoid using getters of the fields.
 *      exclude() : String array of field names=> define field exclusion
 *      of() : String array of field names = > defines which to be added (explicitly)
 *      onParam() :
 *
 *      By default, it'll use all non-static, non-transient fields
 */
@EqualsAndHashCode()
public class EqualsAndHashCodeEx01 {
    private transient int transientVar = 10;
    private String name;
    private String score;
}
