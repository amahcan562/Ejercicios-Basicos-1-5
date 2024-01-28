class Coche(
    val marca: String,           // Propiedad de solo lectura para la marca del coche
    val modelo: String,          // Propiedad de solo lectura para el modelo del coche
    val numeroCaballos: Int,     // Propiedad de solo lectura para el número de caballos del coche
    val numeroPuertas: Int,      // Propiedad de solo lectura para el número de puertas del coche
    var matricula: String
    ,       // Propiedad de solo lectura para la matrícula del coche
    var color: String?           // Propiedad de lectura y escritura para el color del coche (puede ser nulo)
) {
    // Bloque de inicialización
    init {
        // Verifica que marca y modelo no sean nulos o en blanco
        require(marca.isNotBlank() && modelo.isNotBlank()) { "Marca y modelo no pueden ser nulos o en blanco." }

        // Verifica que el número de caballos sea mayor que 0
        require(numeroCaballos > 0) { "El número de caballos debe ser mayor que 0." }

        // Verifica que el número de puertas sea mayor que 0
        require(numeroPuertas > 0) { "El número de puertas debe ser mayor que 0." }

        // Verifica que la matrícula no sea nula o en blanco
        require(matricula.isNotBlank() && matricula.length == 7) { "La matrícula no puede ser nula o en blanco." }
    }

    var _matricula: String
        get() = matricula
        set(value) {
            require(value.length == 7) { "La matrícula debe tener exactamente 7 caracteres." }
            matricula = value
        }


    // Sobrescribe el método toString para obtener una representación de cadena del objeto
    override fun toString(): String {
        return "Coche(marca='${this.marca}', modelo='$modelo', numeroCaballos=$numeroCaballos, " +
                "numeroPuertas=$numeroPuertas, matricula='$matricula', color='$color')"
    }
}
