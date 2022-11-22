package Spring.Security.Practice.Spring.Security.Practice.Controller;

import Spring.Security.Practice.Spring.Security.Practice.Model.AppUser;
import Spring.Security.Practice.Spring.Security.Practice.Model.Role;
import Spring.Security.Practice.Spring.Security.Practice.Repo.AppUserRepo;
import Spring.Security.Practice.Spring.Security.Practice.Repo.RoleRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service @Transactional @Slf4j @RequiredArgsConstructor
public class UserServiceApplication implements UserService {

    //Repos
    private final AppUserRepo appUserRepo;
    private final RoleRepo roleRepo;


    //Don't need constructor because  @RequiredArgsConstructor


    @Override
    public AppUser saveUser(AppUser user) {
        log.info("Saving new user {} to the database", user.getName());
     return appUserRepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Saving new role {} to the database", role.getName());
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        log.info("Adding role {} to user {}", roleName, username);
        AppUser user = appUserRepo.findByUsername(username);
        Role role = roleRepo.findByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public AppUser getUser(String username) {
        log.info("Fetching User {}", username);
        return appUserRepo.findByUsername(username);
    }

    @Override
    public List<AppUser> getUsers() {
        log.info("Fetching All Users");
        return appUserRepo.findAll();
    }
}
