package com.Service;





import com.Dao.Load;
import com.Entity.States;

public class Load_service {
	private Load cc = new Load();
	
	public States load() {
	
		return cc.load();
	
	}

	public States get() {
		
		return cc.get();
	
	}

	public boolean Save(int id, String dist, String taluka, String rank) {
	
		return cc.save(id, dist, taluka, rank);
		

	}
	

	public boolean update(int id, String dist, String taluka, String rank) {
		
		return cc.update(id, dist, taluka, rank);
		
	}

	public boolean delete(int id) {
		
		return cc.delete(id);
		
	}

	public boolean merge(int id, String dist, String taluka, String rank) {
		
		  return cc.merge(id, dist, taluka, rank);
		
	}

	public boolean persist(int id, String dist, String taluka, String rank) {
		
		return cc.persist(id, dist, taluka, rank);
	}

	}
  