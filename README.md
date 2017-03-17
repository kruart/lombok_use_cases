**@Builder**: it is simply a builder (like builder pattern, with parameters)

**@Cleanup**: It is a easy way to cleanup the resources. It actually ensures, the resources close() method will be called in finally block of try.  
Only Local variable:
* Calling close method for resources. if you have another method name, then call you need value=thatMehtodName (like exit). No need try catch.

**@Data**: is a convenient shortcut annotation that bundles the features of @ToString, @EqualsAndHashCode, @Getter/@Setter and @RequiredArgsConstructor together

**@EqualsAndHashCode**: It simple add equals(Object other), and hashCode() to class. (so it is class level annotation).
It supports parameters to customize those equals and hash code methods. All parameters are same as @ToString.  
Parameters :
 *      callSuper(): boolean type => calling super
 *      doNotUseGetters() : boolean type => avoid using getters of the fields.
 *      exclude() : String array of field names=> define field exclusion
 *      of() : String array of field names = > defines which to be added (explicitly)
 *      onParam() :
By default, it'll use all non-static, non-transient fields

**@Getter and @Setter**: creates getters and setters

**@CommonsLog**: creates  private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(LogExample.class);  
**@Log**: creates private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(LogExample.class.getName());  
**@Log4j**: creates private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(LogExample.class);  
**@Log4j2**: creates private static final org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(LogExample.class);  
**@Slf4j**: creates private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(LogExample.class);  
**@XSlf4j**: creates private static final org.slf4j.ext.XLogger log = org.slf4j.ext.XLoggerFactory.getXLogger(LogExample.class);

**@NotNull**: This will add null check on variable and throws null pointer exception.Scope of use :  method, parameter, local variable

**@ToString**: This is implementation of toString(), we can use only for the class level.  
Parameters :
 *       includeFieldNames() : boolean type => define all field inclusion
 *       callSuper(): boolean type => calling super
 *       doNotUseGetters() : boolean type => avoid using getters of the fields.
 *       exclude() : String array of field names=> define field exclusion
 *       of() : String array of field names = > defines which to be added (explicitly)
 
 **@Synchronized** is a safer variant of the synchronized method modifier. Like synchronized, the annotation can be used on static and instance methods only. It operates similarly to the synchronized keyword, but it locks on different objects. The keyword locks on this, but the annotation locks on a field named $lock, which is private.
 If the field does not exist, it is created for you. If you annotate a static method, the annotation locks on a static field named $LOCK instead.
 
 
**val**:  this makes local final variable (inside method)  
**var**:  like val but not final


**@Value**: generates a lot of code which fits with a class that is a representation of an immutable entity. Equivalent to @Getter @FieldDefaults(makeFinal=true, level=AccessLevel.PRIVATE) @AllArgsConstructor @ToString @EqualsAndHashCode.