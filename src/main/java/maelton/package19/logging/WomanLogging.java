package maelton.package19.logging;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.springframework.stereotype.Component;

@Aspect
@Component
public class WomanLogging {

    //* -> Any return type (String, void, Integer, etc...)
    //.. -> Any number of arguments, including none
    @Before("execution(* maelton.package19.beans.Woman.sayHello(..))")
    public void beforeWomanSayHello() {
        System.out.println("Before a woman speaks look at her eyes");
    }
}
