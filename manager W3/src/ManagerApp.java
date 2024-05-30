public class ManagerApp {

    public static void main(String[] args) {
        Manager manager = new Manager("Nakyn", "Google");
        manager.sayHello("user1");
        
        VicePresident vp = new VicePresident("Dzaka", "Google", "Alto Paolo");
        vp.sayHello("user1");
        System.out.println(vp.house);
    }
    
}
 