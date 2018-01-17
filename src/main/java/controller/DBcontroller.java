package controller;

import com.mongodb.*;
import io.github.caio.grpc.ShowAllResponse;
import io.grpc.stub.StreamObserver;

import java.util.Set;

public class DBcontroller {
    private MongoClient mongoClient;
    private DB db;
    private DBCollection table;

    public DBcontroller(){
        mongoClient = new MongoClient( "localhost" , 27017 );
        db = mongoClient.getDB("articles");
        table=db.getCollection("art");
    }

    public void DBSave(String topic){
        BasicDBObject document = new BasicDBObject();
        document.put("topic", topic);
        table.insert(document);
    }

    public void BDShow(StreamObserver<ShowAllResponse> responseObserver){
        DBCursor cursor = table.find();

        while(cursor.hasNext()) {
            ShowAllResponse response =  ShowAllResponse.newBuilder().setMessage(cursor.next().get("topic").toString()).build();
            responseObserver.onNext(response);
        }

        responseObserver.onCompleted();
    }
}
