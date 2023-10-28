package repository;

import config.HibernateUtils;
import domain.Hotel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HotelRepository {

    private Session session;

    public void save(Hotel hotel){
        try {
            session= HibernateUtils.getSessionFactory().openSession();
            Transaction transaction =session.beginTransaction();

            session.save(hotel);

            transaction.commit();
        }catch (HibernateException e){
            e.printStackTrace();
        }finally {
            HibernateUtils.closeSession(session);
        }


    }





}
