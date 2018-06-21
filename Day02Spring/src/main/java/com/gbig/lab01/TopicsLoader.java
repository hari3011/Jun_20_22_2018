package com.gbig.lab01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TopicsLoader {
	private String file;
	public TopicsLoader(String file) {
		this.file = file;
	}
	public Stream<String> getLines() {
		Path path = Paths.get(file);
		Stream<String> lines = null;
		try {
			lines = Files.lines(path);
		} catch (IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		return lines;
	}
}

