package com.demo;

import static org.junit.Assert.assertTrue;

//import com.demo.models.Quote;
//import com.demo.models.Stock;
//import com.demo.models.StockExchange;
import junit.framework.TestCase;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

import java.util.List;

/**
 * Unit test for simple App.
 */
//public class AppTest
//{
//    private SessionFactory sessionFactory;
//    /**
//     * Rigorous Test :-)
//     */
//    @Test
//    public void shouldAnswerWithTrue()
//    {
//        assertTrue( true );
//    }
//
//    @Test
//    public void testSave() {
//
//    }
//}

//public class AppTest extends TestCase {
//    private SessionFactory sessionFactory;
//
//    @Override
//    protected void setUp() throws Exception {
//        //super.setUp();
//        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
//        try {
//            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
//        } catch (Exception e) {
//            StandardServiceRegistryBuilder.destroy(registry);
//        }
//    }
//
//    @Override
//    protected void tearDown() throws Exception {
//        //super.tearDown();
//        if (sessionFactory != null) {
//            sessionFactory.close();
//        }
//    }
//
//    public void testBasicUsage() {
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        Stock stock = new Stock("600666", StockExchange.shanghai);
//        Quote quote = new Quote(stock, "99.99");
//        session.save(quote );
//        session.getTransaction().commit();
//        session.close();
//
//        session = sessionFactory.openSession();
//        session.beginTransaction();
//        List result = session.createQuery("from Quote").list();
//        for ( Quote quote1 : (List<Quote>) result ) {
//            System.out.println( quote1.toString() );
//        }
//
//    }
//}
