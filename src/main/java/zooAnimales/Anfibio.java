package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

class Anfibio extends Animal{
    private static Anfibio[] listado;
    private static ArrayList<Anfibio> listado2;
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;
    
    public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona){
        this.setNombre(nombre);
        this.setHabitat(habitat);
        this.setEdad(edad);
        this.setZona(zona);
        this.setGenero(genero);
        this.colorPiel = null;
        this.venenoso = false;
        listado2.add(this);
        listado = listado2.toArray(new Anfibio[listado2.size()]);
    }
    
    public Anfibio(){
        this.setNombre(null);
        this.setHabitat(null);
        this.setEdad(0);
        this.setZona(null);
        this.setGenero(null);
        this.colorPiel = null;
        this.venenoso = false;
        listado2.add(this);
        listado = listado2.toArray(new Anfibio[listado2.size()]);
    }
    
    public String movimiento(){
        return "saltar";
    }
    
    public static int cantidadAnfibios(){
        return Anfibio.listado.length;
    }
    
    public Anfibio crearRana(String nombre, int edad, String habitat, String genero, Zona zona){
        Anfibio rana = new Anfibio(nombre, edad, habitat, genero, zona);
        rana.setColorPiel("rojo");
        rana.setVenenoso(true);
        rana.setHabitat("selva");
        Anfibio.ranas++;
        return rana;
    }
    
    public Anfibio crearSalamandra(String nombre, int edad, String habitat, String genero, Zona zona){
        Anfibio salamandra = new Anfibio(nombre, edad, habitat, genero, zona);
        salamandra.setColorPiel("negro y amarillo");
        salamandra.setVenenoso(false);
        salamandra.setHabitat("selva");
        Anfibio.salamandras++;
        return salamandra;
    }

    public static Anfibio[] getListado() {
        return listado;
    }
    public static void setListado(Anfibio[] listado) {
        Anfibio.listado = listado;
    }
    public static ArrayList<Anfibio> getListado2() {
        return listado2;
    }
    public static void setListado2(ArrayList<Anfibio> listado2) {
        Anfibio.listado2 = listado2;
    }
    public String getColorPiel() {
        return colorPiel;
    }
    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }
    public boolean isVenenoso() {
        return venenoso;
    }
    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    } 
}