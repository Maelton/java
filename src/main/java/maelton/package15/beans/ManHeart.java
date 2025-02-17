package maelton.package15.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ManHeart {

    private final Woman woman;
    //Spring follows this steps when trying to autowiring a Bean which
    //the class has multiple beans on Spring context:
        //STEP 1: Try autowiring by parameter name/field name correspondent to the Bean name
            //From Spring 6.1.0, the support for step 1 has been removed
        //STEP 2: Try autowiring by searching the @Primary annotation on the Bean
        //STEP 3: Try autowiring by the @Qualifier annotation with the Bean name
    @Autowired()
    public ManHeart(@Qualifier("darkBrown") Woman woman) {
        this.woman = woman;
    }

    public Woman getWoman() {
        return woman;
    }
}
