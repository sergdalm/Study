package codewars;

public class PinCode {
    public static boolean validatePin(String pin) {
        int length = pin.length();
        if(length == 4 || length == 6  ? false : true)
            return false;

        try{
            for(int i = 0; i < length; i++)
                //if((Integer.valueOf(pin.charAt(i)) < 0))
                if((Integer.valueOf(pin.charAt(i))) < 0 || (Integer.valueOf(pin.charAt(i))) > 10){
                    System.out.println(pin.charAt(i));
                    System.out.println(Integer.valueOf(pin.charAt(i)));
                    return false;
                }

        }
        catch(Exception exc) {
            System.out.println("Exception!");
            return false;
        }

        return true;
    }
}
//|| (Integer.valueOf(pin.charAt(i)))) > 10)
