package tasks_with_strings;

  /*если сделав одно изменение можно сделать строки одинаковыми,
  то выводится true. Иначе - false*/
public class OneChange {
    public static void main(String[] args) {
        System.out.println(isOneEditAway("abcd", "abc"));
        System.out.println(isOneEditAway("abcd", "abd"));
        System.out.println(isOneEditAway("abcd", "abcd"));
        System.out.println(isOneEditAway("", ""));
        System.out.println(isOneEditAway("1561651", "asdasdd"));
        System.out.println(isOneEditAway("1561651", "1561651111"));
        System.out.println(isOneEditAway("1568", "1581"));
        System.out.println(isOneEditAway("156з8", "1568 "));
        System.out.println(isOneEditAway("1568щ", "1568 "));

    }

    public static boolean isOneEditAway(String first, String second){
        if (first.equals("") && second.equals("")) return true;

        //The length is the same
        if (first.length() == second.length()) {
            if (first.equals(second)) return true;

            int count = 0;
            for (int i = 0; i < first.length(); i++) {
                if (first.charAt(i) != second.charAt(i)){
                    count++;
                }
            }

            if (count == 1){
                return true;
            } else {
                return false;
            }
        }


        //The length is different
        int l = first.length() - second.length();
        if (l > 1 || l < -1)
            return false;

        if (first.length() - second.length() == 1) {
            return check(first, second);
        } else if (first.length() - second.length() == -1){
            return check(second, first);
        } else {
            return false;
        }
    }

    public static boolean check (String first, String second){
        int i = 0;
        int j = 0;

        while (j < second.length() && i < first.length()) {
            if (first.charAt(i) != second.charAt(j)) {
                if (i != j) {
                    return false;
                }
                i++;
            } else {
                i++;
                j++;
            }
        }
        return true;
    }
}
