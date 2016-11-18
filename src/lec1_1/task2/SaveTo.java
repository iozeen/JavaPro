package lec1_1.task2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Illya on 16.11.2016.
 */
@Retention(value= RetentionPolicy.RUNTIME)
public @interface SaveTo {
    String path();
}
