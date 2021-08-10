package aop;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends AbstractLibrary{

    public void getBook() {
        System.out.println("We're get a book from the Unilibrary");
        System.out.println("---------------------------------------------------");
    }

    public void getMagazine() {
        System.out.println("We're get a magazine from the UniLibrary");
        System.out.println("---------------------------------------------------");
    }

    public String returnBook() {
        System.out.println("We return a book to the uniLibrary");
        return "voina i mir";
    }

    public void returnMagazine() {
        System.out.println("We return a magazine to the uniLibrary");
        System.out.println("---------------------------------------------------");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("We add the book to the UniLibrary");
        System.out.println("---------------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("We add the magazine to the UniLibrary");
        System.out.println("---------------------------------------------------");
    }

}
