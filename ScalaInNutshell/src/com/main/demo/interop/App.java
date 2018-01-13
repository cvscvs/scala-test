package com.main.demo.interop;

import static scala.collection.JavaConversions.asJavaCollection;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
	public List<Author> loadAuthorsFromFile(File file) {
		return new ArrayList<Author>(asJavaCollection(Author.loadAuthorsFromFile(file)));
	}

	@SuppressWarnings("unchecked")
	public void sortAuthors(List<Author> authors) {
		Collections.sort(authors);
	}

	public void displaySortedAuthors(File file) {
		List<Author> authors = loadAuthorsFromFile(file);
		sortAuthors(authors);
		for (Author author : authors) {
			System.out.println(author.lastName() + ", " + author.firstName());
		}
	}
}
