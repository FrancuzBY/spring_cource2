package aop;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends AbstractLibrary{

    public void getBook() {
        System.out.println("We take the book from Unilibrary ");
    }

    public void getMagazine() {
        System.out.println("We take the magazine from UniLibrary");
    }

    public void returnBook() {
        System.out.println("We return the book to the uniLibrary");
    }

    public void returnMagazine() {
        System.out.println("We return the magazine to the uniLibrary");
    }

    public void addBook() {
        System.out.println("We add the book to the UniLibrary");
    }

    public void addMagazine() {
        System.out.println("We add the magazine to the UniLibrary");
    }

}
