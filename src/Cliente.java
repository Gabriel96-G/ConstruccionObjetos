//public class Cliente {

    // Atributos
   // private String nombre;
   // private String apellidos;
   // private String cedula;
   // private String sexo;
   // private String ubicacion;


    // Constructor completo
  //  public Cliente(String nombre, String apellidos, String cedula, String sexo, String ubicacion) {
     //   this.nombre = nombre;
      //  this.apellidos = apellidos;
      //  this.cedula = cedula;
      //  this.sexo = sexo;
      //  this.ubicacion = ubicacion;
   // }


    // Constructor que inicializa todos los atributos menos sexo
    //public Cliente(String nombre, String apellidos, String cedula, String ubicacion) {
      //  this.nombre = nombre;
      //  this.apellidos = apellidos;
      //  this.cedula = cedula;
       // this.ubicacion = ubicacion;
   // }


    // Constructor por defecto
   // Cliente() {

    //}


    // Método suscribirse
    //void suscribirse(Suscripcion suscripcion) {

        //System.out.println(
              //  nombre + " " + apellidos
                 //       + " adquirió una suscripción "
                   //     + suscripcion.tipo + "."
      //  );
   // }
//}

//////////////////////////////////////////////

//public class Cliente {

    // Atributos
   // private String nombre;
  //  private String apellido;
  //  private String cedula;
  //  private char sexo;
   // private String ubicacion;

    // Métodos
    // Constructor completo
   // public Cliente (String nombre,String apellido,String cedula,char sexo,String ubicacion) {
   //     this.nombre = nombre;
    //    this.apellido = apellido;
    //    this.cedula = cedula;
      //  this.sexo = sexo;
      //  this.ubicacion = ubicacion;
   // }

    // Constructor por sobrecarga
   // public Cliente (String nombre,String apellido,String cedula,String ubicacion) {
     //   this.nombre = nombre;
     //   this.apellido = apellido;
     //   this.cedula = cedula;
     //   this.ubicacion = ubicacion;
   // }

    // Constructor por defecto
   // Cliente (){}

    // Método suscribirse
   // void suscribirse(Suscripcion suscripcion) {
    //    System.out.println(nombre + " " + apellido + " adquirió una suscripción " + suscripcion.getTipo() + ".");
   // }

    // Getters - Devuelve información
 //   public String getNombre(){
       // return nombre;
//    }

 //   public String getApellido(){
        //return apellido;
   // }

   // public String getCedula(){
   //     return cedula;
  //  }

    //public char getSexo(){
   //     return sexo;
   // }

    //public String getUbicacion(){
     //   return ubicacion;
    //}

    // Setters - Agrega valor y lo cambia
    //public void setNombre(String nombre){
        //this.nombre = nombre;
    //}

   // public void setApellido(String apellido){
    //    this.apellido = apellido;
   // }

  //  public void setCedula(String cedula){
     //   this.cedula = cedula;
  //  }

   // public void setSexo(char sexo){
  //      this.sexo = sexo;
   // }

   // public void setUbicacion(String ubicacion){
    //    this.ubicacion = ubicacion;
    //}

//}


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Cliente {

    // Atributos
    private String nombre;
    private String apellido;
    private String cedula;
    private char sexo;
    private String ubicacion;

    // Métodos
    // Constructor completo
    public Cliente(String nombre, String apellido, String cedula, char sexo, String ubicacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.sexo = sexo;
        this.ubicacion = ubicacion;
    }

    // Constructor por sobrecarga
    public Cliente(String nombre, String apellido, String cedula, String ubicacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.ubicacion = ubicacion;
    }

    // Constructor por defecto
    Cliente() {
    }

    // Método suscribirse
    void suscribirse(Suscripcion suscripcion) {
        System.out.println(nombre + " " + apellido + " adquirió una suscripción " + suscripcion.getTipo() + ".");
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public char getSexo() {
        return sexo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // equals()
    public boolean equals(Cliente cliente) {
        return this.nombre.equals(cliente.nombre) && this.apellido.equals(cliente.apellido) &&
                this.cedula.equals(cliente.cedula) && (this.sexo == cliente.sexo) &&
                this.ubicacion.equals(cliente.ubicacion);
    }

    // toString()
    public String toString() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nCédula: " + cedula +
                "\nSexo: " + sexo + "\nUbicación: " + ubicacion + "\n";
    }
}