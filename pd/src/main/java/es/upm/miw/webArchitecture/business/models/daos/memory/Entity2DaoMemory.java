package es.upm.miw.webArchitecture.business.models.daos.memory;

import es.upm.miw.webArchitecture.business.models.daos.Entity2Dao;
import es.upm.miw.webArchitecture.business.models.entities.Entity2;

public class Entity2DaoMemory extends GenericMemoryDao<Entity2, Integer> implements Entity2Dao {

    @Override
    protected Integer getId(Entity2 entity) {
        return null;
    }

}
