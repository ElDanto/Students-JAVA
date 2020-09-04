import java.util.Scanner;

class GalToLit {
    public static void main(String[] args) {
        double volume;
        Scanner in = new Scanner(System.in);
        System.out.print("Из чего вы хотите переводить(l/g) :");
        String lg = in.nextLine();
        
        if(lg.equals("l")){
            System.out.print("Ваш объем в литрах :");
            volume = in.nextDouble() / 3.7854;
            System.out.println("Ваш обЪем в галлонах : " + volume);
        }else if(lg.equals("g")){
            System.out.print("Ваш объем в галлонах :");
            volume = in.nextDouble() * 3.7854;
            System.out.println("Ваш обЪем в литрах : " + volume);
        }else{
            System.out.println("Величина не распознана");
        }
        in.close();
    }
}