package com.ynov.biblio.model;

import java.util.Date;

public class Comments {
	
	public long id;
	public String Myuser;
	public String Email;
	public String Webpage;
	public Date Datum;
	public String Summary;
	public String Comments;
	
	public Comments(long id, String myuser, String email, String webpage, Date datum, String summary, String comments) {
		super();
		this.id = id;
		Myuser = myuser;
		Email = email;
		Webpage = webpage;
		Datum = datum;
		Summary = summary;
		Comments = comments;
	}

}
