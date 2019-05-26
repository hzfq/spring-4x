package hzfq.spring.spel;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * 方法解析：支持Java可访问的方法，包括对象方法、静态方法、可变方法参数，String类型的所有可访问方法
 * 
 * @author huzhifengqing
 * @email huzhifengqing@qq.com
 * @data 2019年5月26日
 */
public class MethodExprSample {

    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        String substring = parser.parseExpression("'Spring SpEL'.substring(7)").getValue(String.class);
        Integer index = parser.parseExpression("'Spring SpEL'.indexOf('SpEL')").getValue(Integer.class);
        System.out.println(substring);
        System.out.println(index);
    }
}
