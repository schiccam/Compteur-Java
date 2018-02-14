package com.example.cdsm.compteur.Classes;

public class CompteurADSL
{
    Digit TabD[];
    int Valeur;
    int Limite;


    public CompteurADSL(int Val)
    {
        if(Val < 1 || Val > 9)
            TabD = new Digit[9];
        else
            TabD = new Digit[Val];

        Valeur = 0;
        Limite = 0;
    }

    public CompteurADSL(int ValDepart,int ValLimite)
    {
        Valeur = ValDepart;
        Limite = ValLimite;
        int TailleTab = String.valueOf(Limite).length();

        TabD = new Digit[TailleTab];

        for(int i = (TailleTab - 1);i > -1;i--)
        {
            TabD[i] = new Digit(Valeur%10);
            Valeur = Valeur/10;
        }

    }

    public void Initialiser(int ValDepart, int ValLimite)
    {
        Valeur = ValDepart;
        Limite = ValLimite;
        int TailleTab = TabD.length;


        for(int i = (TailleTab - 1);i > -1;i--)
        {
            TabD[i] = new Digit(Valeur%10);
            Valeur = Valeur/10;
        }
    }

    public void Afficher()
    {
        for (Digit ElemTab : TabD)
        {
            ElemTab.AfficherDigit();
        }
        System.out.println();
    }

    public void Incrementer()
    {
        //if(ControlCompteur() == false)
        //{
        int TailleTab = TabD.length;
        int i = TailleTab-2;
        Boolean Test = false;

        Test = TabD[TailleTab -1].Incrementer();
        if(Test == true)
        {
            while(Test == true)
            {
                Test = TabD[i].Incrementer();
                i--;
            }
        }

		/*}
		else
			System.out.println("Limite atteinte");	*/
    }

    public int Comparer()
    {
        StringBuilder strNum = new StringBuilder();

        for (Digit num : TabD)
        {
            strNum.append(num.getValeur());
        }

        int ValCpt = Integer.parseInt(strNum.toString());

        //System.out.println("Compteur = "+ValCpt+" Limite = "+Limite+" "+(Limite-ValCpt)+" de difference.");

        return ValCpt-Limite;
    }


	/*private Boolean ControlCompteur()
	{
		StringBuilder strNum = new StringBuilder();

		for (Digit num : TabD)
		{
		     strNum.append(num.getValeur());
		}

		int ValCpt = Integer.parseInt(strNum.toString());

		if(ValCpt == Limite)
			return true;
		else
			return false;
	}*/
}