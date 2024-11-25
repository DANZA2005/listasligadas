public class ListaLigada {
    private Nodo head;
    private Nodo tail;
    private Nodo actual;
    public int size;

    // Método para añadir un dato al principio de la lista
    public void addFirst(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (this.size == 0) {
            this.head = nuevoNodo;
            this.tail = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(this.head);
            this.head = nuevoNodo;
        }
        this.size++;
    }

    // Método para añadir un dato al final de la lista
    public void add(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (this.size == 0) {
            this.head = nuevoNodo;
            this.tail = nuevoNodo;
        } else {
            this.tail.setSiguiente(nuevoNodo);
            this.tail = nuevoNodo;
        }
        this.size++;
    }

    // Método para añadir un dato en una posición específica
    public void add(int dato, int posicion) {
        if (posicion < 1 || posicion > size + 1) {
            System.out.println("Posición inválida. No se puede insertar");
            return;
        }

        if (posicion == 1) {
            addFirst(dato);
            return;
        }

        Nodo nuevoNodo = new Nodo(dato);
        actual = head;

        for (int index = 1; index < posicion - 1; index++) {
            actual = actual.getSiguiente();
        }

        nuevoNodo.setSiguiente(actual.getSiguiente());
        actual.setSiguiente(nuevoNodo);
        if (nuevoNodo.getSiguiente() == null) {
            this.tail = nuevoNodo;
        }
        this.size++;
    }

    // Método para eliminar el primer dato de la lista
    public void removeFirst() {
        if (this.size == 0) {
            System.out.println("La lista está vacía. No se puede eliminar");
            return;
        }
        this.head = this.head.getSiguiente();
        if (this.head == null) {
            this.tail = null;
        }
        this.size--;
    }

    // Método para eliminar el último dato de la lista
    public void removeLast() {
        if (this.size == 0) {
            System.out.println("La lista está vacía. No se puede eliminar");
            return;
        }

        if (this.size == 1) {
            this.head = null;
            this.tail = null;
        } else {
            actual = head;
            while (actual.getSiguiente() != tail) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(null);
            this.tail = actual;
        }
        this.size--;
    }

    // Método para eliminar un dato en una posición específica
    public void remove(int posicion) {
        if (posicion < 1 || posicion > size) {
            System.out.println("Posición inválida. No se puede eliminar");
            return;
        }

        if (posicion == 1) {
            removeFirst();
            return;
        }

        actual = head;
        for (int index = 1; index < posicion - 1; index++) {
            actual = actual.getSiguiente();
        }

        Nodo nodoAEliminar = actual.getSiguiente();
        actual.setSiguiente(nodoAEliminar.getSiguiente());
        if (nodoAEliminar == tail) {
            tail = actual;
        }
        this.size--;
    }

    // Método para imprimir la lista
    public void print() {
        this.actual = this.head;
        while (actual != null) {
            int dato = actual.getDato();
            System.out.println("Dato: " + dato);
            actual = actual.getSiguiente();
        }
    }

    // Método para obtener el tamaño de la lista
    public int sizeOfList() {
        return this.size;
    }
}
