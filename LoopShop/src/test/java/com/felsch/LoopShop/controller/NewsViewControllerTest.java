package com.felsch.LoopShop.controller;

import org.junit.Test;
import org.mockito.Mockito;

import com.felsch.LoopShop.model.NewsViewManager;

import junit.framework.TestCase;

public class NewsViewControllerTest extends TestCase {

	private NewsViewController newsViewController;
	private NewsViewManager newsViewManager;

	protected void setUp() throws Exception {
		newsViewController = new NewsViewController();
		newsViewManager = Mockito.mock(NewsViewManager.class);
		newsViewController.setNewsViewManager(newsViewManager);
	}

	protected void tearDown() throws Exception {
		newsViewController = null;
	}

	@Test
	private void testInit() {
		assertEquals(newsViewManager, newsViewController.getNewsViewManager());
	}
	
}
