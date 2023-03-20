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
    
    public Reptil(String nombre, int edad, String habitat, String genero, String color, int largo){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setHabitat(habitat);
        this.setGenero(genero);
        this.setZona(null);
        this.colorEscamas = color;
        this.largoCola = largo;
        listado2.add(this);
        listado = listado2.toArray(new Reptil[listado2.size()]);
    }
    
    public Reptil(String nombre, int edad, String genero){
        this(nombre, edad, null, genero, null,0);
    }
        
    public Reptil(String nombre, int edad, String habitat, String genero){
        this(nombre, edad, habitat, genero, null,0);
    }   
    
    public Reptil(){
        this(null,0,null,null,null,0);
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
