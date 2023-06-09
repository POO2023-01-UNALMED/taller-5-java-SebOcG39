package zooAnimales;

import gestion.Zona;
import java.util.ArrayList;

public class Pez extends Animal{
    private static Pez[] listado;
    private static ArrayList<Pez> listado2;
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;
    
     public Pez(String nombre, int edad, String habitat, String genero, String color, int aletas){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setHabitat(habitat);
        this.setGenero(genero);
        this.setZona(null);
        this.colorEscamas = color;
        this.cantidadAletas = aletas;
        Animal.animalCreado(this);
        listado2.add(this);
        listado = listado2.toArray(new Pez[listado2.size()]);
    }
    
    public Pez(String nombre, int edad, String genero){
        this(nombre, edad, null, genero, null, 0);
    }
    
    public Pez(String nombre, int edad, String habitat, String genero){
        this(nombre, edad, habitat, genero, null,0);
    }
    
    public Pez(){
        this(null,0,null,null,null,0);
    }
    
    public static int cantidadPeces(){
        return Pez.listado.length;
    }
    
    public String movimiento(){
        return "nadar";
    }
    
    public static Pez crearSalmon(String nombre, int edad, String genero){
        Pez salmon = new Pez(nombre, edad, genero);
        salmon.setColorEscamas("rojo");
        salmon.setCantidadAletas(6);
        salmon.setHabitat("oceano");
        Pez.salmones++;
        return salmon;
    }
    
    public static Pez crearBacalao(String nombre, int edad, String genero){
        Pez salmon = new Pez(nombre, edad, genero);
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
