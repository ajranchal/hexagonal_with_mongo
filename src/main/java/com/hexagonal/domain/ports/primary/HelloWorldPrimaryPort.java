package com.hexagonal.domain.ports.primary;

import java.util.Optional;

public interface HelloWorldPrimaryPort {

    Optional<String> helloWorld(String language);
}
