import client.BanqueService;
import client.BanqueWS;

public class Main {
    public static void main(String[] args) {
        BanqueService banqueService=new BanqueWS().getBanqueServicePort();
        System.out.println(banqueService.convert(15555));
    }
}