package com.example.cdsm.compteur.Classes;

public class Lampe
{
    Boolean EtatLampe;

    public Lampe()
    {
        EtatLampe = false;
    }
    public void AllumeLampe()
    {
        EtatLampe = true;
    }
    public void EteintLampe()
    {
        EtatLampe = false;
    }
    public Boolean DonneEtat()
    {
        return EtatLampe;
    }

}