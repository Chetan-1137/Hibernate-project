package com.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.Configution.Configution;
import com.Entity.States;

public class Load {

	private SessionFactory Sf = Configution.load();

	public States load() {
		Session Sp = Sf.openSession();
		States Ss = Sp.load(States.class, 1);

		return Ss;

	}

	public States get() {
		Session sg = Sf.openSession();
		States st = sg.get(States.class, 2);

		return st;

	}

	public boolean save(int id, String dist, String taluka, String rank) {
		Session Sh = Sf.openSession();
		Transaction tr = Sh.beginTransaction();
		States Ss = new States();
		Ss.setId(id);
		Ss.setDist(dist);
		Ss.setTaluka(taluka);
		Ss.setRank(rank);
		Sh.save(Ss);
		tr.commit();

		return true;

	}

	public boolean update(int id, String dist, String taluka, String rank) {
		Session So = Sf.openSession();
		Transaction tr = So.beginTransaction();
		States Su = new States();
		Su.setId(id);
		Su.setDist(dist);
		Su.setTaluka(taluka);
		Su.setRank(rank);
		So.update(Su);
		tr.commit();

		return true;

	}

	public boolean delete(int id) {
		Session so = Sf.openSession();
		Transaction tr = so.beginTransaction();
		States sd = new States();
		sd.setId(id);
		so.delete(sd);
		tr.commit();
		return true;

	}

	public boolean merge(int id, String dist, String taluka, String rank) {
		Session so = Sf.openSession();
		Transaction tr = so.beginTransaction();
		States sm = new States();
		sm.setId(id);
		sm.setDist(dist);
		sm.setTaluka(taluka);
		sm.setRank(rank);
		so.merge(sm);
		tr.commit();

		return true;

	}

	public boolean persist(int id, String dist, String taluka, String rank) {
		Session so = Sf.openSession();
		Transaction tr = so.beginTransaction();
		States sp = new States();
		sp.setId(id);
		sp.setDist(dist);
		sp.setTaluka(taluka);
		sp.setRank(rank);
		so.persist(sp);
		tr.commit();

		return true;

	}

}