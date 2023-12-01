package aoc.utils;

public class Utils {

    public static boolean isNumeric(String val){
        try{
            Integer.parseInt(val);
        }catch (NumberFormatException n){
            return false;
        }
        return true;
    }
}
