package com.demo;

import com.demo.models.Quote;
import com.demo.models.Stock;
import com.demo.models.StockExchange;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class JpaApp
{
    public static class JpaHibernate {
        private EntityManagerFactory entityManagerFactory;

        public void init() {
            entityManagerFactory = Persistence.createEntityManagerFactory("com.demo.jpa");
        }

        public void save(Quote quote){
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();

            entityManager.persist(quote);

            entityManager.getTransaction().commit();
            entityManager.close();
        }

        public void destroy(){
            entityManagerFactory.close();
        }

    }

    public static void main( String[] args )
    {
        JpaHibernate jpaHibernate = new JpaHibernate();
        jpaHibernate.init();

        Stock stock = new Stock("600663", StockExchange.shanghai);
        Quote quote = new Quote(stock, "34.69");

        jpaHibernate.save(quote);

        jpaHibernate.destroy();
        System.out.println( "Hello World!" );
    }
}
