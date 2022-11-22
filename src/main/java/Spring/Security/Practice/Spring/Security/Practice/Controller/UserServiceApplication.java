package Spring.Security.Practice.Spring.Security.Practice.Controller;

import Spring.Security.Practice.Spring.Security.Practice.Domain.AppUser;
import Spring.Security.Practice.Spring.Security.Practice.Domain.Role;
import Spring.Security.Practice.Spring.Security.Practice.Repo.AppUserRepo;
import Spring.Security.Practice.Spring.Security.Practice.Repo.RoleRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service @Transactional @Slf4j
public class UserServiceApplication implements UserService {

    //Repos
    private final AppUserRepo appUserRepo;
    private final RoleRepo roleRepo;

    public UserServiceApplication(AppUserRepo appUserRepo, RoleRepo roleRepo) {
        this.appUserRepo = appUserRepo;
        this.roleRepo = roleRepo;
    }

    //Don't need constructor because  @RequiredArgsConstructor


    @Override
    public AppUser saveUser(AppUser user) {
     return appUserRepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        return null;
    }

    @Override
    public void addRoleToUser(String username, String roleName) {

    }

    @Override
    public AppUserRepo getUser(String username) {
        return null;
    }

    @Override
    public List<AppUserRepo> getUsers() {
        return null;
    }
}
