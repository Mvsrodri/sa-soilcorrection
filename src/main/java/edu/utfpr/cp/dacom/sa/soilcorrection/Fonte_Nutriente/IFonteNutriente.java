package edu.utfpr.cp.dacom.sa.soilcorrection.Fonte_Nutriente;

import java.util.Set;

public interface IFonteNutriente {
    
    public double getTeorFonte();
    public Set<NutrienteAdicional> getNutrientesAdicionais();
}
