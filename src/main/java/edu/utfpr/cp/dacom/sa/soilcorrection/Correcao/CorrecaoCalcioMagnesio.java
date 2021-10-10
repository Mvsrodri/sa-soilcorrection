package edu.utfpr.cp.dacom.sa.soilcorrection.Correcao;

import edu.utfpr.cp.dacom.sa.soilcorrection.Fonte_Nutriente.FonteCalcioMagnesio;

public class CorrecaoCalcioMagnesio
        implements ICorrecaoNutriente<FonteCalcioMagnesio> {

    public double calculaQuantidadeAplicar(
        double qtdeFonteAdicionar, 
        double prntPercent) {

        if (qtdeFonteAdicionar <= 0) {
            throw new IllegalArgumentException();
        }

        if (prntPercent <= 0) {
            throw new IllegalArgumentException();
        }

        return qtdeFonteAdicionar / prntPercent;
    }
}
