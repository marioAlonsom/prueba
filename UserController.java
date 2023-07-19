package prueba;

	@RestController
	public class UserController {

		@GetMapping("/get-token")
		public User login(@RequestParam("username") String username, @RequestParam("password") String pwd) {
			
			"auth-vivelibre-token"
			User user = new User();
			user.setUser(username);
			user.setToken(token);		
			return user;
			
		}
