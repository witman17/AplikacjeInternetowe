package pl.edu.wat.student.database;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import pl.edu.wat.student.model.db.User;

/**
 * Created by Witold on 2016-01-04.
 */

public class UserService {

    public static void save(User user) {
        DBService.getMongoOperations().save(user);
    }

    public static User findOne(String email) {
        Query query = new Query(Criteria.where("email").is(email));
        return DBService.getMongoOperations().findOne(query, User.class);
    }


}
