package test.lombok;

import lombok.Builder;
import lombok.Singular;

import java.util.Set;

/**
 * Created by kruart on 17.03.2017.
 *
 * @Builder - it is simply a builder (like builder pattern, with parameters)
 */
@Builder(builderClassName = "BuilderLombokClass", buildMethodName = "make", builderMethodName = "creator")
public class BuilderAnnotationEx01 {
    private Integer id;
    private String name;

    @Singular //Used together with @Builder. It include 2 adder methods, single add, add all
    private Set<String> addresses;
}
