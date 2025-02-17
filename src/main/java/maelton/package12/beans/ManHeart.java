package maelton.package12.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManHeart {
    public Woman getWoman() {
        return woman;
    }

    public void setWoman(Woman woman) {
        this.woman = woman;
    }

    public Lover getMistress() {
        return mistress;
    }

    public void setMistress(Lover mistress) {
        this.mistress = mistress;
    }

    @Autowired
    private Woman woman;

    @Autowired(required = false) //If the bean does not exist then it is null
    private Lover mistress; //In this example Lover is not a bean
}
