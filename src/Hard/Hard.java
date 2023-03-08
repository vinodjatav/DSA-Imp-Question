package Hard;

public class Hard {
    String myName="Vinod Jatav" ;
    public static String name;

    static {
        name = "static name";
        System.out.println("Inside static block.");
    }

    public void show(){
        System.out.println("Inside show "+ myName);
    }
    
    public static void show1(Hard obj){
        System.out.println("Inside show1 "+obj.myName +" "+ name);
    }

    public static void main(String args[]) throws ClassNotFoundException{
        StringBuffer sb = new StringBuffer("Vinod");
        sb.append(" Jatav");
        System.out.println("Hard problems: "+ sb.toString());

        Hard obj = new Hard();
        obj.show();

        Hard.show1(obj);


        // Class.forName("Hard");
    }
}
