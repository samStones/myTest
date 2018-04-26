package application.benz.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.dao.UserDao;
import application.dao.impl.UserImpl;
import application.pojo.User;

@RestController
@RequestMapping("/user")
public class UserController {

	private String id = "100000";
	private UserDao dao = new UserImpl();

	@Autowired
	private MongoTemplate mongoTemplate;

	@GetMapping("/find")
	public User findUserById() {
		Query query = new Query(Criteria.where("_id").is(id));
		User user = new User();
		System.out.println("++++++++++++++++++++++++++"+user+"++++++++++++++++++++++++++++++");
		user = mongoTemplate.findOne(query, User.class);
		return user;
	}

	@RequestMapping("find2")

	public List<User> find2() {

		return mongoTemplate.findAll(User.class);

	}

}
