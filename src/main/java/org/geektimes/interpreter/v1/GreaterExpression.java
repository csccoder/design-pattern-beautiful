package org.geektimes.interpreter.v1;

import java.util.Map;

/**
 * 大于符号表达式
 */
public class GreaterExpression implements Expression {

    private String key;

    private long value;

    public GreaterExpression(String strExpression) {
        String[] elements = strExpression.trim().split("\\s+");
        if (elements.length != 3 || !elements[1].trim().equals(">")) {
            throw new RuntimeException("Expression is invalid: " + strExpression);
        }
        this.key = elements[0].trim();
        this.value = Long.parseLong(elements[2].trim());
    }

    @Override
    public boolean interpret(Map<String, Long> params) {
        if (!params.containsKey(key)) {
            return false;
        }
        long statValue = params.get(key);
        return statValue > value;
    }
}
