package org.cn.vo;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
public class MongoRemoveDemo {
	public static void main(String[] ags){
		MongoClientURI url=new MongoClientURI("mongodb://admin:admin@localhost:27017/mldn");
		MongoClient client=new MongoClient(url);
		MongoDatabase db=client.getDatabase("mldn");
		MongoCollection<Document> emp=db.getCollection("teacher");
		BasicDBObject object=new BasicDBObject();
		object.append("name","ÕÅÈý4");
		DeleteResult result=emp.deleteOne(object);
		System.out.println("matchResult:"+result.getDeletedCount());
		client.close();
		
		
		
	}
}
