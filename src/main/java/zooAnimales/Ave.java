package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Ave extends Animal{
    private static Ave[] listado;
    private static ArrayList<Ave> listado2;
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;
    
    public Ave(String nombre, int edad, String habitat, String genero, String color){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setHabitat(habitat);
        this.setGenero(genero);
        this.setZona(null);
        this.colorPlumas = color;
        Animal.animalCreado(this);
        listado2.add(this);
        listado = listado2.toArray(new Ave[listado2.size()]);
    }
    
    public Ave(String nombre, int edad, String genero){
        this(nombre, edad, null, genero);
    }
    
    public Ave(String nombre, int edad, String habitat, String genero){
        this(nombre, edad, habitat, genero, null);
    }
    
    public Ave(){
        this(null,0,null,null,null);
    }
    
    public static Ave crearHalcon(String nombre, int edad, String genero){
        Ave halcon = new Ave(nombre, edad, genero);
        halcon.setColorPlumas("cafe glorioso");
        halcon.setHabitat("montanas");
        Ave.halcones++;
        return halcon;
    }
    
    public static Ave crearAguila(String nombre, int edad, String genero){
        Ave aguila = new Ave(nombre, edad, genero);
        aguila.setColorPlumas("blanco y amarillo");
        aguila.setHabitat("montanas");
        Ave.aguilas++;
        return aguila;
    }
    
    public String movimiento(){
        return "volar";
    }
    
    public static int cantidadAves(){
        return Ave.listado.length;
    }
    
    public static Ave[] getListado() {
        return listado;
    }
    public static void setListado(Ave[] listado) {
        Ave.listado = listado;
    }
    public static ArrayList<Ave> getListado2() {
        return listado2;
    }
    public static void setListado2(ArrayList<Ave> listado2) {
        Ave.listado2 = listado2;
    }
    public String getColorPlumas() {
        return colorPlumas;
    }
    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
}