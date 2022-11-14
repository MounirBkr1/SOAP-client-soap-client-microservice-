import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

/* pour generer un proxy coté client:
select folder "src" => Help => Find Action => generate java code from WSDL
=> enter url of webService "http://localhost:9191/BanqueWS?wsdl" =>service platform:
JaxWS=> it will generate a folder proxy
 */

public class ClientWS {
    public static void main(String[] args) {
        //creer un middlewear:permet de communiquer avec webService
        BanqueService stub = new BanqueWS().getBanqueServicePort();

        //appeler methode d'un web service
        System.out.println(stub.convert(7600));

        Compte cp=stub.getCompte(5);
        System.out.println(cp.getCode());
        System.out.println(cp.getCode());
    }
}
