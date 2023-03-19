package zooAnimales;

import gestion.Zona;
import java.util.ArrayList;

class Pez extends Animal{
    private static Pez[] listado;
    private static ArrayList<Pez> listado2;
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;
    
    public Pez(String nombre, int edad, String habitat, String genero, Zona zona){
        this.setNombre(nombre);
        this.setHabitat(habitat);
        this.setEdad(edad);
        this.setZona(zona);
        this.setGenero(genero);
        this.colorEscamas = null;
        this.cantidadAletas = 0;
        listado2.add(this);
        listado = listado2.toArray(new Pez[listado2.size()]);
    }
    
    public Pez(){
        this.setNombre(null);
        this.setHabitat(null);
        this.setEdad(0);
        this.setZona(null);
        this.setGenero(null);
        this.colorEscamas = null;
        this.cantidadAletas = 0;
        listado2.add(this);
        listado = listado2.toArray(new Pez[listado2.size()]);
    }
    
    public static int cantidadPeces(){
        return Pez.listado.length;
    }
    
    public String movimiento(){
        return "nadar";
    }
    
    public static Pez crearSalmon(String nombre, int edad, String habitat, String genero, Zona zona){
        Pez salmon = new Pez(nombre, edad, habitat, genero, zona);
        salmon.setColorEscamas("rojo");
        salmon.setCantidadAletas(6);
        salmon.setHabitat("oceano");
        Pez.salmones++;
        return salmon;
    }
    
    public static Pez crearBacalao(String nombre, int edad, String habitat, String genero, Zona zona){
        Pez salmon = new Pez(nombre, edad, habitat, genero, zona);
        salmon.setColorEscamas("gris");
        salmon.setCantidadAletas(6);
        salmon.setHabitat("oceano");
        Pez.bacalaos++;
        return salmon;
    }

    public static Pez[] getListado() {
        return listado;
    }
    public static void setListado(Pez[] listado) {
        Pez.listado = listado;
    }
    public static ArrayList<Pez> getListado2() {
        return listado2;
    }
    public static void setListado2(ArrayList<Pez> listado2) {
        Pez.listado2 = listado2;
    }
    public String getColorEscamas() {
        return colorEscamas;
    }
    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }
    public int getCantidadAletas() {
        return cantidadAletas;
    }
    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }
}
