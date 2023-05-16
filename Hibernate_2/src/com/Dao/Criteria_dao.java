package com.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.Configution.Configution;
import com.Entity.States;

public class Criteria_dao {

	private SessionFactory Sf = Configution.load();

	public List<States> highest_rank() {
		Session sh = Sf.openSession();
		Criteria cr = sh.createCriteria(States.class);
		cr.add(Restrictions.lt("rank", "10"));
		List<States> hr = cr.list();

		return hr;

	}

	public List<States> lowhest_rank() {
		Session lr = Sf.openSession();
		Criteria cr = lr.createCriteria(States.class);
		cr.add(Restrictions.gt("rank", "10"));
		List<States> ls = cr.list();

		return ls;
	}

	public List<States> rank_bet() {
		Session lr = Sf.openSession();
		Criteria cr = lr.createCriteria(States.class);
		cr.add(Restrictions.between("rank", "1", "5"));
		List<States> rt = cr.list();

		return rt;

	}

	public List<States> like() {
		Session sl = Sf.openSession();
		Criteria cr = sl.createCriteria(States.class);
		cr.add(Restrictions.like("taluka", "chalisgaon"));
		List<States> ll = cr.list();

		return ll;
	}

	public List<States> equal() {
		Session sl = Sf.openSession();
		Criteria cr = sl.createCriteria(States.class);
		cr.add(Restrictions.eq("dist", "jalgaon"));
		List<States> ls = cr.list();

		return ls;
	}

	public List<States> equal_not() {
		Session sl = Sf.openSession();
		Criteria cr = sl.createCriteria(States.class);
		cr.add(Restrictions.eqOrIsNull("rank", "10"));
		List<States> en = cr.list();

		return en;

	}

	public List<States> id_equal() {
		Session sl = Sf.openSession();
		Criteria cr = sl.createCriteria(States.class);
		cr.add(Restrictions.idEq(6));
		List<States> ie = cr.list();

		return ie;

	}

	public List<States> not_equal() {
		Session sl = Sf.openSession();
		Criteria cr = sl.createCriteria(States.class);
		cr.add(Restrictions.ne("dist", "malegaon"));
		List<States> ne = cr.list();

		return ne;

	}

	public List<States> less_equal() {
		Session sl = Sf.openSession();
		Criteria cr = sl.createCriteria(States.class);
		cr.add(Restrictions.le("rank", "5"));
		List<States> le = cr.list();

		return le;
	}

	public List<States> greater_equal() {
		Session sl = Sf.openSession();
		Criteria cr = sl.createCriteria(States.class);
		cr.add(Restrictions.ge("dist", "jalgaon"));
		List<States> ge = cr.list();

		return ge;

	}

	public List<States> in() {
		Session sl = Sf.openSession();
		Criteria cr = sl.createCriteria(States.class);
		cr.add(Restrictions.in("rank", "3"));
		List<States> in = cr.list();

		return in;
	}

	public List<States> ilike() {
		Session sl = Sf.openSession();
		Criteria cr = sl.createCriteria(States.class);
		cr.add(Restrictions.ilike("taluka", "thane"));
		List<States> il = cr.list();

		return il;
	}

	public List<States> and() {
		Session sl = Sf.openSession();
		Criteria cr = sl.createCriteria(States.class);
		cr.add(Restrictions.and());
		List<States> and = cr.list();

		return and;

	}

}
