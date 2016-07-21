package com.felsch.LoopShop.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.felsch.LoopShop.model.StudioViewManager;

@ManagedBean
@ViewScoped
public class StudioViewController implements Serializable {

	private String app;

	@ManagedProperty(value = "#{studioViewManager}")
	private StudioViewManager studioViewManager;

	public String startApp() {
		System.out.println("Bin im Controller und gehen nun in den Manager");
		return studioViewManager.startApplication();
	}

	public void setStudioViewManager(StudioViewManager studioViewManager) {
		this.studioViewManager = studioViewManager;
	}

	public StudioViewManager getStudioViewManager() {
		return studioViewManager;
	}

}
