import java.util.List;

public interface Ads {
    // insert a new ad and return the new ad's id
    Long insert(Ad ad);
    // get a list of all the ads
    List<Ad> all();
//    List<Ad> allByTitle();
//    List<Ad> getAllByUser(long userId);
//    List<Ad> getAdsByCategory(String category);

//    Ad retrieve(long id);
//    Ad getOne(long id);

//    boolean update(Ad ad);
//    boolean refresh(Ad ad);
//    boolean delete(long id);
}
