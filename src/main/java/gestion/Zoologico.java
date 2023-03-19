package gestion;
import zooAnimales.Animal;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private Zona[] zonas;
    
    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = new Zona[0];
    }
    public Zoologico(){
        this.nombre = null;
        this.ubicacion = null;
        this.zonas = new Zona[0];
    }
    public void agregarZonas(Zona agZona){
        Zona[] nuevoArray = new Zona[zonas.length + 1];

        for (int i = 0; i < zonas.length; i++) {
            nuevoArray[i] = zonas[i];
        }
        
        nuevoArray[nuevoArray.length - 1] = agZona;

        this.zonas = nuevoArray;
    }
    
    public int cantidadTotalAnimales(){
        int numAnimales = 0;
        for (Zona zona : zonas){
            numAnimales += zona.cantidadAnimales();
            }
        return numAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Zona[] getZonas() {
        return zonas;
    }

    public void setZonas(Zona[] zonas) {
        this.zonas = zonas;
    }
    
}