package dfwrete.vittal2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	model model1=new model();
       SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(model.class).buildSessionFactory();
       Session session=sessionFactory.openSession();
       model1=session.get(model.class,4);
       session.beginTransaction().commit();
       session.close();
       System.out.println(model1);
       
    }
}
