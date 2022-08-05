package mst;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {

	public static void main(String[] args) {
		EntityManagerFactory EMF=Persistence.createEntityManagerFactory("MPS");
		EntityManager EM=EMF.createEntityManager();
		EntityTransaction ET=EM.getTransaction();
		
		student s=EM.find(student.class,104);
		if(s!=null) {
			ET.begin();
			EM.remove(s);
			ET.commit();
		}else {
			System.out.println("Data not");
		}
	}

}
