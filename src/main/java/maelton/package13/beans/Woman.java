package maelton.package13.beans;

import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Woman {

    @PostConstruct
    public void init() {
        this.eyesColor = "Dark Brown";
    }

    private String eyesColor;

    public String getEyeColor() {
        return eyesColor;
    }

    public void setEyeColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }
}
