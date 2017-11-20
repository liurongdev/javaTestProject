package org.cn.vo;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class MongoFindDemo {
	public static void main(String[] ags){
		MongoClientURI url=new MongoClientURI("mongodb://admin:admin@localhost:27017/mldn");
		MongoClient client=new MongoClient(url);
		MongoDatabase db=client.getDatabase("mldn");
		BasicDBObject object=new BasicDBObject();
		object.put("age", new BasicDBObject("$gte",24).append("$lte", 26));
		MongoCollection<Document> emp=db.getCollection("teacher");
		
		MongoCursor<Document> cursor=emp.find(object).iterator();
		while(cursor.hasNext()){
			Document info=cursor.next();
			System.out.println(info.get("name")+" "+info.get("age"));
		}
		client.close();
	}
}
