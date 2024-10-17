public class Main {
    public static void main(String[] args) {
        String operation = "/";

        double a = 4;
        double b = 2.5;

        if(operation=="+"){
            System.out.println(a+b);
        } else if(operation=="-"){
            System.out.println(a-b);
        } else if(operation=="*"){
            System.out.println(a*b);
        } else if(operation=="/"){
            System.out.println(a/b);
        }else{
            System.out.println("Error");
        }
    }
}