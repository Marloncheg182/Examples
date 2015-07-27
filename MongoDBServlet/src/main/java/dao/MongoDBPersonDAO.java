package dao;

import com.mongodb.*;
import converter.PersonConverter;
import model.Person;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dell on 7/27/2015.
 */
public class MongoDBPersonDAO {

    private DBCollection collection;

    public MongoDBPersonDAO(MongoClient mongoClient){
        this.collection = mongoClient.getDatabase("example").getCollection("Persons");
    }
    public Person createPerson(Person p){
        DBObject doc = PersonConverter.toDBObject(p);
        this.collection.insert(doc);
        ObjectId id = (ObjectId)doc.get("_id");
        p.setId(id.toString());
        return p;
    }

    public void updatePerson(Person p){
        DBObject query = BasicDBObjectBuilder.start()
                .append("_id", new ObjectId(p.getId())).get();
        this.collection.update(query, PersonConverter.toDBObject(p));
    }

    public List<Person> readAllPerson(){
        List<Person> data = new ArrayList<>();
        DBCursor cursor = collection.find();
        while (cursor.hasNext()){
            DBObject doc = cursor.next();
            Person p = PersonConverter.toPerson(doc);
            data.add(p);
        }
        return data;
    }

    public void deletePerson(Person p){
        DBObject query = BasicDBObjectBuilder.start()
                .append("_id", new ObjectId(p.getId())).get();
        this.collection.remove(query);
    }
    public Person readPerson(Person p){
        DBObject query = BasicDBObjectBuilder.start()
                .append("_id", new ObjectId(p.getId())).get();
        DBObject data = this.collection.findOne(query);
        return PersonConverter.toPerson(data);
    }
}
