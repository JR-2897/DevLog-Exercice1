package com.ynov.biblio.model;

import java.awt.image.BufferedImage;

public class Images {
	
	public long Id;
	public BufferedImage data;
	
	public Images(long id, BufferedImage data) {
		super();
		Id = id;
		this.data = data;
	}

}
