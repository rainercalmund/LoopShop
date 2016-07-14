package com.felsch.LoopShop.controller;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import javafx.stage.Stage;

@ManagedBean
@ViewScoped
public class StudioViewController implements Serializable {

	public void startApp() {
		System.out.println("Starte App..");

		try {
			Runtime rt = Runtime.getRuntime();
			Process process = rt.exec("java -jar D:\\workspace\\SoundApp\\SoundApp.jar");
		} catch (IOException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
