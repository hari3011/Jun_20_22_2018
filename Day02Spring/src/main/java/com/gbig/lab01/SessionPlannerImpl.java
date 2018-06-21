package com.gbig.lab01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SessionPlannerImpl implements SessionPlanner {
	private List<String> topicsFor60Mins;
	private List<String> topicsFor50Mins;
	private List<String> topicsFor45Mins;
	private TopicsLoader topicsLoader;
	
	public void setTopicsLoader(TopicsLoader topicsLoader) {
		this.topicsLoader = topicsLoader;
		loadTopics(topicsLoader.getLines());
	}
	public SessionPlannerImpl() {
		topicsFor60Mins = new ArrayList<>();
		topicsFor50Mins = new ArrayList<>();
		topicsFor45Mins = new ArrayList<>();
	}
	
	public List<String> getTopicsFor60Mins() {
		return topicsFor60Mins;
	}


	public List<String> getTopicsFor50Mins() {
		return topicsFor50Mins;
	}


	public List<String> getTopicsFor45Mins() {
		return topicsFor45Mins;
	}


	private void loadTopics(Stream<String> lines) {
			lines.forEach(line -> {
				if(line.contains("60"))
					topicsFor60Mins.add(line.split("-")[0].trim());
				else if(line.contains("50"))
					topicsFor50Mins.add(line.split("-")[0].trim());
				else if(line.contains("45"))
					topicsFor45Mins.add(line.split("-")[0].trim());
			});
	}
}
