package aop.aspects;

import aop.MyConfig;
import aop.Student;
import aop.UniLibrary;
import aop.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {

    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary library = context.getBean("uniLibraryBean", UniLibrary.class);
        String bookName = library.returnBook();
        System.out.println("The book " + bookName + " was returned to the library");

        context.close();
        System.out.println("Method name ends");
    }

}
