package com.jarfile.OpenCSVBuilder;

import java.util.stream.Stream.Builder;

public class CSVBuilderFactory {
	
	public static <E> Builder<E> createCSVBuilder() {
		return new Builder<E>();
	}
	

}
