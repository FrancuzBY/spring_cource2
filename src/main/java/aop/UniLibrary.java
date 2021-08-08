package aop;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends AbstractLibrary{

//    @Override
    public void getBook() {
        System.out.println("We take the book from Unilibrary ");
    }

    public String returnBook() {
        System.out.println("We return the book to the uniLibrary");
        return "OK";
    }

    public void getMagazine() {
        System.out.println("We take the magazine from UniLibrary");
    }

}
