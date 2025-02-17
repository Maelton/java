package maelton.package17.beans;

import jakarta.annotation.PostConstruct;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
@Lazy
public class Woman {

    @PostConstruct
    public void init() {
        System.out.println("Woman created");
    }

    private String eyesColor;

    public String getEyeColor() {
        return eyesColor;
    }

    public void setEyeColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }
}
