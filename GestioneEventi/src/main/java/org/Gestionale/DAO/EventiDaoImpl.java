package org.Gestionale.DAO;

import jakarta.persistence.EntityManager;
import org.Gestionale.EntryManagerUtil;
import org.Gestionale.Eventi;
import java.util.List;

public class EventiDaoImpl implements EventiDAO{

    @Override
    public void save(Eventi eventi){
        EntityManager em = EntryManagerUtil.getEntityManager();
        try{
            //provo a salvare
            em.getTransaction().begin();
            if (eventi.getId() == null){
                em.persist(eventi);
            } else {
                em.merge(eventi);
            }
        }
        catch (Exception e){
            if (em.getTransaction().isActive()){
                em.getTransaction().rollback();
                e.printStackTrace();
            }
        }
        finally {
            em.close();
        }
    }

    @Override
    public void findById(Long id) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Eventi> findall() {
        return List.of();
    }

}
