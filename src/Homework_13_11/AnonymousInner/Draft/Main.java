package Homework_13_11.AnonymousInner.Draft;

public class Main {

    public static void main(String[] args) {
        MonitoringSystem generalModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("ћониторинг общих показателей стартовал!");
            }
        };
        MonitoringSystem errorModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("ћониторинг отслеживани€ ошибок стартовал!");
            }
        };
        MonitoringSystem securityModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("ћониторинг безопасности стартовал!");
            }
        };
        generalModule.startMonitoring();
        errorModule.startMonitoring();
        securityModule.startMonitoring();
    }
}
