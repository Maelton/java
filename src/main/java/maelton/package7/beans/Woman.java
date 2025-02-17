package maelton.package7.beans;

import jakarta.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Woman {

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying Woman object instance");
    }

    private String eyesColor;

    public String getEyeColor() {
        return eyesColor;
    }

    public void setEyeColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }
}
