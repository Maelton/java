package maelton.package13.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManHeart {

    private Woman woman;
    private Lover mistress;

    @Autowired
    public void setWoman(Woman woman) {
        this.woman = woman;
    }

    @Autowired(required = false)
    public void setMistress(Lover mistress) {
        this.mistress = mistress;
    }

    public Woman getWoman() {
        return woman;
    }

    public Lover getMistress() {
        return mistress;
    }
}
