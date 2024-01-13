package spring.boot.rest.rest.repository;

import org.springframework.stereotype.Repository;
import spring.boot.rest.rest.service.Authorities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {
    private ConcurrentHashMap<String, String> listAccaunt = new ConcurrentHashMap<>();

    public UserRepository() {
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        listAccaunt.put("Drims", "1234");
        if (listAccaunt.containsKey(user) && listAccaunt.get(user).contains(password)) {
            return Arrays.asList(Authorities.values());
        } else {
            return new ArrayList<>(0);
        }
    }
}