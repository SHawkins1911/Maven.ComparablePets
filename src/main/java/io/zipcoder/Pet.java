package io.zipcoder;

public abstract class Pet{
    private String name;
    private String type;

    public Pet(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak(){
        return "Animal noise";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
