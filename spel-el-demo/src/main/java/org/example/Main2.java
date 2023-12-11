package org.example;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main2 {

    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        System.out.println(parser.parseExpression("'Hello World'.toUpperCase()").getValue());
        System.out.println(parser.parseExpression("'2+5='.concat(2+5)").getValue());
        System.out.println((int[])parser.parseExpression("new int[]{1,2,3,4,5}").getValue());
    }
}
