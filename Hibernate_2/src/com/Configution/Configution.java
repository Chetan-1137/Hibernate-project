package com.Configution;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Entity.States;

public class Configution {
	
	public static  SessionFactory load() {
	Configuration Cf =new Configuration();
	Cf.configure();
	Cf.addAnnotatedClass(States.class);
    SessionFactory Sf= Cf.buildSessionFactory();
    return Sf;
}
}