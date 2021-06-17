package com.hexagonal.domain.ports.primary;

public interface ProcessIncomingEventsPrimaryPort {

    void process(String message);
}
