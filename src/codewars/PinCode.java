package codewars;

public class PinCode {
    public static boolean validatePin(String pin) {
        int length = pin.length();
        if(length == 4 || length == 6  ? false : true)
            return false;

        try{
            for(int i = 0; i < length; i++){
                String s = pin.substring(i, i+1);
                if((Integer.valueOf(s)) < 0 || (Integer.valueOf(s)) > 10){
                    return false;
                }
            }
        }
        catch(Exception exc) {
            return false;
        }
        return true;
    }
}
//|| (Integer.valueOf(pin.charAt(i)))) > 10)
