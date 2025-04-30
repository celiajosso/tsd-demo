package org.example.tsddemo;

import java.util.Collection;

public class UserFilter {

    //TODO - Task 2 - Finish the below method
    Collection<User> filter(Collection<User> users) {
        return users.stream()
                .filter(user -> !user.getName().matches("^A.*"))
                .filter(email -> email.getEmail().matches("^[\\w-\\.]+@[\\w-]+\\.[a-z]{2,4}$"))
                .filter(phone -> phone.getPhone().matches("^\\+48[0-9]{9}$"))
                .toList();
    }
}
