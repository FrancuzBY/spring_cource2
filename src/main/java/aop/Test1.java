package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Book book = context.getBean("bookBean", Book.class);
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibraryBean", SchoolLibrary.class);
//        schoolLibrary.getBook();

        UniLibrary uniLibrary = context.getBean("uniLibraryBean", UniLibrary.class);
        uniLibrary.getBook();
//        uniLibrary.getMagazine();
//        uniLibrary.returnMagazine();
        uniLibrary.addBook("Tolstik", book);
        uniLibrary.addMagazine();

        context.close();
    }
}
