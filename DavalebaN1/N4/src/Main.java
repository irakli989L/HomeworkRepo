public class Main {
    public static void main(String[] args) {
        int x = 4;
        int y = -2;

        if(x>0 && y>0){
            System.out.println("I");
        } else if (x<0 && y>0) {
            System.out.println("II");
        } else if (x<0 && y<0) {
            System.out.println("III");
        } else{
            System.out.println("IV");
        }
    }
}