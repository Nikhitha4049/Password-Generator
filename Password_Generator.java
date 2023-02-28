import java.util.Random;
  //Used for generating random passwords
public class Password_Generator{
    public static void main(String[] args){
        System.out.println(Password(8));
    }
    private static char[] Password(int length){
         //Adding the respected details
        String Capitals="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Lowers="abcdefghijklmnopqrstuvwxyz";
        String SpecialCharacter="!@#$";
        String Numbers="1234567890";
        //Combining the variables to generate password
        String Combined=Capitals+Lowers+SpecialCharacter+Numbers;
        //Random variable for generating randomly
        Random random=new Random();
        char[] password=new char[length];
        //randomly generating the details without specifying the length
        password[0]=Lowers.charAt(random.nextInt(Lowers.length()));
        password[1]=Capitals.charAt(random.nextInt(Capitals.length()));
        password[2]=Numbers.charAt(random.nextInt(Numbers.length()));
        password[3]=SpecialCharacter.charAt(random.nextInt(SpecialCharacter.length()));
        //for loop to generate the password og minimum length 4
        for(int i=4;i<length;i++){
            password[i]=Combined.charAt(random.nextInt(Combined.length()));
        }
        return password;
    }
}