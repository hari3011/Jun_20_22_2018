package com.gbig.lab01;

public class Conference {
	private SessionPlanner sessionPlanner;
	public void setSessionPlanner(SessionPlanner sessionPlanner) {
		this.sessionPlanner = sessionPlanner;
	}
	public String get60MinTopics() {
		StringBuilder stringBuilder = new StringBuilder();
		sessionPlanner.getTopicsFor60Mins().forEach(topic -> stringBuilder.append(topic).append("\n"));
		return stringBuilder.toString();
	}
	public String get50MinTopics() {
		StringBuilder stringBuilder = new StringBuilder();
		sessionPlanner.getTopicsFor50Mins().forEach(topic -> stringBuilder.append(topic).append("\n"));
		return stringBuilder.toString();
	}
	public String get45MinTopics() {
		StringBuilder stringBuilder = new StringBuilder();
		sessionPlanner.getTopicsFor45Mins().forEach(topic -> stringBuilder.append(topic).append("\n"));
		return stringBuilder.toString();
	}
}
