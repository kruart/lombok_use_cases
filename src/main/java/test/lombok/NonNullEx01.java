package test.lombok;

import lombok.NonNull;

/**
 * Created by kruart on 17.03.2017.
 *
 * @NotNull : This will add null check on variable and throws null pointer exception.
 * Scope of use :  method, parameter, local variable
 */
public class NonNullEx01 {
    private Integer id;
    private String name;
    private String address;

    public NonNullEx01(@NonNull String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        new NonNullEx01(null); //this throw NPE, if name is null
    }
}
