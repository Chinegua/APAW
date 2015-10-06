package es.upm.miw.webArchitecture.business.models.daos.memory;

import es.upm.miw.webArchitecture.business.models.daos.Entity1Dao;
import es.upm.miw.webArchitecture.business.models.entities.Entity1;

public class Entity1DaoMemory extends GenericMemoryDao<Entity1, Integer> implements Entity1Dao {

    @Override
    protected Integer getId(Entity1 entity) {
        return null;
    }

}
