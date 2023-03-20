package gestion;
import zooAnimales.Animal;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private Animal[] animales;
    
    public Zona(String nombre, Zoologico zoo){
        this.nombre = nombre;
        this.zoo = zoo;
    }
    public Zona(){
        nombre = null;
        zoo = null;
        animales = new Animal[0];
    }
    public void agregarAnimales(Animal animal){
        Animal[] nuevoArray = new Animal[animales.length +1];
        
        for (int i=0;i < animales.length; i++){
            nuevoArray[i] = animales[i];
        }
        
        nuevoArray[nuevoArray.length -1] = animal;
        
        this.animales = nuevoArray;
    }
    public int cantidadAnimales(){
        int numAnimales = 0;
        for (Animal animal : animales){
            if (animal != null){
                numAnimales++;
            }
        }
        return numAnimales;
    }

    public Animal[] getAnimales() {
        return animales;
    }

    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Zoologico getZoo() {
        return zoo;
    }

    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }
}
