package Spring.Security.Practice.Spring.Security.Practice.Controller;

import Spring.Security.Practice.Spring.Security.Practice.Repo.AppUserRepo;
import Spring.Security.Practice.Spring.Security.Practice.domain.Role;

import java.util.List;

public interface UserService {

    AppUserRepo saveUser(AppUserRepo user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    AppUserRepo getUser(String username);
    List<AppUserRepo> getUsers(); //Return Only Page To User

}
