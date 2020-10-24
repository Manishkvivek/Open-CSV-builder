package com.jarfile.OpenCSVBuilder;


import java.io.Reader;
import java.util.Iterator;
import java.util.List;

public interface ICSVBuilder<E> {
	
	public <E> Iterator<E> getCSVIterator(Reader reader, Class<E> csvClass) throws CSVException ;

	public <E> List<E> getCSVList(Reader reader, Class<E> csvClass) throws CSVException;

}
	


