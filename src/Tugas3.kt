fun main(){
    val angkaString = "85.75"
    val angkaDouble: Double = angkaString.toDouble()
    val angkaInt: Int = angkaDouble.toInt()
    val angkaStringkembali: String = angkaDouble.toString()

    println("Masukkan bilangan desimal: $angkaString")
    println("Nilai double: $angkaDouble")
    println("Nilai int: $angkaInt")
    println("Nilai String: $angkaStringkembali")
}