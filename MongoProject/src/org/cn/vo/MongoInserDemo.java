package org.cn.vo;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

public class MongoInserDemo {
	public static void main(String[] ags){
		MongoClientURI url=new MongoClientURI("mongodb://admin:admin@localhost:27017/mldn");
		MongoClient client=new MongoClient(url);
		MongoDatabase db=client.getDatabase("mldn");
		MongoIterable<String> collectionNames=db.listCollectionNames();
		MongoCursor<String> cursor=collectionNames.iterator();
		while(cursor.hasNext()){
			System.out.println(cursor.next());
		}
		
		System.out.println("client close()");
		
		
		MongoCollection<Document> emp=db.getCollection("teacher");
		Document info=new Document("name","xixi");
		info.append("age", 23).append("address", "¹ãÖÝ").append("favorate", "³ª¸è");
		emp.insertOne(info);
		
		client.close();
	}
}
