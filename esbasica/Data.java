package esbasica;

import java.io.Serializable;

public class Data implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int number;
	String name;
	char var;
	Data(){
		
		
	}
	Data(int a, String name, char c){
		this.number = a;
		this.name = name;
		this.var = c;
	}
	
}
