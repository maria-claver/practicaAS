package com.practica.as.Adpters;

import java.util.Date;

public class AdaptadorAutoritza implements IAdaptadorAutoritza {

	public boolean pagament(String dni, String numT, float importTotal, Date dC, Date dAvui) {
		// TODO
		// ServiceReference bs = ServiceLocator.INSTANCE.find("BankService");
		// if (bs == null) activa ServeiNoDisponible;
		// boolean b = bs.autoritza(dni, numT, importTotal, dC, dAvui);
		// return b;
		return true;
	}
}
