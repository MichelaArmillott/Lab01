package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
		ArrayList<String>parole=new ArrayList<String>();
		TreeMap<String,String>ordinate=new TreeMap<String,String>();
	public Parole() {
		//TODO
	}
	
	public void addParola(String p) {
		parole.add(p);
		ordinate.put(p, p);
		//TODO
	}
	
	public List<String> getElenco() {
		//TODO
		ArrayList<String>stampa=new ArrayList<String>(ordinate.values());
		return stampa;
	}
	
	public void reset() {
		parole.removeAll(parole);
		ordinate.clear();
		// TODO
	}

	public void cancellaParola(String parola) {
		parole.remove(parola);
		ordinate.remove(parola);
	}

	

}
