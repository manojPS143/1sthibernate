package mst;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.boot.jaxb.mapping.spi.JaxbPrePersist;

public class Read {

	public static void main(String[] args) {
		EntityManagerFactory EMF=Persistence.createEntityManagerFactory("MPS");
		EntityManager EM=EMF.createEntityManager();
//		EntityTransaction ET=EM.getTransaction();
		student s=EM.find(student.class,101);
		
		if (s !=null) {
			System.out.println("SID "+s.getId());
			System.out.println("SName "+s.getName());
			System.out.println("SPercentage "+s.getPercentage());
		}
		else {
			System.out.println("Data not found");
		}
	}

}
