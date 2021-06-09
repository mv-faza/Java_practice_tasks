package Machine;

public class Machine implements Info {
    private int id=7;
    public static void start(){
        System.out.println("Machine started");
    }
    @override
    public void showInfo(){
        System.out.println("Machine id is:" + id);
    }
}

