package zooAnimales;

import gestion.Zona;

public class Animal {
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;
    
    public Animal(String nombre, int edad, String habitat, String genero, Zona zona){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero= genero;
        this.zona = zona;
    }
    
    public Animal(){
        nombre = null;
        edad = 0;
        habitat = null;
        genero = null;
        zona = null;
    }
    
    public String movimiento(){
        return "desplazarse";
    }
    
    public String toString(){
        String base = "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es "+this.genero;
        if (zona != null){
            base += ", la zona en la que me ubico es "+this.zona+", en el zoo "+this.zona.getZoo();
        } 
        return base;
    }
    
    //public String totalPorTipo(){
        
    //}

    public static int getTotalAnimales() {
        return totalAnimales;
    }

    public static void setTotalAnimales(int totalAnimales) {
        Animal.totalAnimales = totalAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }   
}