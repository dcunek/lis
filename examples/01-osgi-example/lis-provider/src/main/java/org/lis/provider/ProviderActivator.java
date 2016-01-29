package org.lis.provider;

import org.lis.provider.impl.HelloWorldServiceImpl;
import org.lis.provider.services.HelloWorldService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class ProviderActivator implements BundleActivator  {
	private ServiceRegistration registration;

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        registration = bundleContext.registerService(
                HelloWorldService.class.getName(),
                new HelloWorldServiceImpl(),
                null);
        
        System.out.println("provider activated");
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        registration.unregister();
        System.out.println("provider stopped");
    }


}
