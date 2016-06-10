package controller;

import static spark.Spark.get;
import static spark.Spark.put;
import static spark.Spark.post;

import objects.DeviceUser;
import services.DeviceUserService;
import spark.Request;
import spark.Response;
import spark.Route;
import utils.JsonUtil;
import utils.ResponseError;

public class DeviceUserController {

	public DeviceUserController(final DeviceUserService userService) {
		// get all users
		get("/users", new Route() {
			@Override
			public Object handle(Request request, Response response) {
				// process request
				return userService.getAllUsers();
			}
		}, JsonUtil.json());

		// Get user by ID
		get("/users/:nickName/:password", (req, res) -> {
			String nick = req.params(":nickName");
			String pass = req.params(":password");
			DeviceUser user = userService.getUser(nick, pass);
			if (user != null) {
				return user;
			}
			res.status(400);
			return new ResponseError("No user " + nick + " found!");
		}, JsonUtil.json());

		// Create user
		post("/users", (req, res) -> userService.createUser(req.queryParams("nickName"), req.queryParams("password")), JsonUtil.json());

		// Update user
		put("/users/:id", (req, res) -> userService.updateUser(req.params(":id"), req.queryParams("nickName"),
				req.queryParams("password")), JsonUtil.json());

		// more routes
	}
}