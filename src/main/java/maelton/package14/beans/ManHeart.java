package maelton.package14.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManHeart {

    private final Woman woman;

    @Autowired()
    public ManHeart(Woman woman) {
        this.woman = woman;
    }

    public Woman getWoman() {
        return woman;
    }
}
