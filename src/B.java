public class B {

    public String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName1) {
        name = newName1;
    }


    public static void main(String args[]){

        B n = new B();
        n.setName("Anupama");

        System.out.println(n.getName());
        //System.out.println(n.c);



    }
}
