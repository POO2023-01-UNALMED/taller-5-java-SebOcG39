package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Anfibio extends Animal{
    private static Anfibio[] listado;
    private static ArrayList<Anfibio> listado2;
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;
    
    public Anfibio(String nombre, int edad, String habitat, String genero, String color, boolean veneno){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setHabitat(habitat);
        this.setGenero(genero);
        this.setZona(null);
        this.colorPiel = color;
        this.venenoso = veneno;
        Animal.animalCreado(this);
        listado2.add(this);
        listado = listado2.toArray(new Anfibio[listado2.size()]);
    }
    
    public Anfibio(String nombre, int edad, String genero){
        this(nombre, edad, null, genero, null, false);
    }
    public Anfibio(String nombre, int edad, String habitat, String genero){
        this(nombre, edad, habitat, genero, null,false);
    }
    
    public Anfibio(){
        this(null, 0 ,null,null,null,false);
    }
    
    public String movimiento(){
        return "saltar";
    }
    
    public static int cantidadAnfibios(){
        return Anfibio.listado.length;
    }
    
    public static Anfibio crearRana(String nombre, int edad, String genero){
        Anfibio rana = new Anfibio(nombre, edad, genero);
        rana.setColorPiel("rojo");
        rana.setVenenoso(true);
        rana.setHabitat("selva");
        Anfibio.ranas++;
        return rana;
    }
    
    public static Anfibio crearSalamandra(String nombre, int edad, String genero){
        Anfibio salamandra = new Anfibio(nombre, edad, genero);
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