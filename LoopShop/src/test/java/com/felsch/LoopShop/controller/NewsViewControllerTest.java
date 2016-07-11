package com.felsch.LoopShop.controller;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import com.felsch.LoopShop.entities.NewsBlog;
import com.felsch.LoopShop.model.NewsViewManager;

import junit.framework.TestCase;

public class NewsViewControllerTest extends TestCase {

	private NewsViewController newsViewController;
	private NewsViewManager newsViewManager;
	private LinkedList<NewsBlog> newsBlogs;
	static final String TEST = "test";

	protected void setUp() throws Exception {
		newsViewController = new NewsViewController();
		newsViewManager = Mockito.mock(NewsViewManager.class);
		newsViewController.setNewsViewManager(newsViewManager);

		newsBlogs = new LinkedList<NewsBlog>();
		for (int i = 0; i < 5; i++) {
			NewsBlog nb = new NewsBlog();
			newsBlogs.add(nb);
		}
		
		Mockito.when(newsViewManager.setUpNewsBlogs()).then(new Answer<List<NewsBlog>>() {

			@Override
			public List<NewsBlog> answer(InvocationOnMock invocation) throws Throwable {
				newsViewController.setNewsBlogs(newsBlogs);
				return newsBlogs;
			}
			
		});
	}

	protected void tearDown() throws Exception {
		newsViewController = null;
	}

	@Test
	public void testInitSuccessfull() {
		newsViewManager.setUpNewsBlogs();
		
		assertEquals(newsViewManager, newsViewController.getNewsViewManager());
		assertEquals(newsBlogs, newsViewController.getNewsBlogs());
	}

}
