package hzfq.spring.spel;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * 操作符解析：关系、逻辑、算术、正则表达式
 * 
 * @author huzhifengqing
 * @email huzhifengqing@qq.com
 * @data 2019年5月26日
 */
public class OperatorExprSample {

    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        boolean trueValue = parser.parseExpression("2==2").getValue(Boolean.class);
        System.out.println(trueValue);

        boolean falseValue = parser.parseExpression("2<-0.5").getValue(Boolean.class);
        System.out.println(falseValue);

        trueValue = parser.parseExpression("'black'<'block'").getValue(Boolean.class);
        System.out.println(trueValue);

        // instanceof后的类型表达式格式为：T(java类型)
        falseValue = parser.parseExpression("'xyz' instanceof T(int)").getValue(Boolean.class);
        System.out.println(falseValue);

        trueValue = parser.parseExpression("'5.00' matches '^-?\\d+(\\.\\d{2})?$'").getValue(Boolean.class);
        System.out.println(trueValue);

        // matches关键字用于文本的正则匹配运算
        falseValue = parser.parseExpression("'5.0067' matches '\\^-?\\d+(\\.\\d{2})?$'").getValue(Boolean.class);
        System.out.println(falseValue);
    }
}
