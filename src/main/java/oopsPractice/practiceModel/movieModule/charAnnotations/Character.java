package oopsPractice.practiceModel.movieModule.charAnnotations;

import oopsPractice.practiceModel.movieModule.roleAnnotations.MovieRole;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Character {

    MovieRole value();

}
