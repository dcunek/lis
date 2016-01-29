package org.lis.consumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.lis.provider.services.HelloWorldService;

public class HelloWorldActivator implements BundleActivator {
    private HelloWorldConsumer consumer;

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        ServiceReference reference = bundleContext.getServiceReference(HelloWorldService.class.getName());

        consumer = new HelloWorldConsumer((HelloWorldService) bundleContext.getService(reference));
        consumer.startTimer();
        
        System.out.println("consumer activated");
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        consumer.stopTimer();
        
        System.out.println("consumer stopped");
    }
}
