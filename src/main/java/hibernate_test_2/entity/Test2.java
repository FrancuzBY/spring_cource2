package hibernate_test_2.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        try (Session session = factory.openSession()) {
//
//          Employee employee = new Employee("Misha", "Sidorov", "HR", 850);
//          Detail detail = new Detail("London", "44576541", "mishania@tut.by");
//          employee.setEmpDetail(detail);
//          detail.setEmployee(employee);
//          session.beginTransaction();
//          session.save(detail);
//
//          session.getTransaction().commit();
//          System.out.println("DONE!");


//          session.beginTransaction();
//          Detail detail = session.get(Detail.class, 5);
//          System.out.println(detail.getEmployee());
//
//
//          session.getTransaction().commit();
//          System.out.println("DONE!");
//
//
            session.beginTransaction();
            Detail detail = session.get(Detail.class, 1);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);
            System.out.println(detail.getEmployee());


            session.getTransaction().commit();
            System.out.println("DONE!");

        } finally {
            factory.close();
        }

    }

}
