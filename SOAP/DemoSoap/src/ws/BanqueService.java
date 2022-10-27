package ws;

import classes.Compte;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import java.util.*;


@WebService(serviceName = "banqueWS")
public class BanqueService {
    @WebMethod(operationName = "convert")
    public double conversion(@WebParam(name="nt") double nt){
        return nt+12.3;
    }



    @WebMethod
    public Compte getCmpt(@WebParam (name="code") Long code) {
        return  new Compte(1L,20000.1,new Date());
    }

    @WebMethod
    public List<Compte> getListCompte(){
        return Arrays.asList(
                new Compte(1L,20000.1,new Date()),
                new Compte(2L,20004.1,new Date()),
                new Compte(4L,2077.1,new Date()),
                new Compte(5L,0.1,new Date())
        );
    }
}

