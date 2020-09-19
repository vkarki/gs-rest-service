package com.example.restservice;

public class Session {

	private final String program;
    private final String topic;
    private final String content;

	public Session(String program, String topic, String content) {
		this.program = program;
        this.topic = topic;
		this.content = content;
	}

	public String getprogram() {
		return program;
	}

    public String getTopic() {
        return topic;
    }

	public String getContent() {
		return content;
	}
}
