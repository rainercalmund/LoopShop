package com.felsch.LoopShop.controller;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.felsch.LoopShop.model.StudioViewManager;

@RunWith(Arquillian.class)
public class StudioViewControllerIT {

	@Deployment
	public static JavaArchive createDeployment() {
		return ShrinkWrap.create(JavaArchive.class).addClasses(StudioViewController.class, StudioViewManager.class)
				.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
	}

	@Inject
	StudioViewController studioViewController;

	@Inject
	StudioViewManager studioViewManager;

	@Test
	public void testStartApplicationWindow() {
		studioViewController.setStudioViewManager(studioViewManager);
		assertEquals("OK", studioViewController.startApp());
	}

}
