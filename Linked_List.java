import java.util.LinkedList;
    
    public class Linked_List {
        public static void main(String[] args) {
    
            //Buatlah sebuah LinkedList yang mana pada LinkedList 
            //tersebut dapat menambah data berupa No_Bp, Nama_Mahasiswa, Alamat.
    
            LinkedList<String> No_Bp = new LinkedList<>();
            LinkedList<String> Nama_Mahasiswa= new LinkedList<>();
            LinkedList<String> Alamat = new LinkedList<>();
    
            //Kemudian Tambahkan beberapa fungsi/operasi pada LinkedList yang anda ketahui
    
            //menggunakan fungsi add = add(), addFirst(), dan addLast()
            Nama_Mahasiswa.add("Ghina Fitri Hidayah");
            No_Bp.add("2111523015");
            Alamat.add("Padang, Sumatera Barat");
    
            Nama_Mahasiswa.addFirst("Cynntya");
            No_Bp.addFirst("1822671015");
            Alamat.addFirst("Lubuk Linggau, Sumatera Selatan");
    
            Nama_Mahasiswa.addLast("Kim So Hyun");
            No_Bp.addLast("1544332211");
            Alamat.addLast("Seoul, South Korea");
    
            Nama_Mahasiswa.add("Resa Triani");
            No_Bp.add("2110342031");
            Alamat.add("Padang, Sumatera Barat");
    
            System.out.println("======================PENAMBAHAN DATA MAHASISWA==============================");
            System.out.println("Nama \t:" +Nama_Mahasiswa);
            System.out.println("NIM \t:" +No_Bp);
            System.out.println("Alamat \t:" +Alamat);
            System.out.println("");
    
            //menggunakan fungsi set()
    
            Nama_Mahasiswa.set(0, "Rizky Raditya Maulana");
            No_Bp.set(2, "3011234322");
            Alamat.set(2,"IND");
    
            Nama_Mahasiswa.set(2, "Faulanda Sanaya");
            No_Bp.set(3, "1944551011");
            Alamat.set(3,"Medan, Sumatera Selatan");
    
            System.out.println("=========================MENYISIPKAN DATA MAHASISWA======================");
            System.out.println("Nama \t:" +Nama_Mahasiswa);
            System.out.println("NIM \t:" +No_Bp);
            System.out.println("Alamat \t:" +Alamat);
            System.out.println("");
    
            //Fungsi remove()
    
            Nama_Mahasiswa.remove(0);
            No_Bp.remove(1);
            Alamat.remove(2);
    
            System.out.println("============================MENGHAPUS DATA MAHASISWA====================");
            System.out.println("Nama \t:" +Nama_Mahasiswa);
            System.out.println("NIM \t:" +No_Bp);
            System.out.println("Alamat \t:" +Alamat);
            System.out.println("");
    
            //Fungsi pop()
    
            Nama_Mahasiswa.pop();
            No_Bp.pop();
            Alamat.pop();
            System.out.println("==================Data yang tersisa setelah fungsi POP====================");
            System.out.println("Data nama setelah ditambahkan \t       : "+Nama_Mahasiswa);
            System.out.println("Data NIM setelah ditambahkan \t        : "+No_Bp);
            System.out.println("Data Alamat setelah ditambahkan\t      : "+Alamat);
            System.out.println("");
    
            //Fungsi push()
    
            Nama_Mahasiswa.push("Oh Se Hun");
            No_Bp.push("221521698");
            Alamat.push("Seoul, South Korea");
            System.out.println("====================Data setelah fungsi PUSH=============================");
            System.out.println("Data nama setelah ditambahkan \t        : "+Nama_Mahasiswa);
            System.out.println("Data NIM setelah ditambahkan \t         : "+No_Bp);
            System.out.println("Data Alamat setelah ditambahkan\t       : "+Alamat);
            System.out.println("");
    
            //Fungsi isEmpty()
    
            System.out.println("============================Pengecekan data=============================");
            System.out.println("Apakah data nama kosong? "+Nama_Mahasiswa.isEmpty());
    
            No_Bp.clear();
            System.out.println("Apakah data NIM kosong? "+No_Bp.isEmpty());
    
            System.out.println("Apakah data alamat? "+Alamat.isEmpty());
            System.out.println("");
    
            //Fungsi indexOf()
    
            System.out.println("==========================INDEX OF===================================="); 
            System.out.println("fungsi index of pada NAMA\t:"+Nama_Mahasiswa.indexOf("Peter"));
            System.out.println("fungsi index of pada NIM\t:"+No_Bp.indexOf("2111521022"));
            System.out.println("fungsi index of oada ALAMAT\t:"+Alamat.indexOf("Aceh"));
            System.out.println("");
    
            //Fungsi get()
    
            System.out.println("===========================GET========================================"); 
            System.out.println("fungsi get NAMA\t        :"+Nama_Mahasiswa.get(0));
            System.out.println("fungsi get ALAMAT\t      :"+Alamat.get(0));
            System.out.println("fungsi get NIM\t         :"+No_Bp.get(5));
    
        }
        
    } 
