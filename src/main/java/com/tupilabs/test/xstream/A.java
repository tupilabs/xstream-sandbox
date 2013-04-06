package com.tupilabs.test.xstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

import com.thoughtworks.xstream.XStream;

public class A implements Serializable {

	/*
	 * Change for XStream conversion tests. 
	 */
	private static final long serialVersionUID = 3L;
	
	public static void main(String[] args) throws Exception {
        InputStream bis = new FileInputStream(new File("/tmp/test.s"));
        ObjectInputStream is = new ObjectInputStream(bis);
        A a = (A) is.readObject();
        is.close();
    }
	
	public static void main0(String[] args) throws Exception {
        A a = new A();
        OutputStream bos = new FileOutputStream(new File("/tmp/test.s"));
        ObjectOutputStream os = new ObjectOutputStream(bos);
        os.writeObject(a);
        os.flush();
        os.close();
        System.out.println(bos.toString());
    }
	
	public static void main2(String[] args) {
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
