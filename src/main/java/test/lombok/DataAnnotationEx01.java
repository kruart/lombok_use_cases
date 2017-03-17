package test.lombok;

import lombok.Data;

/**
 * Created by kruart on 17.03.2017.
 *
 * @Data is a convenient shortcut annotation that bundles
 * the features of @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor together
 */


@Data
public class DataAnnotationEx01 {
    private String name = "Max";
    private String id;
    private String address;

    public static void main(String[] args) {
        DataAnnotationEx01 ex = new DataAnnotationEx01();
        System.out.println(ex.getName());
    }
}


@Data(staticConstructor = "getInstance")
class DataAnnotationEx02 {
    private String name = "Jesse Pinkman";
    private String id;
    private String address;

    public static void main(String[] args) {
        DataAnnotationEx02 ex = DataAnnotationEx02.getInstance();
        System.out.println(ex.getName());
    }
}


