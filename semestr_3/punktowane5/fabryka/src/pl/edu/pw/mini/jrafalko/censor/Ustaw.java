package pl.edu.pw.mini.jrafalko.censor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Ustaw {
    Typ typ();
    public enum Typ{liczba,Produkty}

}
