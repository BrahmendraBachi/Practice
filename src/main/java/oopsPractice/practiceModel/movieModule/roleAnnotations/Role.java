package oopsPractice.practiceModel.movieModule.roleAnnotations;

import oopsPractice.practiceModel.movieModule.artists.Profession;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Role {

    Profession value();

}
