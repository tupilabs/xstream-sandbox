package com.tupilabs.test.xstream;

import java.io.FileInputStream;

import org.tap4j.representer.Tap13Representer;

import com.thoughtworks.xstream.XStream;

public class LoadTapResult {

    public static void main(String[] args) throws Exception {
        Tap13Representer out = new Tap13Representer();
        
        XStream xstream = new XStream();
        TestSetMap data = (TestSetMap) xstream.fromXML(new FileInputStream(LoadTapResult.class.getResource("/tapResult.xml").getFile()));
        System.out.println("File: " + data.getFileName());
        System.out.println(out.representData(data.getTestSet()));
        
        data = (TestSetMap) xstream.fromXML(new FileInputStream(LoadTapResult.class.getResource("/tapResult2.xml").getFile()));
        System.out.println("File: " + data.getFileName());
        System.out.println(out.representData(data.getTestSet()));
    }
    
}
