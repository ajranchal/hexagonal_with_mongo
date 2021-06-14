package com.hexagonal.initialha.domain.ports;

import java.util.List;

public interface StoredHelloWorldSecondaryPort {

    String getHelloWorldById(String id);
    String getHelloWorldByLanguage(String language);
    List<String> getAll();
}
