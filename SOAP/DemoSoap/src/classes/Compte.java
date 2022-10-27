package classes;

import java.util.Date;


public class Compte {

    private Long code;
    private Double solde;
    private Date dateDeCreation;

    public Compte(Long code, Double solde, Date dateDeCreation) {
        this.code = code;
        this.solde = solde;
        this.dateDeCreation = dateDeCreation;
    }
    public Compte(){

    }
}
