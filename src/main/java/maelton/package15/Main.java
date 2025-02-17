package maelton.package15;

import maelton.package15.beans.ManHeart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("maelton.package15");
        context.refresh();

        ManHeart manHeart = context.getBean(ManHeart.class);

        System.out.println(manHeart.getWoman().getEyeColor());
    }
}
