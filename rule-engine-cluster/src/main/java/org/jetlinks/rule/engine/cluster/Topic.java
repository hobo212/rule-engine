package org.jetlinks.rule.engine.cluster;

import java.util.function.Consumer;

public interface Topic<T> {

    void addListener(Consumer<T> consumer);

    void publish(T data);


}
