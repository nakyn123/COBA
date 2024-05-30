public class ManagerApp {

    public static void main(String[] args) {
        
        Manager manager = new Manager("nakyn", "Google");
        manager.name = "nakyn";
        manager.company = "Google";
        manager.sayHello("user");
        System.out.println("salary "+manager.getSalary());
        
        VicePresident vp = new VicePresident("dzaka", "Google");
        vp.sayHello("user");
        vp.sayParentHello("user");
        System.out.println("salary "+vp.getSalary());
        System.out.println("parent salary "+vp.getParentSalary());
    }
    
}
 