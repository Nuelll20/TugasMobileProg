package TugasC

fun tampilkanNama(nama: String) {
    println("Selamat Datang, $nama")
}

fun main(){
    print("Masukkan nama: ")
    val nama : String = readln()

    tampilkanNama(nama)
}