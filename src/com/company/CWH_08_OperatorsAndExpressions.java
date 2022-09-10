package com.company;

public class CWH_08_OperatorsAndExpressions {
    public static void main(String[] args) {
/*       Types of operators in Java
*
*           1. Arithmetic Operators ----> +, -, *, /, %, ++,--
*           2. Assignment Operators ----> =, +=
*           3. Comparison Operators ----> ==, >=, <=
*           4. Logical Operators ----> &&, ||, !
*           5. Bitwise Operators ----> &, |
*/
//        Arithmetic Operators Cannot work with boolean
//        % Operator works with floats and doubles


//      Using Arithmetic and Assignment Operators
        int a = 4;
        int b = 6 % a;
        System.out.println(b);

        int c = 9;
        c += 5;
        System.out.println(c);

//        Comparison operators return a boolean value
        System.out.println(6==6);
        System.out.println(64>6);
        System.out.println(64<6);

//        Logical Operators ----> && = 'and';     ||= 'or';    !='not';
        System.out.println(64>5 && 64>8);
        System.out.println(60<70 || 60<50);

//        Bitwise operators are not very important
    }
}
