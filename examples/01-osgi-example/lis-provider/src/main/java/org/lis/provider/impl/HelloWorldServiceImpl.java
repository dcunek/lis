package org.lis.provider.impl;

import org.lis.provider.services.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public void hello() {
		System.out.println("Hello world !!!");

	}

}
