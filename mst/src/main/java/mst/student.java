package mst;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Generated;


@Entity
public class student {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private double percentage;
	
	@CreationTimestamp
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public void setCreatetimedate(LocalDateTime now) {
		// TODO Auto-generated method stub
		
	}

}
