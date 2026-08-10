@RestController
public class UserController{
  @GetMapping("/hello")
  public String hello(){
    return "hello git!";
  }
}
