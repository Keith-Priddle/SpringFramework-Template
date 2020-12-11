package com.mct.config;

import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

//@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration{

	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return "Test";
	}
	
/*	
	@Override
    public MongoClient mongoClient() {
        ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017/test");
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
        
        return MongoClient.create(mongoClientSettings);
    }
 
    @Override
    public Collection getMappingBasePackages() {
        return Collections.singleton("com.baeldung");
    }
*/
}
