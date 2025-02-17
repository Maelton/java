package maelton.package8;

import maelton.package8.beans.Woman;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        //https://stackoverflow.com/questions/28404817/annotationconfigapplicationcontext-has-not-been-refreshed-yet-whats-wrong#:~:text=The%20refresh%20itself%20is%20just%20a%20phase%2C%20on%20which%2C%20roughly%2C%20ApplicationContext%20is%20initializing%20and%20preparing%20for%20use.%20There%20are%20multiple%20important%20things%20that%20happen%20during%20the%20refresh%20phase%2C%20such%20as
        context.refresh();

        Supplier<Woman> womanSupplier = () -> new Woman("Dark Brown");

        context.registerBean("darkBrownEyesWoman", Woman.class, womanSupplier);

        Woman darkBrownEyesWoman = context.getBean("darkBrownEyesWoman", Woman.class);

        System.out.println(darkBrownEyesWoman.getEyeColor());
    }
}
