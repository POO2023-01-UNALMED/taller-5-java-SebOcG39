package zooAnimales;

import gestion.Zona;
import java.util.ArrayList;

public class Reptil extends Animal{
    private static Reptil[] listado;
    private static ArrayList<Reptil> listado2;
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;
    
    public Reptil(String nombre, int edad, String genero){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setHabitat(null);
        this.setGenero(genero);
        this.setZona(null);
        this.largoCola = 0;
        this.colorEscamas = null;
        Animal.animalCreado();
        listado2.add(this);
        listado = listado2.toArray(new Reptil[listado2.size()]);
    }
    
    public Reptil(String nombre, int edad, String habitat, String genero, Zona zona){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setHabitat(habitat);
        this.setGenero(genero);
        this.setZona(zona);
        this.colorEscamas = null;
        this.largoCola = 0;
        listado2.add(this);
        listado = listado2.toArray(new Reptil[listado2.size()]);
    }
    
    public Reptil(String nombre, int edad, String habitat, String genero){
        this(nombre, edad, habitat, genero, null);
    }
    
    public Reptil(){
        this.setNombre(null);
        this.setHabitat(null);
        this.setEdad(0);
        this.setZona(null);
        this.setGenero(null);
        this.colorEscamas = null;
        this.largoCola = 0;
        Animal.animalCreado();
        listado2.add(this);
        listado = listado2.toArray(new Reptil[listado2.size()]);
    }
    
    public static Reptil crearIguana(String nombre, int edad, String genero){
        Reptil iguana = new Reptil(nombre, edad, genero);
        iguana.setColorEscamas("verde");
        iguana.setLargoCola(3);
        iguana.setHabitat("humedal");
        Reptil.iguanas++;
        return iguana;
    }
    
    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        Reptil serpiente = new Reptil(nombre, edad, genero);
        serpiente.setColorEscamas("blanco");
        serpiente.setLargoCola(1);
        serpiente.setHabitat("jungla");
        Reptil.serpientes++;
        return serpiente;
    }
    
    public static int cantidadReptiles(){
        return Reptil.listado.length;
    }
    
    public String movimiento(){
        return "reptar";
    }

    public static Reptil[] getListado() {
        return listado;
    }
    public static void setListado(Reptil[] listado) {
        Reptil.listado = listado;
    }
    public static ArrayList<Reptil> getListado2() {
        return listado2;
    }
    public static void setListado2(ArrayList<Reptil> listado2) {
        Reptil.listado2 = listado2;
    }
    public String getColorEscamas() {
        return colorEscamas;
    }
    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }
    public int getLargoCola() {
        return largoCola;
    }
    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }
}
