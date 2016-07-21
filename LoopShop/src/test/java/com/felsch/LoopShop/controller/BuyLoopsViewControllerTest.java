package com.felsch.LoopShop.controller;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.felsch.LoopShop.entities.Loop;
import com.felsch.LoopShop.model.BuyLoopsViewManager;

public class BuyLoopsViewControllerTest {

	BuyLoopsViewController buyLoopsViewController;
	private BuyLoopsViewManager buyLoopsViewManager;

	@Before
	public void setUp() throws Exception {
		buyLoopsViewController = new BuyLoopsViewController();
		buyLoopsViewManager = Mockito.mock(BuyLoopsViewManager.class);

		buyLoopsViewController.setBuyLoopsViewManager(buyLoopsViewManager);
	}

	@After
	public void tearDown() throws Exception {
		buyLoopsViewController = null;
	}

	@Test
	public void testInit() {
		List<Loop> loops = new LinkedList<Loop>();
		loops.add(new Loop());
		Mockito.when(buyLoopsViewManager.setUpLoops()).thenReturn(loops);

		buyLoopsViewController.init();
		assertEquals(1, buyLoopsViewController.getLoops().size());
		assertNotNull(buyLoopsViewController.getLoops());

	}

}
