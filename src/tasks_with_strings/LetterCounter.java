package tasks_with_strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//считает сколько раз встречалась каждая буква из руского алфавита
public class LetterCounter {
    public static void main(String[] args) throws IOException {
        System.out.println("Please, enter ten lines in Russian: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }
        System.out.println(list);
        String text = "";
        for (int i = 0; i < list.size(); i++) {
            text += list.get(i);
        }

        for (int i = 0; i < alphabet.size(); i++){
            int count = 0;
            char[] array = text.toCharArray();
            for (int j = 0; j < text.length(); j++){
                if(alphabet.get(i).equals(array[j])){
                    count++;
                }
            }
            System.out.println(alphabet.get(i) + " " + count);
        }
    }
}

