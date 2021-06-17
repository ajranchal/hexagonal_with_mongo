package com.hexagonal.domain.ports.secondary;

import java.util.List;

public interface HelloWorldRepositorySecondaryPort {

    String getHelloWorldById(String id);
    String getHelloWorldByLanguage(String language);
    List<String> getAll();
}
