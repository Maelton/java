package maelton.package19.beans;

import org.springframework.stereotype.Component;

@Component
public class Woman {

    private String name;
    private String eyesColor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEyeColor() {
        return eyesColor;
    }

    public void setEyeColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public String sayHello() {
        return "Hello, I'm " + this.name;
    }
}
