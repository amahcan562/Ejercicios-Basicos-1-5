import org.w3c.dom.css.Rect
class Rectangulo (var base2 : Double, var altura : Double) {

    var area : Double = base2 * altura
    var perimetro : Double = 2 * base2 + 2 * altura

    init {
        require(this.base2 > 0 && this.altura > 0) {"ERROR! La base y altura deben ser mayores a 0."}
    }


    //Consultores siempre get---
    //Modificadores siempre set

    fun getBaseData(): Double{
        return this.base2
    }

    fun getAlturaData() : Double{
        return this.altura
    }


    fun getBaseToString() : String{
        return this.base2.toString()
    }



    fun setBaseData(newBase : Double){
        this.base2 = newBase
    }

    override fun toString(): String {
        return ("${this.base2}, es la base y la altura es ${this.altura}\nEl perímetro es de ${this.perimetro} cm, y el área es de ${this.area} cm^2.")
    }
}

fun main () {
    println("Introduzca la base y la altura en cm: ")
    val base : Double =  readln().toDouble()
    val altura : Double=  readln().toDouble()


    if (base > 0.0 && altura > 0.0) {
        val rectangulo1 = Rectangulo(base, altura)
        println(rectangulo1.toString())
        /*println("Para una base de 5 seria...")
        rectangulo4.setBaseData(5.0)
        println(rectangulo4.toString())
         */
        println("La base de este rectangulo es " + rectangulo1.getBaseData().toString())
    } else {
        println("ERROR")
    }
}



