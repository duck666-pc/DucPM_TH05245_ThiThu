package Repository;

import Model.LoaiPhieuGiamGia;
import Util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class LoaiPhieuGiamGiaRepository {
    private Session session = null;

    public LoaiPhieuGiamGiaRepository(){
        session = HibernateConfig.getFACTORY().openSession();
    }

    public List<LoaiPhieuGiamGia> getAll() {
        return session.createQuery("FROM LoaiPhieuGiamGia lphg", LoaiPhieuGiamGia.class).getResultList();
    }

    public LoaiPhieuGiamGia getById(Integer id) {
        return session.find(LoaiPhieuGiamGia.class, id);
    }
}
