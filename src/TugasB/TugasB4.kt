package TugasB

fun main(){
    print("Masukkan nama pegawai: ")
    val namaPegawai : String = readln()

    print("Masukkan gaji pokok: ")
    val gajiPokok: Double = readln().toDouble()

    print("Masukkan tunjangan pegawai: ")
    val tunjangPegawai: Double = readln().toDouble()

    print("Masukkan uang lembur: ")
    val uangLambur: Double = readln().toDouble()

    print("Masukkan potongan: ")
    val potongan: Double = readln().toDouble()

    var gajiKotor: Double = gajiPokok + tunjangPegawai + uangLambur
    var gajiBersih: Double = gajiKotor - potongan

    println()
    println("Nama Pegawai: $namaPegawai")
    println("Gaji Pokok: $gajiPokok")
    println("Tunjangan pegawai: $tunjangPegawai")
    println("Uang Lambur: $uangLambur")
    println("Potongan: $potongan")
    println("Gaji kotor: $gajiKotor")
    println("Gaji Bersih: $gajiBersih")
}