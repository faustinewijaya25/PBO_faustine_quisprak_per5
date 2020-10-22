import java.util.Scanner;
 
 public class quisprak {
 	public static void main (String [] args) {
 		Scanner masukan = new Scanner(System.in);
 		String nama;
 		int pilihan1, pilihan2, pilihan3;
 		int jumlah;
 		int tot, bayar, kembalian;
 		boolean loop = true;
 		
 		System.out.print("Masukkan nama anda = ");
 		nama= masukan.nextLine();
 		System.out.println("Merek: ");
 		System.out.println("1. Merek G");
 		System.out.println("2. Merek O");
 		System.out.print("Merek yang dipilih= ");
 		pilihan2 = masukan.nextInt();
 		
 		
 		while (loop) {
 			switch(pilihan2) {
 				case 1:  System.out.println("Tipe: ");
 						 System.out.println("1. Meja : Rp.95.000");
 						 System.out.println("2. Kursi: Rp.125.000");
 						 System.out.println("2. Lemari: Rp.450.000");
 						 System.out.print(" Tipe yang di pilih= ");
 						 pilihan1= masukan.nextInt();
 						 switch(pilihan1){
 					case 1: System.out.print("Masukan jumlah unit pembelian= ");
 						 	jumlah = masukan.nextInt();
 						 	tot = jumlah*95000;
 						 	System.out.println("Total Harga = "+tot);
 						 	System.out.print("Bayaran anda = ");
 						 	bayar= masukan.nextInt();
 						 	kembalian= bayar - tot;
 						 	System.out.println();
 						    System.out.println("Nama = " +nama);
  						    System.out.println("Total Harga = "+tot);
 						    System.out.println("Bayar = "+bayar);
 						    System.out.println("Kembalian= " +kembalian);
 						    loop = false; break;
 					case 2: System.out.print("Masukan jumlah unit pembelian= ");
 						 	jumlah = masukan.nextInt();
 						 	tot = jumlah*125000;
 						 	System.out.println("Total Harga = "+tot);
 						 	System.out.print("Bayaran anda = ");
 						 	bayar= masukan.nextInt();
 						 	kembalian= bayar-tot;
 						 	System.out.println();
 						    System.out.println("Nama = " +nama);
 						    System.out.println("Total Harga = "+tot);
 						    System.out.println("Bayar = "+bayar);
 						    System.out.println("Kembalian= " +kembalian);
 						    loop = false; break;
 					case 3: System.out.print("Masukan jumlah unit pembelian= ");
 						 	jumlah = masukan.nextInt();
 						 	tot = jumlah*450000;
 						 	System.out.println("Total Harga = "+tot);
 						 	System.out.print("Bayaran anda = ");
 						 	bayar= masukan.nextInt();
 						 	kembalian= bayar-tot;
 						 	System.out.println();
 						    System.out.println("Nama = " +nama);
 						    System.out.println("Total Harga = "+tot);
 						    System.out.println("Bayar = "+bayar);
 						    System.out.println("Kembalian= " +kembalian);
 						    loop = false; break;
 				default: 	System.out.println("Tipe anda salah Pilih tipe 1-3");    
 				 }
 				 loop = false; break;
 				 
 			case 2:	  	 System.out.println("Tipe: ");
 						 System.out.println("1. Meja : Rp.115.000");
 						 System.out.println("2. Kursi: Rp.135.000");
 						 System.out.println("2. Lemari: Rp.550.000");
 						 System.out.println(" Tipe yang di pilih= ");
 						 pilihan3= masukan.nextInt();
 						 switch(pilihan3){
 					case 1: System.out.print("Masukan jumlah unit pembelian= ");
 						 	jumlah = masukan.nextInt();
 						 	tot = jumlah*115000;
 						 	System.out.println("Total Harga = "+tot);
 						 	System.out.print("Bayaran anda = ");
 						 	bayar= masukan.nextInt();
 						 	kembalian= bayar-tot;
 						 	System.out.println();
 						    System.out.println("Nama = " +nama);
 						    System.out.println("Total Harga = " +tot);
 						    System.out.println("Bayar = "+bayar);
 						    System.out.println("Kembalian= " +kembalian);
 						    loop = false; break;
 					case 2: System.out.print("Masukan jumlah unit pembelian= ");
 						 	jumlah = masukan.nextInt();
 						 	tot = jumlah*135000;
 						 	System.out.println("Total Harga = "+tot);
 						 	System.out.print("Bayaran anda = ");
 						 	bayar= masukan.nextInt();
 						 	kembalian= bayar-tot;
 						 	System.out.println();
 						    System.out.println("Nama = " +nama);
 						    System.out.println("Total Harga = "+tot);
 						    System.out.println("Bayar = "+bayar);
 						    System.out.println("Kembalian= " +kembalian);
 						    loop = false; break;
 					case 3: System.out.print("Masukan jumlah unit pembelian= ");
 						 	jumlah = masukan.nextInt();
 						 	tot = jumlah*550000;
 						 	System.out.println("Total Harga = "+tot);
 						 	System.out.print("Bayaran anda = ");
 						 	bayar= masukan.nextInt();
 						 	kembalian= bayar-tot;
 						 	System.out.println();
 						    System.out.println("Nama = " +nama);
 						    System.out.println("Total Harga = "+tot);
 						    System.out.println("Bayar = "+bayar);
 						    System.out.println("Kembalian= " +kembalian);
 						    loop = false; break;
 				default: 	System.out.println("Tipe anda salah Pilih tipe 1-3");    
 				 }
 				 loop = false; break;
 				 
 				 default: System.out.println("Merek yang anda masukan salah, Masukan merek yang benar ");
 				 }
 				 break;
 				 }
 				 
 				 }
 		}		 
 			