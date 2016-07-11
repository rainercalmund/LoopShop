package com.felsch.LoopShop.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.felsch.LoopShop.entities.Loop;
import com.felsch.LoopShop.model.BuyLoopsViewManager;
import com.felsch.LoopShop.model.NewsViewManager;

@ManagedBean
@ViewScoped
public class BuyLoopsViewController implements Serializable {

	@ManagedProperty(value = "#{buyLoopsViewManager}")
	private BuyLoopsViewManager buyLoopsViewManager;

	private List<Loop> loops;

	@PostConstruct
	public void init() {
		loops = buyLoopsViewManager.setUpLoops();
	}

	public void setBuyLoopsViewManager(BuyLoopsViewManager buyLoopsViewManager) {
		this.buyLoopsViewManager = buyLoopsViewManager;
	}

	public BuyLoopsViewManager getBuyLoopsViewManager() {
		return buyLoopsViewManager;
	}

	public List<Loop> getLoops() { 
		return loops;
	}

	public void setLoops(List<Loop> loops) {
		this.loops = loops;
	}

}
