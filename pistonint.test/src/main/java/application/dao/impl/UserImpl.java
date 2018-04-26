package application.dao.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import application.dao.UserDao;
import application.pojo.User;

@Component
public class UserImpl implements UserDao{

	@Autowired
    private MongoOperations mongoTemplate;
	
	@Override
	public User findUserById(String id) {
		Query query=new Query(Criteria.where("_id").is(id));
        return mongoTemplate.findOne(query , User.class);
	}

}
