package models;

public class Person {

    private String nombre;
    private String apellidos;
    private int edad;
    private float estatura;
    private float peso;
    private String colorPiel;
    private String tipoIdentificaicon;
    private String identificacion;

    public Person() {
    }

    public Person(String nombre, String apellidos, int edad, float estatura, float peso, String colorPiel, String tipoIdentificaicon, String identificacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.colorPiel = colorPiel;
        this.tipoIdentificaicon = tipoIdentificaicon;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public String getTipoIdentificaicon() {
        return tipoIdentificaicon;
    }

    public void setTipoIdentificaicon(String tipoIdentificaicon) {
        this.tipoIdentificaicon = tipoIdentificaicon;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
}