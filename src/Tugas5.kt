fun main(){
    print("Masukkan karakter: ")
    val karakter: Char = readln()[0]

    println("Karakter: $karakter")
    println("Kode Karakter: ${karakter.code}")
    println("Termasuk huruf: ${karakter.isLetter()}")
    println("Termasuk angka: ${karakter.isDigit()}")
}