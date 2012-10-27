package tk.nekotech.featureblock;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface NotYetImplemented {
    public enum Priority {
        LOW, NORMAL, MEDIUM, HIGH
    }

    Priority priority() default Priority.NORMAL;

    String value();
}
