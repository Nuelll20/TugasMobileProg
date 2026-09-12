package TugasC

fun tambah (a: Double, b: Double): Double{
    return a+b
}
fun kurang (a: Double, b: Double): Double{
    return a-b
}
fun kali (a: Double, b: Double): Double{
    return a*b
}
fun bagi (a: Double, b: Double): Double{
    return a/b
}

fun main(){

    while(true) {
        println()
        println ("Pilih operasi perhitungan")
        println ("1. Tambah")
        println ("2. Pengurangan")
        println ("3. Perkalian")
        println ("4. Pembagian")
        println ("5. Exit")

        print ("Masukkan pilihan: ")
        val pilihan = readln().toInt()

        if (pilihan == 5) {
            println("Keluar dari program")
            break
        }

        if (pilihan !in 1..4){
            println("Pilihan tidak valid")
            continue
        }

        print("Masukkan bilangan pertama: ")
        val a = readln().toDouble()
        print("Masukkan bilangan kedua: ")
        val b = readln().toDouble()

        when (pilihan) {
            1 -> println("Hasil: ${tambah(a, b)}")
            2 -> println("Hasil: ${kurang(a, b)}")
            3 -> println("Hasil: ${kali(a, b)}")
            4 -> {
                if (b == 0.0) {
                    println("Tidak bisa membagi dengan 0!")
                } else {
                    println("Hasil: ${bagi(a, b)}")
                }
            }
        }
    }
}










