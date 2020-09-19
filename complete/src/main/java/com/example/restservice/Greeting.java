package com.example.restservice;

public class Greeting {

	private final long id;
	private final String content;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}

public static class Sessions {
    public static String GetSession(){
		return "{\r\n   \"program\":\"stay relevant stay on top\",\r\n   \"topic\":\"Azure DevOps\",\r\n   \"presenter\":\"Vishal Karki\",\r\n   \"Agenda\":{\r\n      \"Section1\":\"DevOps philosophy\",\r\n      \"Section2\":\"Tool walkaround\",\r\n      \"Section3\":\"Deploy a Restful app service\"\r\n   }\r\n}";
	}
}
