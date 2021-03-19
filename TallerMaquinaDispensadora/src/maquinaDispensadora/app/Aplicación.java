package maquinaDispensadora.app;

import maquinaDispensadora.dominio.MaquinaDispensadora;

public class Aplicación {
    public static void main(String[] args) {

        MaquinaDispensadora maqui=new MaquinaDispensadora("autosnack","Negro",10, 8);

        System.out.println(maqui.verProductos());


        maqui.sacarProducto("cheestres");



    }
}


