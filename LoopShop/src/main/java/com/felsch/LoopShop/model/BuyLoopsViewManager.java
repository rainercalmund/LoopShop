package com.felsch.LoopShop.model;

import java.util.LinkedList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.felsch.LoopShop.entities.Loop;

@ManagedBean(name = "buyLoopsViewManager")
@ViewScoped
public class BuyLoopsViewManager {

	private List<Loop> loops;

	public List<Loop> setUpLoops() {
		loops = new LinkedList<Loop>();

		// HIER DATABASE EINTRÄGE LADEN
		for (int i = 0; i < 5; i++) {
			Loop l = new Loop("Titel" + i, "Techno", 123 + i, "loop0" + i + ".jpg");
			l.setDescr(
					"Francis Ford Coppolas legendary continuation and sequel to his landmark 1972 film, The_Godfather, parallels the young Vito Corleones rise with his son Michaels spiritual fall, deepening The_Godfather's depiction of the dark side of the American dream. In the early 1900s, the child Vito flees his Sicilian village for America after the local Mafia kills his family. Vito struggles to make a living, legally or illegally, for his wife and growing brood in Little Italy, killing the local Black Hand Fanucci after he demands his customary cut of the tyro's business. With Fanucci gone, Vito's communal stature grows.");
			loops.add(l);
		}
		return loops;
	}

}
