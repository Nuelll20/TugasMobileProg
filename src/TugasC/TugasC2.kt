package TugasC

fun hitungLuas(panjang: Double, lebar: Double): Double {
    return panjang * lebar
}

fun main(){
    print("Masukkan panjang: ")
    val panjang : Double = readln().toDouble()

    print("Masukkan lebar: ")
    val lebar: Double = readln().toDouble()

    val luas = hitungLuas(panjang, lebar)

    println("Panjang: $panjang")
    println("Lebar: $lebar")
    println("Luas: $luas")
}