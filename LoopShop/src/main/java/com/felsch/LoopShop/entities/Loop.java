package com.felsch.LoopShop.entities;

public class Loop {

	private String image;
	private String name;
	private int bpm;
	private String category;
	private String descr;

	public Loop() {

	}

	public Loop(String name, String category, int bpm, String image) {
		this.name = name;
		this.category = category;
		this.bpm = bpm;
		this.image = image;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBpm() {
		return bpm;
	}

	public void setBpm(int bpm) {
		this.bpm = bpm;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

}
