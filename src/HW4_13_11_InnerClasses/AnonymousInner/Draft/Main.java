package HW4_13_11_InnerClasses.AnonymousInner.Draft;

public class Main {

    public static void main(String[] args) {
        MonitoringSystem generalModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("���������� ����� ����������� ���������!");
            }
        };
        MonitoringSystem errorModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("���������� ������������ ������ ���������!");
            }
        };
        MonitoringSystem securityModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("���������� ������������ ���������!");
            }
        };
        generalModule.startMonitoring();
        errorModule.startMonitoring();
        securityModule.startMonitoring();
    }
}
