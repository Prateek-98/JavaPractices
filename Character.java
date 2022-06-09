public class Character {
    public String name;
    public String species;
    public Integer legged;

    public Character(String name, String species, Integer legged) {
        this.name = name;
        this.species = species;
        this.legged = legged;
    }



    //Methods for the functionality of all the characters
//    Animals functionality.
//    public static void main(String[] args) {

    void fnctn (){
        if (legged == 2 ) {
            System.out.println("Hey I am  " + name + " and I fly");
        }else {
            System.out.println("Hey I am " +name +". I run.");
        }
    }void type(){
        System.out.println("I am an Animal");
    }
    @Override
    public String toString(){
        return name + species+ legged;
    }



}