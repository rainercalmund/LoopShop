package com.felsch.LoopShop.model;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "newsViewManager")
@ViewScoped
public class NewsViewManager {

	private LinkedList<NewsBlog> newsBlogs;
	private final static String DUMMYDESCR = "Francis Ford Coppolas legendary continuation and sequel to his landmark 1972 film, The_Godfather, parallels the young Vito Corleones rise with his son Michaels spiritual fall, deepening The_Godfather's depiction of the dark side of the American dream. In the early 1900s, the child Vito flees his Sicilian village for America after the local Mafia kills his family. Vito struggles to make a living, legally or illegally, for his wife and growing brood in Little Italy, killing the local Black Hand Fanucci after he demands his customary cut of the tyro's business. With Fanucci gone, Vito's communal stature grows.";
	private static final String DUMMYTITLE = "News: This is a Testpage!";
	private static final String DUMMYIMAGE = ".jpg";

	public LinkedList<NewsBlog> setUpNewsBlogs() {
		newsBlogs = new LinkedList<NewsBlog>();
		// Hier müsste die Abfrage in die Datenbank kommen, wie viele Blogs und
		// welche BLogs schon da sind
		// Das folgende ist nur eine initiale TestBlogListe die (ohne DB)
		// erstell wird.
		for (int i = 0; i < 5; i++) {
			NewsBlog nb = new NewsBlog();
			nb.setTitle(DUMMYTITLE);
			nb.setDescr(DUMMYDESCR);
			nb.setGraphicImage(i+DUMMYIMAGE);
			newsBlogs.add(nb);
		}

		return newsBlogs;
	}

	public LinkedList<NewsBlog> getNewsBlogs() {
		if ((newsBlogs == null) || (newsBlogs.isEmpty() == true)) {
			newsBlogs = setUpNewsBlogs();
		}
		return newsBlogs;
	}

}
