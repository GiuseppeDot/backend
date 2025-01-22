package org.Gestionale.DAO;

import org.Gestionale.Eventi;

import java.util.List;

public interface EventiDAO {
    //metodo per salvare un evento
    void save (Eventi eventi);
    //metodo per recuperare un evento tramite ID
    void findById(Long id);
    //metodo per cancellare un evento
    void deleteById(Long id);
    //trovare tutti gli eventi
    List<Eventi> findall();
}
