package Spring.Security.Practice.Spring.Security.Practice.Controller;

import Spring.Security.Practice.Spring.Security.Practice.Model.AppUser;
import Spring.Security.Practice.Spring.Security.Practice.Model.Role;

import java.util.List;

public interface UserService {

    AppUser saveUser(AppUser user);


    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    AppUser getUser(String username);
    List<AppUser> getUsers(); //Return Only Page To User

}
