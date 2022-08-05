package mst;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class update {

	public static void main(String[] args) {
		EntityManagerFactory EMF=Persistence.createEntityManagerFactory("MPS");
		EntityManager EM=EMF.createEntityManager();
		EntityTransaction ET=EM.getTransaction();
		
		student s=new student();
		
		s.setId(101);
		s.setName("M.P.S");
		s.setPercentage(70);
		
		ET.begin();
		EM.merge(s);
		ET.commit();
	}

}
