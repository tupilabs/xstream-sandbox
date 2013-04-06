package com.tupilabs.test.xstream;

import java.io.Serializable;

import com.thoughtworks.xstream.XStream;

public class A implements Serializable {

	/*
	 * Change for XStream conversion tests. 
	 */
	private static final long serialVersionUID = 2L;
	
	public static void main(String[] args) {
		XStream xstream = new XStream();
		String xml = "<com.tupilabs.test.xstream.A/>";
		System.out.println((A) xstream.fromXML(xml));
	}
	
	public static void main1(String[] args) {
		XStream xstream = new XStream();
		String xml = xstream.toXML(new A());
		System.out.println(xml);
	}
	
	@Override
	public String toString() {
		return "A";
	}

}
