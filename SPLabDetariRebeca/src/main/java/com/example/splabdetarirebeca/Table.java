package com.example.splabdetarirebeca;

public class Table implements Element{
    private String title;
    public Table(String title){
        this.title = title;
    }
    @Override
    public void print()
    {
        System.out.print(title);
    }
    @Override
    public void add(Element e){}
    @Override
    public void remove(Element e){}
    @Override
    public Element get(int index){
        return null;
    }
}
