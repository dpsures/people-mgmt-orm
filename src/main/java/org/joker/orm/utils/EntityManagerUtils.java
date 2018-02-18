package org.joker.orm.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;;

public class EntityManagerUtils {

	private static final EntityManagerFactory emFactoryObj;
	private static final String PERSISTANCE_UNIT_NAME = "PeopleMgmt";
	
	static {
		emFactoryObj = Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME);
	}
	
	public static EntityManager getEntityManager(){
		return emFactoryObj.createEntityManager();
	}
}
