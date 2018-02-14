package com.example.cdsm.compteur.Classes;

public class CompteurADAL
{
    Lampe UneLampe;
    CompteurADSL UnCptADSL;

    public CompteurADAL(int Debut,int Limite)
    {
        UneLampe = new Lampe();
        UnCptADSL = new CompteurADSL(Debut, Limite);

    }

    public void Incrementer()
    {
        UnCptADSL.Incrementer();
        if(UnCptADSL.Comparer() == 0)
        {
            UneLampe.AllumeLampe();
        }

    }

    public void Afficher()
    {
        UnCptADSL.Afficher();
        Boolean EtatLampe = UneLampe.DonneEtat();

        if(EtatLampe == true)
        {
            System.out.println("La lampe est allumé.");
        }
        else
            System.out.println("La lampe est éteinte.");
    }

    public Digit[] getCompteur()
    {
        return UnCptADSL.getTableauDigit();
    }
}