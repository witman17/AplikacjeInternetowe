package pl.edu.wat.student.database;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import pl.edu.wat.student.model.db.Restaurant;

import java.util.List;

/**
 * Created by Witold on 2016-01-07.
 */
public class RestaurantService {

    public static void save(Restaurant restaurant) {
        DBService.getMongoOperations().save(restaurant);
    }

    public static Restaurant findOneByName(String name) {
        Query query = new Query(Criteria.where("name").is(name));
        return DBService.getMongoOperations().findOne(query, Restaurant.class);
    }

    public static List<Restaurant> findAllByCity(String city) {
        Query query = new Query(Criteria.where("address.city").is(city));
        return DBService.getMongoOperations().find(query, Restaurant.class);
    }

    public static Restaurant findOne(String id) {
        Query query = new Query(Criteria.where("_id").is(id));
        return DBService.getMongoOperations().findOne(query, Restaurant.class);
    }
}
