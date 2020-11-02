package model

class Shoe {
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