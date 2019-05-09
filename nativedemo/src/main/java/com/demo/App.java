package com.demo;

import com.demo.models.Quote;
import com.demo.models.Stock;
import com.demo.models.StockExchange;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App
{
    static public class NativeHibernate {
        private SessionFactory sessionFactory;

        public void init(){
            final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
            try {
                sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            } catch (Exception e) {
                StandardServiceRegistryBuilder.destroy(registry);
            }
        }

        public void destroy(){
            sessionFactory.close();
        }

        public void save(Quote quote) {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
//            Stock stock = new Stock("600666", StockExchange.shanghai);
//            Quote quote = new Quote(stock, "99.99");
            session.save(quote);
            session.getTransaction().commit();
            session.close();
        }
    }
    public static void main( String[] args )
    {

        NativeHibernate nativeHibernate = new NativeHibernate();
        nativeHibernate.init();
        Stock stock = new Stock("600667", StockExchange.shanghai);
        Quote quote = new Quote(stock, "88.99");
        nativeHibernate.save(quote);

        nativeHibernate.destroy();

        System.out.println( "Hello World!" );
    }
}
