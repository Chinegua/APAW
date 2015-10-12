package es.upm.miw.webArchitecture.business.controllers;

import es.upm.miw.webArchitecture.business.models.daos.DaoFactory;
import es.upm.miw.webArchitecture.business.views.TransferObject1;
import es.upm.miw.webArchitecture.business.views.TransferObject2;

public class BusinessController1 {

    public TransferObject1 m1() {
        DaoFactory.getFactory().getEntity1Dao().findAll();
        return new TransferObject1();
    }

    public void m2(TransferObject2 transferObject2) {
        DaoFactory.getFactory().getEntity2Dao().read(1);
    }

}
