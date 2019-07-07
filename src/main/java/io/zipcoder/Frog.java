package io.zipcoder;

public class Frog extends Pet {
    public Frog(String name){
        super(name);
        this.type = "Frog";
    }


    @Override
    public String speak(){
        return "Ribbit...Ribbit";
    }
}
