package HW4_13_11_InnerClasses.Lambda.WorkerInterface;

public class WorkerInterfaceTest {
    public static void execute(WorkerInterface worker) {
        worker.doSomeWork();
    }

    public static void main(String [] args) {

        // ����� ������ doSomeWork ����� ��������� �����
        // (������������ ������)
        execute(new WorkerInterface() {
            @Override
            public void doSomeWork() {
                System.out.println("Worker ������ ����� ��������� �����");
            }
        });

        // ����� ������ doSomeWork ����� Lambda-���������
        // (������������ Java 8)
        execute( () -> System.out.println("Worker ������ ����� Lambda") );
    }

}
