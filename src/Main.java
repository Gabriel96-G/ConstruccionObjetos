//public class Main {

  //  public static void main(String[] args) {


        // ==================================================
        // CREACIÓN DE LOS TRES CLIENTES
        // ==================================================


        // Cliente 1 - Constructor completo
      // Cliente cliente1 = new Cliente(
            //    "Alejandro",
            //    "Medrano Ruiz",
            //    "123456789",
             //   "Masculino",
              //  "Heredia"
       // );


        // Cliente 2 - Constructor sin sexo
        //Cliente cliente2 = new Cliente(
               // "Maria",
              //  "Rodriguez Vargas",
             //   "987654321",
            //    "San Jose"
        //);


        // Cliente 3 - Constructor por defecto
       // Cliente cliente3 = new Cliente();


        // Se asignan los datos después de haber creado el objeto
       // cliente3.nombre = "Carlos";
       // cliente3.apellidos = "Jimenez Mora";
       // cliente3.cedula = "456789123";
        //cliente3.sexo = "Masculino";
       // cliente3.ubicacion = "Alajuela";


        // ==================================================
        // CREACIÓN DE SUSCRIPCIONES
        // ==================================================


        // Primera instancia
       // Suscripcion suscripcion1 = new Suscripcion(
               // "Basica",
             //  5.99,
               // 1
        //);


        // Segunda instancia
     //   Suscripcion suscripcion2 = new Suscripcion(
              //  "Premium",
        //        10.99,
           //     1
        //);


        // ==================================================
        // PRUEBA DEL MÉTODO suscribirse()
        // ==================================================


        //cliente1.suscribirse(suscripcion1);

        //cliente2.suscribirse(suscripcion2);


        // Tercera instancia de Suscripcion
        // Se pasa de forma anónima
       // cliente3.suscribirse(
            //    new Suscripcion(
                 //       "Familiar",
                   //     14.99,
                    //   3
                //)
        //);
   // }
//}



/////////////////////////////////////////



public class Main {

    public static void main (String[] args) {

        // 1. Construcción de 3 Clientes con constructores diferentes
        Cliente cliente1 = new Cliente("Oscar","Lopez","112349876",'M',"Cartago");

        Cliente cliente2 = new Cliente("Manuela","Gutierrez","126453687","Heredia");

        Cliente cliente3 = new Cliente();

        // 2. Construcción de 3 Suscripciones
        Suscripcion suscripcion1 = new Suscripcion("Básica",25000,(byte)1);

        Suscripcion suscripcion2 = new Suscripcion("Intermedia",50000,(byte)6);

        Suscripcion suscripcion3 = new Suscripcion("Avanzada",75000,(byte)12);

        // 3. Pruebas suscripciones
        cliente1.suscribirse(suscripcion1);
        cliente2.suscribirse(suscripcion2);
        cliente3.suscribirse(new Suscripcion("Avanzada", 10000, (byte)3)); // suscripción anónima
    }

}