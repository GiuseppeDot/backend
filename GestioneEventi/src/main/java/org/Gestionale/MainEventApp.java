package org.Gestionale;

import jakarta.persistence.EntityManager;

public class MainEventApp {

    public static void main(String[] args){
        EntityManager em = EntryManagerUtil.getEntityManager();
    }

}
