package com.Service;

import java.util.List;

import com.Dao.Criteria_dao;
import com.Entity.States;

public class Criteria_service {
	private Criteria_dao cc = new Criteria_dao();

	public List<States> highest_rank() {

		return cc.highest_rank();
	}

	public List<States> lowhest_rank() {

		return cc.lowhest_rank();

	}

	public List<States> rank_bet() {

		return cc.rank_bet();

	}

	public List<States> like() {

		return cc.like();
	}

	public List<States> equal() {

		return cc.equal();
	}

	public List<States> equal_not() {

		return cc.equal_not();
	}

	public List<States> id_equal() {

		return cc.id_equal();
	}

	public List<States> not_equal() {

		return cc.not_equal();
	}

	public List<States> less_equal() {

		return cc.less_equal();
	}
	
	public List<States> greater_equal() {
		
		return cc.greater_equal();
	}
	
	public List<States> in() {
		
		return cc.in();
	}
	
	public List<States> ilike() {
		
		return cc.ilike();
	}
	
	public List<States> and() {
		
		return cc.and();
	}
	
}
