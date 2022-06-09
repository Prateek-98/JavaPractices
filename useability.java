// instantiate the class character which means that will be making different object with the "character"
// class
public class useability {


    public static void main(String[] args) {
        Character snooby = new Character("kutti","Dog",4);
        Character crow = new Character("crow","birds", 2);
        Character cow = new Character("cow","ruminant",4);

        snooby.type();
        snooby.fnctn();
        System.out.println(snooby);


    }

}
