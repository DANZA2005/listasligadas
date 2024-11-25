public class Nodo{
    private int dato; //Dato almacenado
    private Nodo siguiente; // apuntar al siguiente nodo

    public Nodo(int valor){
        this.dato = valor;
        this.siguiente = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    

}