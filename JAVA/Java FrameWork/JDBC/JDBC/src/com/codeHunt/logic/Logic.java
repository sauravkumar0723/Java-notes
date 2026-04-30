package com.codeHunt.logic;

import java.util.Scanner;





public class Logic {
	

	private final int INSERT_DATA=1;
	private final int READ_DATA=2;
	private final int UPDATE_DATA=3;
	private final int DELETE_DATA=4;
	private final int EXIT_DATA=5;
	private static final int MAX_ATTEMPTS=3;

	private Crud crud;
	
	
	
	public Logic()
	{
		crud=new Crud();
	}
	
	public void doStart() {
		Scanner scanner = new Scanner(System.in);
		Crud crud = 
		int attempt=0;
		while(true) {
			System.out.println("\n======MENU=====-");
			System.out.println("Press-1 : INSERT DATA");
			System.out.println("Press-2 : READ DATA");
			System.out.println("Press-3 : UPDATE DATA");
			System.out.println("Press-4 : DELETE DATA");
			
		}
	}
	
	switch(choice) {
	System.out.println("INSERT DATA");
	// seperate Class
	crud.inser();
	break;
	case READ_DATA:
		System.out.println("READ DATA");
		break;
	case UPPPDATE_DATA:
		System.out.println("UPDATE DATA");
		break;
	case DELETE_data:
		System.out.println("DELETE DATA");
		break;
	case EXIT:
		
	}
}
