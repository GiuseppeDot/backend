package org.Gestionale;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntryManagerUtil {

    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("GestioneEventiPU");

    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }

    public static void close(){
        emf.close();
    }

}
