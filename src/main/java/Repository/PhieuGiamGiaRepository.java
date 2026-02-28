package Repository;

import Model.PhieuGiamGia;
import Util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class PhieuGiamGiaRepository {
    private Session session = null;

    public PhieuGiamGiaRepository() {
        session = HibernateConfig.getFACTORY().openSession();
    }

    public List<PhieuGiamGia> getAll(){
        return session.createQuery("FROM PhieuGiamGia phg", PhieuGiamGia.class).getResultList();
    }

    public PhieuGiamGia getById(Integer id){
        return session.find(PhieuGiamGia.class, id);
    }

    public void addPhieuGiamGia(PhieuGiamGia phg){
        try {
            session.getTransaction().begin();
            session.save(phg);
            session.getTransaction().commit();
        } catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void update(PhieuGiamGia phg){
        try {
            session.getTransaction().begin();
            session.update(phg);
            session.getTransaction().commit();
        } catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void deletePhieuGiamGia(Integer id){
        try {
            session.getTransaction().begin();
            session.delete(this.getById(id));
            session.getTransaction().commit();
        } catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }
}
