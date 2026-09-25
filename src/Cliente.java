public class Cliente {

    // Atributos
    String nombre;
    String apellidos;
    String cedula;
    String sexo;
    String ubicacion;


    // Constructor completo
    Cliente(String nombre, String apellidos, String cedula, String sexo, String ubicacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.sexo = sexo;
        this.ubicacion = ubicacion;
    }


    // Constructor que inicializa todos los atributos menos sexo
    Cliente(String nombre, String apellidos, String cedula, String ubicacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.ubicacion = ubicacion;
    }


    // Constructor por defecto
    Cliente() {

    }


    // Método suscribirse
    void suscribirse(Suscripcion suscripcion) {

        System.out.println(
                nombre + " " + apellidos
                        + " adquirió una suscripción "
                        + suscripcion.tipo + "."
        );
    }
}