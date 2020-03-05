import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{

    private Connection connection;

    public MySQLAdsDao() {
        try{
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    Config.getUrl(),
                    Config.getUsername(),
                    Config.getPassword()
            );
            System.out.println("database connection successful");
        } catch(SQLException ex){
            System.out.println("database connection failed");
        }

    }

    @Override
    public Long insert(Ad ad) {
        String query = String.format(
                "INSERT INTO ads(user_id, title, description) "+
                        "VALUES(%d, '%s', '%s');",
                ad.getUserId(), ad.getTitle(), ad.getDescription()
        );
        try {
            Statement stmt = connection.createStatement();
            long id =  stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            System.out.println("successfully created a new ad");
            return id;
        } catch(SQLException ex) {
            System.out.println("there was an error creating a new ad");
        }
        return null;
    }

    @Override
    public List<Ad> all() {
        String query = "SELECT * FROM ads;";
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            List<Ad> ads = new ArrayList<>();
            while (rs.next()){
                ads.add(new Ad(
                        rs.getLong(1),
                        rs.getLong(2),
                        rs.getString(3),
                        rs.getString(4)));
            }
            return ads;
        } catch(SQLException ex){
            System.out.println("there was an error retrieving ads");
        }
        return null;
    }

    public static void main(String[] args){
        MySQLAdsDao dao = new MySQLAdsDao();
//        Ad newAd = new Ad(1,"test","test description");
//        dao.insert(newAd);
        List<Ad> ads = dao.all();
        for(Ad ad : ads){
            System.out.println(ad.getTitle());
        }
    }

}
