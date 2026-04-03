import java.util.Scanner;
public class IntegerToRoman{
    public static String IntToRoam(int num){
       int value[] = {1000, 900, 500, 400, 100, 50, 40, 10, 9, 5, 4, 1};
       String symbol[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
       String result = "";
       for( int i = 0; i<value.length; i++){
            while(num>value[i]){
                result += symbol[i];
                num-=value[i];
            }
       }
       return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente the number which you want to convert into Roman");
        int num = sc.nextInt();
        String Roam = IntToRoam(num);
        System.out.print(Roam);

    } 

}