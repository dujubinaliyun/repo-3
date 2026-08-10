@RestController
public class UserController{
  @GetMapping("/hello")
  public String hello(){
    System.out.println("UserController#hello()方法执行了");
    return "hello git!";
  }
}
