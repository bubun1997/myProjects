package com.soumya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.soumya.config.MyConfig;
import com.soumya.entity.Device;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
    	
    	Device device = context.getBean(Device.class);
    	
//    	System.out.println(device.getDeviceName());
//    	System.out.println(device.getDevicePrice());

    	
    }
}
