package TugasB

fun main(){
    print("Masukkan nama barang: ")
    var barang = readln().toString()

    print("Masukkan harga barang: ")
    var harga = readln().toDouble()

    print("Masukkan jumlah barang: ")
    var jumlah = readln().toInt()

    print("Persentase Diskon: ")
    var diskon = readln().toDouble()

    val subTotal: Double = harga * jumlah
    val potongan: Double = subTotal * diskon / 100
    val totalBayar: Double = subTotal - potongan

    println ("Total yang harus dibayar: $totalBayar")
}