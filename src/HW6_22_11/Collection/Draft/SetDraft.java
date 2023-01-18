package HW6_22_11.Collection.Draft;

import java.util.*;

public class SetDraft {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Mama");
        set.add("Mila");
        set.add("Ramu");

        //��������� ��������� ��� ���������
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext())        //��������, ���� �� ��� ��������
        {
            //��������� �������� �������� � ������� �� ���������
            String text = iterator.next();

            System.out.println(text);
        }
        System.out.println("");
        for (String text : set)
        {
            System.out.println(text);
        }
    }
}
