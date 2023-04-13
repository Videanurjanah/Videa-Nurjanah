/*
program : Menghitung Luas Meja
tanggal : Selasa,11 april 2023
nama    : Videa Nurjanah
nim     : 22323035
*/
public class meja{	// akses dasar terhadap variabel public int nama
	public int kaki_meja()// akses dasar terhadap metode
	{ // tanda pembuka perintah setelah ini
		return 70; //untuk mengembalikan nilai pada alas_meja bernilai 70
	} // tanda penutup perintah mengimput nilai kaki_meja
	public int alas_meja()//akses dasar terhadap metode
	{ // tanda pembuka perintah setelah ini
		return 120; //untuk mengembalikan nilai pada alas_meja bernilai 120
	} // tanda penutup perintah mengimput nilai alas_meja
	public static void main(String[]args) // adalah sebuah method yang telah di-import otomatis untuk digunakan mencetak output di konsol.
	{ // tanda pembuka perintah setelah ini
	meja a=new meja(); //untuk membuat variabel baru dengan program meja baru menjadi new meja
	int kaki=a.kaki_meja(); //mendeklarasikan variabel kaki  dengan memanggil variabel meja dengan menambahkan baru. class kaki_meja dengan tipe
	int alas_meja=a.alas_meja(); //mendeklarasikan variabel alas_maja dengan memanggil variabel meja  dengan menambahkan baru. class alas_meja 
	System.out.println(kaki*alas_meja); //pernyataan java yang mencetak argumen yang dikirim ke System.out. dan menampilkan output ke monitor dari operasi aritmatika
	} // tanda penutup perintah diatas
} //tanda akhir dari sesuatu