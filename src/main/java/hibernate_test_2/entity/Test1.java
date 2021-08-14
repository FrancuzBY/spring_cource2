package hibernate_test_2.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        try (Session session = factory.openSession()) {
//          session.beginTransaction();
//
//          Employee employee = new Employee("Alexandr", "Tolstik", "IT", 500);
//          Detail detail = new Detail("Baku", "dsfsdf", "tolstik@tut.by");
//          employee.setEmpDetail(detail);
//          session.save(employee);
//
//          session.getTransaction().commit();
//          System.out.println("DONE!");

//            session.beginTransaction();
//
//            Employee employee = new Employee("Oleg", "Smirnov", "Sales", 700);
//            Detail detail = new Detail("Moskow", "9846544132", "olezka@tut.by");
//            employee.setEmpDetail(detail);
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("DONE!");

            session.beginTransaction();
            Employee emp = session.get(Employee.class, 2);
            session.delete(emp);
//            System.out.println(emp.getEmpDetail());

            session.getTransaction().commit();
            System.out.println("DONE!");

        } finally {
            factory.close();
        }

    }

}
