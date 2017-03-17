package test.lombok;

import lombok.Value;
import lombok.experimental.NonFinal;

/**
 * Created by kruart on 17.03.2017.
 *
 * @Value - generates a lot of code which fits with a class that is a representation of an immutable entity.
 * Equivalent to @Getter @FieldDefaults(makeFinal=true, level=AccessLevel.PRIVATE) @AllArgsConstructor @ToString @EqualsAndHashCode.
 */
@Value(staticConstructor = "getInstance")
public class ValueAnnotationEx01 {
    @NonFinal   //override
    private String name = "Buffon";
    private Integer id;
    private String address;


    public static void main(String[] args) {
        ValueAnnotationEx01 ex = ValueAnnotationEx01.getInstance("Gianluigi Buffon" ,1 , "Turin, Street 25");
        System.out.println(ex);
    }
}
