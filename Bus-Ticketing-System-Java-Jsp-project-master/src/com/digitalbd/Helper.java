package com.digitalbd;

import java.util.HashMap;

public class Helper {
	public static String baseUrl = "http://localhost:8080/Train_Ticket_System/";
	public static String TestName="T ruon";
	public static String Currency = "Rs";
	public static HashMap<String,String> TrainsCoach(){
		HashMap<String,String> coach = new HashMap<String,String>();
		coach.put("Ladies", "Ladies");
		coach.put("Old-Age", "Old-Age");
		coach.put("Gents", "Gents");
		return coach;
	}
}
