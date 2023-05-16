package com.Controller;



import com.Entity.States;
import com.Service.Load_service;

public class Load_controller {
	void load() {
		Load_service cs = new Load_service();
		States sd = cs.load();
		System.out.println(sd);
	}

	void get() {
		Load_service sg = new Load_service();
		States sb = sg.get();
		System.out.println(sb);
	}

	void save(int id, String dist, String taluka, String rank) {
		Load_service Sv = new Load_service();
		boolean sh = Sv.Save(id, dist, taluka, rank);
		System.out.println(sh);
	}

	void update(int id, String dist, String taluka, String rank) {
		Load_service su = new Load_service();
		boolean tu = su.update(id, dist, taluka, rank);
		System.out.println(tu);
	}

	void delete(int id) {
		Load_service Sd = new Load_service();
		boolean bd = Sd.delete(id);
		System.out.println(bd);
	}

	void merge(int id, String dist, String taluka, String rank) {
		Load_service sm = new Load_service();
		boolean tu = sm.merge(id, dist, taluka, rank);
		System.out.println(tu);
	}

	void persist(int id, String dist, String taluka, String rank) {
		Load_service sp = new Load_service();
		boolean sl = sp.persist(id, dist, taluka, rank);
		System.out.println(sl);
	}
	
	
	
	
	public static void main(String[] args) {
		Load_controller s1 = new Load_controller();
	     s1.delete(11);

	}
}