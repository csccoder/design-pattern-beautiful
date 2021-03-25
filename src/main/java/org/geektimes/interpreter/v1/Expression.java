package org.geektimes.interpreter.v1;

import java.util.Map;

public interface Expression {

    boolean interpret(Map<String, Long> params);
}
