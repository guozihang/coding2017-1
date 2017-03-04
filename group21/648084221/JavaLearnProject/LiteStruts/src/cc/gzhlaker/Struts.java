package cc.gzhlaker;

import java.io.File;
import java.util.Map;

import org.dom4j.*;
import org.dom4j.io.*;

public class Struts  {
	
	SAXReader reader = new SAXReader();
	Document document = reader.read(new File("src/cc.gzhlaker/struts.xml"));
	
	Element root = document.getRootElement();
	Element node = root.element("action");
	Attribute attribute = node.attribute("class");
	
	String text = attribute.getText();
	
	public static View runAction(String actionName, Map<name,passward> parameters) throws ClassNotFoundException {
		
		View newView = new View();
		
		Class<?> class1 = Class.forName(actionName);
		class1 classObject = class1.newInstance();
		
		classObject.setName(parameters.get("name"));
		classObject.setPassword(parameters.get("passward"));
		
		String returnJsp  =classObject.execute();
		
		newView.setJsp(returnJsp);
		newView.setParameters(parameters);
		
		
		
		return null;
	}
	
	public static void mian(String[] args){
		runAction(text,);
	}
	
	
	
	
}
