
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

    ;

    public Person(String nomb, String apellido, int ed, float statu, float pe, String colorP, String tipoIde, String identi) {
        this.nombre = nomb;
        this.apellidos = apellido;
        this.edad = ed;
        this.estatura = statu;
        this.peso = pe;
        this.colorPiel = colorP;
        this.tipoIdentificaicon = tipoIde;
        this.identificacion = identi;
    }
}