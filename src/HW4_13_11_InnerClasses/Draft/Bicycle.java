package HW4_13_11_InnerClasses.Draft;

public class Bicycle {
    private String model;
    private int weight;
    private int seatPostDiameter;
    public Bicycle(String model, int weight, int seatPostDiameter) {
        this.model = model;
        this.weight = weight;
        this.seatPostDiameter = seatPostDiameter;
    }
    public void start() {
        System.out.println("�������!");
    }
    public class HandleBar {
        public void right() {
            System.out.println("���� ������!");
        }
        public void left() {
            System.out.println("���� �����!");
        }
    }
    public class Seat {
        public void up() {
            System.out.println("������� ������� ����!");
        }
        public void down() {
            System.out.println("������� ������� ����!");
        }
        public void getSeatParam() {
            System.out.println("�������� �������: ������� ������������� ����� = " + Bicycle.this.seatPostDiameter);
        }
    }
}