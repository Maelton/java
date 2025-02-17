package maelton.package4.beans;

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
