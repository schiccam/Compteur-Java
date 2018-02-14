package com.example.cdsm.compteur.Classes;

public class CompteurADAL
{
    Lampe UneLampe;
    CompteurADSL UnCptADSL;

    public CompteurADAL(int x,int y)
    {
        UneLampe = new Lampe();
        UnCptADSL = new CompteurADSL(x, y);

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
}