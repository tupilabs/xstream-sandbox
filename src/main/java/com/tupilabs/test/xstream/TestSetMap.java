package com.tupilabs.test.xstream;

import org.tap4j.model.TestSet;

public class TestSetMap {

    private String fileName;
    private TestSet testSet;

    public TestSetMap() {
        super();
    }

    public TestSetMap(String fileName, TestSet testSet) {
        super();
        this.fileName = fileName;
        this.testSet = testSet;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public TestSet getTestSet() {
        return testSet;
    }

    public void setTestSet(TestSet testSet) {
        this.testSet = testSet;
    }

    @Override
    public String toString() {
        return "TestSetMap [fileName=" + fileName + ", testSet=" + testSet + "]";
    }

}
