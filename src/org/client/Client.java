package org.client;

import org.project.Project;

public class Client extends Project {  
	  public void clientName() {
		String p = "jayanth";
		System.out.println("clientName is"+" "+ p);
	}
	  public static void main(String[] args) {
		Client name = new Client();
		name.clientName();
		name.projectName();
		
	}
}
