package com.AK.Main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.AK.SBeans.WishMessageGenerator;

public class DM_ViaSetterInjection_UsingXmlCfgs {

	public static void main(String[] args) {
		
		// create IOC Container
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/AK/Cfgs/applicationContext.xml");
		
		// get target spring bean class object reference
		Object obj = ctx.getBean("wmg");
		
		// type casting
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		
		// invoke the business method
		String result = generator.showWishMessage("ALOK");
		IO.println(result);
		
		// close the IOC Container
		ctx.close();
	}
}
