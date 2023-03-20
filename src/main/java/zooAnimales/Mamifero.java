package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Mamifero extends Animal{
    private static Mamifero[] listado;
    private static ArrayList<Mamifero> listado2;
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setHabitat(habitat);
        this.setGenero(genero);
        this.setZona(null);
        this.patas = patas;
        this.pelaje = pelaje;
        Animal.animalCreado(this);
        listado2.add(this);
        listado = listado2.toArray(new Mamifero[listado2.size()]);
    }
    
    public Mamifero(String nombre, int edad, String genero){
        this(nombre, edad,null, genero);
    }
 
    public Mamifero(String nombre, int edad, String habitat, String genero){
        this(nombre, edad, habitat, genero, false, 0);
    }
    
    public Mamifero(){
        this(null,0,null,null,false,0);
    }

    public static int cantidadMamiferos(){
        return Mamifero.listado.length;
    }
    
    public static Mamifero crearCaballo(String nombre, int edad, String genero){
        Mamifero caballo = new Mamifero(nombre, edad, genero);
        caballo.pelaje = true;
        caballo.patas = 4;
        caballo.setHabitat("pradera");
        Mamifero.caballos++;
        return caballo;
    }
    
    public static Mamifero crearLeon(String nombre, int edad, String genero){
        Mamifero leon = new Mamifero(nombre, edad, genero);
        leon.pelaje = true;
        leon.patas = 4;
        leon.setHabitat("selva");
        Mamifero.leones++;
        return leon;
    }
    
    public static Mamifero[] getListado() {
        return listado;
    }
    public static void setListado(Mamifero[] listado) {
        Mamifero.listado = listado;
    }
    public static ArrayList<Mamifero> getListado2() {
        return listado2;
    }
    public static void setListado2(ArrayList<Mamifero> listado2) {
        Mamifero.listado2 = listado2;
    }
    public boolean getPelaje() {
        return pelaje;
    }
    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }
    public int getPatas() {
        return patas;
    }
    public void setPatas(int patas) {
        this.patas = patas;
    }
}
