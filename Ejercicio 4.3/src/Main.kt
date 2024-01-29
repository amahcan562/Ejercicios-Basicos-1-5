import kotlin.math.round

class Personaa (var peso : Double, var altura : Double) {

    var nombre: String = "Sin nombre"
    val imc: Double = round( this.peso / (this.altura * this.altura)*100.00) / 100.00


    constructor(nombre: String, peso: Double, altura: Double) : this(peso, altura) {
        this.nombre = nombre
    }


    override fun toString(): String {
        return ("${this.nombre}, tu peso es de ${this.peso} kg, tu altura es de ${this.altura} m y tu IMC es de ${this.imc}.")
    }

    fun saludar() : String{
        return "Hola, ${this.nombre}"
    }


    fun alturaEncimaMedia() : Boolean{
        /*
        if (this.altura > 1.75){
            return true
        } else{
            return false
        }*/
        //return if (this.altura > 1.75) true else false
        return this.altura > 1.75
    }

    fun pesoEncimaMedia() : Boolean{
        return this.peso >= 70
    }

    fun obtenerDescInc() : String{
        if (this.imc < 18.5){
            return "Peso insuficiente."
            //}  else if (this.imc > 18.5 && this.imc < 24.9)
        } else if (this.imc < 24.9)   {
            return "Peso saludable."
        } else if (this.imc < 29.9)   {
            return "Sobrepeso."
        } else  {
            return "Obesidad."
        }
    }


    fun obtenerDesc(): String{
        var returnString:String = this.saludar() + " con una altura de "  + "${this.altura} m"

        if (this.alturaEncimaMedia()){
            returnString += " (Por encima de la media)"
        } else{
            returnString += " (Por debajo de la media)"
        }

        returnString += " y un peso de ${this.peso} kg"

        if (this.pesoEncimaMedia()){
            returnString += " (Por encima de la media)"
        } else{
            returnString += " (Por debajo de la media)"
        }

        returnString += " tiene un IMC de ${this.imc} " + this.obtenerDescInc()
        return returnString
    }
}

fun main () {

    val persona1 = Personaa(78.0, 1.85)
    val persona2 = Personaa("Federico", 90.0, 1.70)
    val persona3 = Personaa("Cansa", 60.3, 1.65)

    println(persona1.toString())
    println(persona2.toString())
    println(persona3.toString())

    println(persona1.obtenerDesc())



}
