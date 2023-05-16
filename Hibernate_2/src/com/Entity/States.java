package com.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class States {
	
	private int id;
	private String dist;
	private String taluka;
	private String rank;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getTaluka() {
		return taluka;
	}
	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "States [id=" + id + ", dist=" + dist + ", taluka=" + taluka + ", rank=" + rank + "]";
	}
	
	

}
