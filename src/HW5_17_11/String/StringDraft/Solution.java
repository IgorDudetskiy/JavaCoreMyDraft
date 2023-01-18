package HW5_17_11.String.StringDraft;

public class Solution {
    public static void main(String[] args) {
        String str = "� ������� ����� � �����";
        String str2 = " hi";
        StringBuilder builder = new StringBuilder(str);
        System.out.println(builder.append(str2));
        System.out.println(builder.insert(9,str2));
        System.out.println(builder.replace(1,9,str2));
        System.out.println(builder.deleteCharAt(2));
        System.out.println(builder.delete(14,20));
        System.out.println(builder.indexOf("�����"));
        System.out.println(builder.lastIndexOf("�����"));
//��� ������� ����� "�����" ������� ������ �������

        System.out.println(builder.substring(7,12));
        System.out.println(builder.reverse());
// ������ ����������� !!!

        builder.setCharAt(3, '?');
// ����� �� ���������� �������� � sout !!!

        System.out.println(builder);
        String str3 = builder.toString();

        /*� ������� ����� � ����� hi
        � ������� hi ����� � ����� hi
        � hi hi ����� � ����� hi
        � i hi ����� � ����� hi
        � i hi ����� � hi
        7
        7
        �����
        ih � ����� ih i �
        ih ? ����� ih i �*/
    }
}
