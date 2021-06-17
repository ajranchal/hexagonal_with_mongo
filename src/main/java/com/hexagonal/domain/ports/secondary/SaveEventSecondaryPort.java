package com.hexagonal.domain.ports.secondary;

import com.hexagonal.domain.model.Event;

public interface SaveEventSecondaryPort {

    void save(Event event);

}
