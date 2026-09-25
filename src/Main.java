
public class Main {

    public static void main(String[] args) {


        // ====================================================
        // CREACIÓN DE CLIENTES
        // ====================================================

        // Cliente utilizando el constructor completo
        Cliente cliente1 = new Cliente(
                "Alejandro",
                "Medrano Ruiz",
                "123456789",
                "Masculino",
                "Heredia"
        );


        // Cliente utilizando el constructor sin sexo
        Cliente cliente2 = new Cliente(
                "Maria",
                "Rodriguez Vargas",
                "987654321",
                "San Jose"
        );


        // Cliente utilizando el constructor por defecto
        Cliente cliente3 = new Cliente();


        // Asignación manual de los atributos
        cliente3.nombre = "Carlos";
        cliente3.apellidos = "Jimenez Mora";
        cliente3.cedula = "456789123";
        cliente3.sexo = "Masculino";
        cliente3.ubicacion = "Alajuela";


        // ====================================================
        // CREACIÓN DE SUSCRIPCIONES
        // ====================================================

        Suscripcion suscripcion1 = new Suscripcion(
                "Basica",
                5.99,
                1
        );

        Suscripcion suscripcion2 = new Suscripcion(
                "Premium",
                10.99,
                1
        );

        Suscripcion suscripcion3 = new Suscripcion(
                "Anual",
                99.99,
                12
        );


        // ====================================================
        // PRUEBA DEL MÉTODO suscribirse()
        // ====================================================

        cliente1.suscribirse(suscripcion1);

        cliente2.suscribirse(suscripcion2);


        // Suscripción pasada de forma anónima
        cliente3.suscribirse(
                new Suscripcion(
                        "Familiar",
                        14.99,
                        1
                )
        );
    }
}