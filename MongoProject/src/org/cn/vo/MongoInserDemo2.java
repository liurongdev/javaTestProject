package org.cn.vo;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoInserDemo2 {
	public static void main(String[] ags){
		MongoClientURI url=new MongoClientURI("mongodb://admin:admin@localhost:27017/mldn");
		MongoClient client=new MongoClient(url);
		MongoDatabase db=client.getDatabase("mldn");
		MongoCollection<Document> emp=db.getCollection("teacher");
		/**
		 * insertOne document
		 * 	Document info=new Document("name","xixi");
			info.append("age", 23).append("address", "����").append("favorate", "����");
			emp.insertOne(info); 
		 */
		List<Document>list=new ArrayList<Document>();
		for(int i=0;i<5;i++){
			Document info=new Document("name","����"+i);
			info.append("age", 24+i).append("address", "��ɳ-"+i).append("favorate", "����-"+i);
			list.add(info);
		}
		emp.insertMany(list);
		System.out.println("insertMany to teacher success");
		client.close();
	}
}
