package es.jairochapela.autodiagnostico;

// import javax.persistence.EntityManager;
// // import javax.persistence.EntityManagerFactory;
// // import javax.persistence.Persistence;
// import javax.persistence.PersistenceContext;

import org.springframework.core.convert.converter.Converter;

public class ComunidadAutonomaConverter implements Converter<String, ComunidadAutonoma> {

    // @PersistenceContext
    // private EntityManager entityManager;
        
    @Override
    public ComunidadAutonoma convert(String id) {
        // EntityManagerFactory emf = Persistence.createEntityManagerFactory("merda");
        // entityManager = emf.createEntityManager();
        return new ComunidadAutonoma(Integer.parseInt(id), "");
    }

}