package TugasB

fun main(){
    print("Masukkan bilangan pertama: ")
    var angka1 = readln().toInt()

    print("Masukkan bilangan kedua: ")
    var angka2 = readln().toInt()

    println("Sebelum ditukar: ")
    println("Bilangan pertama: $angka1")
    println("Bilangan kedua: $angka2")

    val sementara: Int = angka1
    angka1 = angka2
    angka2 = sementara

    println("Sesudah ditukar: ")
    println("Bilangan pertama: $angka1")
    println("Bilangan kedua: $angka2")
}