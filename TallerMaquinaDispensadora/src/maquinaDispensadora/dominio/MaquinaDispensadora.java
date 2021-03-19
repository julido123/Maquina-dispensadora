package maquinaDispensadora.dominio;


import java.util.Arrays;
import java.util.List;

public class MaquinaDispensadora {

    private String marca;
    private String color;
    private int cantidadProducto;
    private int capacidadDeMecado;
    private  List<String>mecatos= Arrays.asList("cheestres","cheetos","detodito","nucita","chocorramo","choclitos",
            "manimoto","quipitos","alpinete","chocolatina");


    public MaquinaDispensadora(String marca, String color, int cantidadProducto, int capacidadDeMecado) {
        this.marca = marca;
        this.color = color;
        this.cantidadProducto = cantidadProducto;
        this.capacidadDeMecado = capacidadDeMecado;

    }



    public boolean verProductos(){
        for (String producto :mecatos) {
            System.out.println(producto);
        }
        return true;
    }
    public String sacarProducto(String nombreProducto){
        int a=0,b=8,c=8,d=8,e=8,f=8,g=8,h=8,i=8,j=8,k,l,n;
        for (String producto :mecatos) {
            if (producto.equals(nombreProducto)){
                if (producto.equals("cheestres") ){
                    if (a>0){
                        a-=1;
                        k=a;

                    }else {
                        return "No hay unidades de este producto";

                    }
                }
                if (producto.equals("cheetos")){
                    if (b>0){
                        b-=1;


                    }else {
                        return "No hay unidades de este producto";
                    }
                }
                if (producto.equals("detodito")){
                    if (c>0){
                        c-=1;

                    }else {
                        return "No hay unidades de este producto";
                    }
                }
                if (producto.equals("nucita")){
                    if (d>0){
                        d-=1;

                    }else {
                        return "No hay unidades de este producto";
                    }
                }
                if (producto.equals("chocorramo")){
                    if (e>0){
                        e-=1;

                    }else {
                        return "No hay unidades de este producto";
                    }
                }
                if (producto.equals("choclitos")){
                    if (f>0){
                        f-=1;

                    }else {
                        return "No hay unidades de este producto";
                    }
                }
                if (producto.equals("manimoto")){
                    if (g>0){
                        g-=1;

                    }else {
                        return "No hay unidades de este producto";
                    }
                }
                if (producto.equals("quipitos")){
                    if (h>0){
                        h-=1;

                    }else {
                        return "No hay unidades de este producto";
                    }
                }
                if (producto.equals("alpinete")){
                    if (i>0){
                        i-=1;

                    }else {
                        return "No hay unidades de este producto";
                    }
                }
                if (producto.equals("chocolatina")){
                    if (j>0){
                        j-=1;

                    }else {
                        return "No hay unidades de este producto";
                    }
                }

            }
        }
        return "";
    }


    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public List getMecato() {
        return mecatos;
    }


}
