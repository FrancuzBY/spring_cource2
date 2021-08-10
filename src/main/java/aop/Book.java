package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bookBean")
public class Book {

    @Value("Pr i nak")
    private String name;

    @Value("F.M. Dostoevkiy")
    private String author;

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Value("1866")
    private int yearOfPublication;

    public String getName() {
        return name;
    }

}
