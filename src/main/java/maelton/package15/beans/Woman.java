package maelton.package15.beans;

import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Woman {

    private String eyesColor;

    public String getEyeColor() {
        return eyesColor;
    }

    public void setEyeColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }
}
