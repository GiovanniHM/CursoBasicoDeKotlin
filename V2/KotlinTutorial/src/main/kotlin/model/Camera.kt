package model

class Camera{
    private var isOn: Boolean = false
    private  var resolution: Int = 640

    //Get y set para variables privadas

    fun setResolution(resolution: Int){
        this.resolution = resolution
    }

    fun getResolution(): Int{
        return this.resolution
    }


    fun turnOn(){
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }

    fun getCameraStatus(): String {
      return if (isOn) "Encendida" else "Apagada"
    }

    fun setCameraStatus(onoff: Boolean){
        isOn = onoff
    }
}