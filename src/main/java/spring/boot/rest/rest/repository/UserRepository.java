package spring.boot.rest.rest.repository;

import org.springframework.stereotype.Repository;
import spring.boot.rest.rest.service.Authorities;
import spring.boot.rest.rest.user.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {
    private ConcurrentHashMap<String, String> listAccaunt = new ConcurrentHashMap<>();

    public UserRepository() {
        listAccaunt.put("Drims", "12345678");
    }

    public List<Authorities> getUserAuthorities(User user) {
        if (listAccaunt.containsKey(user.getUser()) && listAccaunt.get(user.getUser()).contains(user.getPassword())) {
            return Arrays.asList(Authorities.values());
        } else {
            return new ArrayList<>(0);
        }
    }
}