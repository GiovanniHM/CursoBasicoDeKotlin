import com.sun.org.apache.xerces.internal.impl.xpath.XPath
import model.Camera
import model.Shoe

val list: ArrayList<String> = ArrayList()

fun main(args: Array<String>) {
 //variables

    //menu()

    //arreglos()
    //arreglosUtil()
   // expresiones()
    //funcion()
    //lambdas()
    //clases()
    classRestricciones()


}

fun menu(){
    val  menu: String = """""
                        Selecciona la opción deseada
                        1. Hacer una receta
                        2. Ver mis recetas
                        3. Salir
                        """.trimMargin()

    println(menu)
    menuOption()

}

fun menuOption() {
    var NoList: Boolean = false
    while (NoList ==false){
        print("Selecione una opcion")
        val respuesta:String? = readLine()
        when (respuesta){
            "1" -> hacerReceta()
            "1" -> NoList = true
            "2" -> mostrarReceta()
            "2" -> NoList = true
            "3" -> salir()
            "3" -> NoList = true
            else ->  print("No esta en la lista ")

        }
    }
}

fun salir() {
    println("Saliendo...")
}

fun mostrarReceta() {
    println("Imrimiendo lista")
    list.forEach{
        println(it)
    }
}

fun hacerReceta() {
    val mostrar = "Por favor seleccione un ingrediente"
    println(mostrar)

    val opciones: String = """
        0.Acabar Receta
        1.Agua
        2.Leche
        3.Carne
        4.Verduras
        5.Frutas
        6.Cereal
        7.Huevo
        8.Aceite
    """.trimIndent()

    println(opciones)

    val respuesta: String? = readLine()

    when (respuesta) {
        "0" -> {
            menu()
        }
        "1" -> {
            print("agregando Agua" + list.add("Agua"))
            hacerReceta()
        }
        "2" -> {
            print("agregando Leche" + list.add("Leche"))
            hacerReceta()
        }
        "3" -> {
            print("agregando Carne" + list.add("Carne"))
            hacerReceta()
        }
        "4" -> {
            print("agregando Verduras" + list.add("Verduras"))
            hacerReceta()
        }
        "5" -> {
            print("agregando Frutas" + list.add("Frutas"))
            hacerReceta()
        }
        "6" -> {
            print("agregando Cereal" + list.add("Cereal"))
            hacerReceta()
        }
        "7" -> {
            print("agregando Huevos" + list.add("Huevos"))
            hacerReceta()
        }
        "8" -> {
            print("agregando Aceite" + list.add("Aceite"))
            hacerReceta()
        }

    }
    }
//  -------------------------------> Arreglos
fun arreglos(){
    //Array de multivalor
    val countries = arrayOf("Indía", "México", "Chile", 4, 10 ,2.5)
    //Array con restición
    val days: Array<String> = arrayOf<String>("Lunes", "Martes", "Miercoles")
    //Arreglo especifico
    val number = doubleArrayOf(2.5, 20.34, 18.19 )

    //Formas de recorrer array
    //For
    for (countrie in countries){
        println(countrie)
    }
    //ForEach
    days.forEach {
        println(it)
    }

    //Promedio de números
    var suma:Double = 0.0
    for(num in number){
        suma +=num;
    }
    val avergege = suma / number.size;
    println("Promedio arreglo double es de: $avergege")
}

// -------------------------------> Métodos útiles en arreglos

fun arreglosUtil(){

    var arrayObject = arrayOf(5,3,7)
    //Transfroma el arreglo a primitive
    var intPrimitive : IntArray = arrayObject.toIntArray()
    //Metodos en arreglos
    val suma = arrayObject.sum();
    println("El valor de la suma del arreglo tipo obj $suma")
    //Agregar datos a un arreglo
    arrayObject = arrayObject.plus(12)
    arrayObject.forEach {
        print("$it,")
    }
    println("")
    println("reversedArray")
    //Invertir datos de un arreglo
    arrayObject = arrayObject.reversedArray()

    arrayObject.forEach {
        print("$it,")
    }

    val suma2 = intPrimitive.sum()

}

fun expresiones(){
    var x = 5
    //Expreción
    println("X es igual a 5? ${x==5}") // true

    var mensaje = "El valor de x es $x"
    x++
    println("${mensaje.replace("es", "fue")}, x es igual a: $x")
}

//Funciones

fun funcion(){
    println("Raiz cuadrade de ${Math.sqrt(4.0)}")

    fun averageNumbers(numbers: IntArray): Int {
        val sumas = numbers.sum()
        return sumas.div(numbers.size)
    }
    val numeros = intArrayOf(8, 7, 20)

    println("El promedio de los numeros 8, 7 y 20 es ${averageNumbers(numeros)}")
}

fun lambdas(){
 val lambdaf = {a:Int, c:Int -> a+c }

    println(lambdaf(24,6))

    //Iniciaizada
    val lambdaIn = ({a:Int, c:Int -> a+c }(1,1))

    println(lambdaIn)


}

// ----------------- >Clases

fun clases(){
    val camera = Camera()
    camera.turnOn()
    println("La capara eatá: ${camera.getCameraStatus()}")

    camera.setResolution(1080)
    println("Resolution: ${camera.getResolution()}")
}

fun classRestricciones(){
    var shoe = Shoe()
    shoe.size = 39
    println(shoe.size)
    shoe.model = "Zapato"
    println(shoe.model)
}