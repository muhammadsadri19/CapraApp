package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class koneksi {
    
    private Connection koneksi;
    
    public Connection connect(){
        
        
        String url ="jdbc:mysql://localhost:3306/capra";
        try {
            koneksi = DriverManager.getConnection(url,"root","");
            System.out.println("Berhasil Koneksi Database");
        }   catch (SQLException ex){
            System.out.println("Gagal Koneksi Database "+ex);
        }
        return koneksi;
    }
//    public static void main(String[] args) {
//        MysqlDataSource dataSource = new MysqlDataSource();
//
//        String DB_URL = "jdbc:mysql://localhost:3306/capra";
//        String username = "root";
//        String password = "";
//
//        dataSource.setURL(DB_URL);
//        dataSource.setUser(username);
//        dataSource.setPassword(password);
//
//        try {
//
//            Connection conn = dataSource.getConnection();
//            System.out.println("Koneksi Berhasil!");
//            System.out.println("==================");
//            System.out.println("");
//
//        } catch (SQLException ex) {
//            System.out.println("Koneksi Gagal!" + ex.toString());
//        }
//
//    }
}
