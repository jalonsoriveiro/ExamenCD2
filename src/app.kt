
fun main() {

//Creamos 3 Aparcamientos AparcamietoIndee/AparcamientoCastelao/AparcamientoFlorida y le damos valor a los atributos
//  clase Aparcamiento y la Clase Coche
    var AparcamientoIndee=Aparcamiento("indee",2,3,Coche("2323","20:00","21:00"))
      //Mostrarmos los valores del objeto llamando al metodo toString
        println(AparcamientoIndee.toString())
    var AparcamientoCastelao=Aparcamiento("Castelao",4,8,Coche("4423bj","22:00","23:00"))
    //Mostrarmos los valores del objeto llamando al metodo toString
        println(AparcamientoCastelao.toString())
    var AparcamientoFlorida=Aparcamiento("Florida",4,8,Coche("4423bj","22:00","23:00"))
    //Mostrarmos los valores del objeto llamando al metodo toString
    println(AparcamientoFlorida.toString())

}