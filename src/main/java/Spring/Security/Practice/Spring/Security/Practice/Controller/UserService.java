package Spring.Security.Practice.Spring.Security.Practice.Controller;

import Spring.Security.Practice.Spring.Security.Practice.Domain.AppUser;
import Spring.Security.Practice.Spring.Security.Practice.Repo.AppUserRepo;
import Spring.Security.Practice.Spring.Security.Practice.Domain.Role;

import java.util.List;

public interface UserService {

    AppUser saveUser(AppUser user);


    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    AppUserRepo getUser(String username);
    List<AppUserRepo> getUsers(); //Return Only Page To User

}
