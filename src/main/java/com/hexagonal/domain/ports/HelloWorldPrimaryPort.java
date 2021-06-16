package com.hexagonal.domain.ports;

import java.util.Optional;

public interface HelloWorldPrimaryPort {

    Optional<String> helloWorld(String language);
}
