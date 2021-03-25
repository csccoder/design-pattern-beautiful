package org.geektimes.interpreter.v1;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用解释器模式实现告警系统中告警规则的解析
 * <p>
 * 例如：api_error_per_minute > 100 || api_count_per_minute > 10000
 * 我们们假设自定义的告警规则只包含“||、&&、>、<、==”这五个运算符，
 * 其中，“>、<、==”运算符的优先级高于“||、&&”运算符，“&&”运算符优先级高于“||”。
 * 在表达式中，任意元素之间需要通过空格来分隔。
 * 除此之外，用户可以自定义要监控的 key，比如前面的 api_error_per_minute、api_count_per_minute。
 */
public class V1Bootstrap {

    public static void main(String[] args) {
        String rule = "key1 > 100 && key2 < 30 || key3 < 100 || key4 == 88";
        AlertRuleInterpreter interpreter = new AlertRuleInterpreter(rule);
        Map stats = new HashMap<>();
        stats.put("key1", 101l);
        stats.put("key3", 121l);
        stats.put("key4", 88l);
        boolean alert = interpreter.interpret(stats);
        System.out.println(alert);
    }
}
