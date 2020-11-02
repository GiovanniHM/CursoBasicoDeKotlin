package model

class Shoe(var sku: Int, var mark:String) {
    //Metodo para definir el codigo que se ejecute cuando se
    //crea la clase
    init {
        println("SKU ID $sku")
        println("Marca $mark")
    }
    var size: Int = 34 // Min 34
    set(value) {
        if (value >= 34)
            field = value
        else field = 34
    }
    get() = field
    var color: String = "White" //Cool
    var model: String = "Boots" // Not Tenis
    set(value) {
        if (value == "Tenis"){
            field = "Boots"
        }
        else field = value
    }

}