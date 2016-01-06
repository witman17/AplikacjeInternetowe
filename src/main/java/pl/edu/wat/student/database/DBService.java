package pl.edu.wat.student.database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

/**
 * Created by Witold on 2016-01-06.
 */
public class DBService {
    public static MongoOperations getMongoOperations() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
        return (MongoOperations) context.getBean("mongoTemplate");

    }
}
