package com.ynov.biblio.model;

public class Books {
	
	private long Id;
	private long AuthorId;
	private String Title;
	
	public Books(long id, long authorId, String title) {
		super();
		Id = id;
		AuthorId = authorId;
		Title = title;
	}

}
