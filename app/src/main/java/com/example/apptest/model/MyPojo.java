package com.example.apptest.model;

public class MyPojo {


    private Results[] results;

    public Results[] getResults ()
    {
        return results;
    }

    public void setResults (Results[] results)
    {
        this.results = results;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [meta = "+", results = "+results+"]";
    }
}
