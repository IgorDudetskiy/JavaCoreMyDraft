package Homework_17_11.StringDraft;

public class Solution {
    public static void main(String[] args) {
        String str = "Я сегодня пойду в школу";
        String str2 = " hi";
        StringBuilder builder = new StringBuilder(str);
        System.out.println(builder.append(str2));
        System.out.println(builder.insert(9,str2));
        System.out.println(builder.replace(1,9,str2));
        System.out.println(builder.deleteCharAt(2));
        System.out.println(builder.delete(14,20));
        System.out.println(builder.indexOf("пойду"));
        System.out.println(builder.lastIndexOf("пойду"));
//нет второго слова "пойду" выводит индекс первого

        System.out.println(builder.substring(7,12));
        System.out.println(builder.reverse());
// реверс посимвольно !!!

        builder.setCharAt(3, '?');
// метод не получается записать в sout !!!

        System.out.println(builder);
        String str3 = builder.toString();

        /*Я сегодня пойду в школу hi
        Я сегодня hi пойду в школу hi
        Я hi hi пойду в школу hi
        Я i hi пойду в школу hi
        Я i hi пойду в hi
        7
        7
        пойду
        ih в удйоп ih i Я
        ih ? удйоп ih i Я*/
    }
}
