package com.felsch.LoopShop.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.felsch.LoopShop.model.NewsBlog;
import com.felsch.LoopShop.model.NewsViewManager;

@ManagedBean
@ViewScoped
public class NewsViewController implements Serializable {

	@ManagedProperty(value = "#{newsViewManager}")
	private NewsViewManager newsViewManager;
	
	private LinkedList<NewsBlog> newsBlogs;

	@PostConstruct
	public void init() {
		newsBlogs = newsViewManager.setUpNewsBlogs();
	}

	public void setNewsViewManager(NewsViewManager newsViewManager) {
		this.newsViewManager = newsViewManager;
	}

	public NewsViewManager getNewsViewManager() {
		return newsViewManager;
	}

	public LinkedList<NewsBlog> getNewsBlogs() {
		return newsBlogs;
	}

	public void setNewsBlogs(LinkedList<NewsBlog> newsBlogs) {
		this.newsBlogs = newsBlogs;
	}
	
	public String getNewsTitle(int index) {
		return newsViewManager.getNewsBlogs().get(index).getTitle();
	}
	
	public String getNewsImage(int index) {
		return newsViewManager.getNewsBlogs().get(index).getImage();
	}
	
	public String getNewsDescription(int index) {
		return newsViewManager.getNewsBlogs().get(index).getDescr();
	}


}
