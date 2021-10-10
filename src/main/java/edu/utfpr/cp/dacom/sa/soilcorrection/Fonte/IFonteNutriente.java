package edu.utfpr.cp.dacom.sa.soilcorrection.Fonte;

import edu.utfpr.cp.dacom.sa.soilcorrection.Nutriente.NutrienteAdicional;

import java.util.Set;

public interface IFonteNutriente {
    
    public double getTeorFonte();
    public Set<NutrienteAdicional> getNutrientesAdicionais();
}
