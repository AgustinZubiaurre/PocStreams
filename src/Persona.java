public class Persona {
    String nombre;
    int dni;
    int edad;

    public Persona(String nombre, int dni, int edad) {
        this.nombre=nombre;
        this.dni=dni;
        this.edad=edad;
    }

    public int getEdad(){
        return this.edad;
    }
    public int getDni(){
        return this.dni;
    }
    public String getNombre(){
        return this.nombre;
    }

    public String toString()
    {
        return "nombre:"+this.nombre+" - "+"dni:"+this.dni+" - "+"edad:"+this.edad;
    }
}


