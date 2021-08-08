package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bookBean")
public class Book {

    @Value("Pr i nak")
    private String name;

    public String getName() {
        return name;
    }

}
