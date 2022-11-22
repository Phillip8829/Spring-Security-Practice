package Spring.Security.Practice.Spring.Security.Practice.API;

import Spring.Security.Practice.Spring.Security.Practice.Controller.UserService;
import Spring.Security.Practice.Spring.Security.Practice.Model.AppUser;
import Spring.Security.Practice.Spring.Security.Practice.Model.Role;
import Spring.Security.Practice.Spring.Security.Practice.Repo.AppUserRepo;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserResource  {



  private final UserService userService;


    @GetMapping("/users")
    public  List<AppUser> getUsers() {
        return userService.getUsers();
    }
    @PostMapping("/user/save")
    public ResponseEntity<AppUser> saveUser(@RequestBody AppUser user)
    {
        //201 Something Was Created In The Server
//        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user/save").toUriString());
        return ResponseEntity.created(null).body(userService.saveUser(user));
    }

    @PostMapping("/role/save")
    public ResponseEntity<Role> saveRole(@RequestBody Role role)
    {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/role/save").toUriString());
        return ResponseEntity.created(uri).body(userService.saveRole(role));
    }
    @PostMapping("/role/addtouser")
    public ResponseEntity<?> addRoleToUser(@RequestBody RoleToUserForm form)
    {
            userService.addRoleToUser(form.getUsername(), form.getRoleName());
            return new ResponseEntity<>(null, HttpStatus.OK);
    }



}
@Data
class RoleToUserForm {
    private String username;
    private String roleName;
}