package com.Controller;

import java.util.List;

import com.Entity.States;
import com.Service.Criteria_service;

public class Criteria_controller {
	void highest_rank() {
		Criteria_service ls = new Criteria_service();
		List<States> hr = ls.highest_rank();

		System.out.println(hr);
	}

	void lowhest_rank() {
		Criteria_service ld = new Criteria_service();
		List<States> lr = ld.lowhest_rank();
		for (States rank : lr) {

			System.out.println(rank);
		}
	}

	void rank_bet() {
		Criteria_service lg = new Criteria_service();
		List<States> rt = lg.rank_bet();
		for (States rab : rt) {

			System.out.println(rab);

		}
	}

	void like() {
		Criteria_service ls = new Criteria_service();
		List<States> ll = ls.like();

		System.out.println(ll);
	}

	void equal() {
		Criteria_service lv = new Criteria_service();
		List<States> ls = lv.equal();

		System.out.println(ls);
	}

	void equal_not() {
		Criteria_service lu = new Criteria_service();
		List<States> en = lu.equal_not();

		System.out.println(en);
	}

	void id_equal() {
		Criteria_service lo = new Criteria_service();
		List<States> ie = lo.id_equal();

		System.out.println(ie);
	}

	void not_equal() {
		Criteria_service lp = new Criteria_service();
		List<States> ne = lp.not_equal();

		for (States neq : ne) {

			System.out.println(neq);
		}
	}

	void less_equal() {
		Criteria_service lq = new Criteria_service();
		List<States> le = lq.less_equal();

		for (States len : le) {

			System.out.println(len);

		}
	}

	void greater_equal() {
		Criteria_service lv = new Criteria_service();
		List<States> ge = lv.greater_equal();

		for (States gen : ge) {

			System.out.println(gen);

		}
	}

	void in() {
		Criteria_service lx = new Criteria_service();
		List<States> in = lx.in();

		System.out.println(in);
	}

	void ilike() {
		Criteria_service ly = new Criteria_service();
		List<States> il = ly.ilike();

		System.out.println(il);
	}

	void and() {
		Criteria_service lz = new Criteria_service();
		List<States> and = lz.and();
		
		System.out.println(and);
	}

	public static void main(String[] args) {
		Criteria_controller cc = new Criteria_controller();
		cc.ilike();
	}

}
