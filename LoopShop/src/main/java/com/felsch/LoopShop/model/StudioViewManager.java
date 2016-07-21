package com.felsch.LoopShop.model;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "studioViewManager")
@ViewScoped
public class StudioViewManager {

	public String startApplication() {
		System.out.println("Starte App..");

		try {
			Runtime rt = Runtime.getRuntime();
			Process process = rt.exec("javaw -jar D:\\workspace\\SoundApp\\SoundApp.jar");
			return "OK";
		} catch (IOException e) { // TODO Auto-generated catch block
			e.printStackTrace();
			return "FAIL";
		}

	}

}
