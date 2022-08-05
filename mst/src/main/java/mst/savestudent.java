package mst;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class savestudent {

	public static void main(String[] args) {
		
		EntityManagerFactory EMF=Persistence.createEntityManagerFactory("MPS");
		EntityManager EM=EMF.createEntityManager();
		EntityTransaction ET=EM.getTransaction();
		student s=new student();
		
	//	s.setId(103);
		s.setName("ABD");
		s.setPercentage(99.00);
		s.setCreatetimedate(LocalDateTime.now());
		
		ET.begin();
		EM.persist(s);
		ET.commit();
	
	}

}
