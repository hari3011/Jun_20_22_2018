package com.gbig.lab01;

import java.util.List;

public interface SessionPlanner {
	List<String> getTopicsFor60Mins();
	List<String> getTopicsFor50Mins();
	List<String> getTopicsFor45Mins();
}
