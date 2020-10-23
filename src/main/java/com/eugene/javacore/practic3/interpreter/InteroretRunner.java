package com.eugene.javacore.practic3.interpreter;

public class InteroretRunner {
    public static void main(String[] args) {
 Expression isWordFinder1 = getWordOr();
 Expression isWordFinder2 = getWordAnd();
 System.out.println("The sentence 'is is the most interesting offer in the world 'contains the words: "+ isWordFinder1.interpret("This is the most interesting offer in the world"));
        System.out.println("The sentence 'is is the most interesting offer in the world 'contains the words: "+ isWordFinder2.interpret("This is the most interesting offer in the world"));
    }

    public static Expression getWordOr(){
        Expression word1 =new TerminalExpression("offer");
        Expression word2 = new TerminalExpression("world");
        return new OrExpression(word1,word2);
    }
    public static Expression getWordAnd (){
Expression word1 = new TerminalExpression("offer");
Expression word2 = new TerminalExpression("nana");
return  new AndExpression(word1,word2);
    }
}
