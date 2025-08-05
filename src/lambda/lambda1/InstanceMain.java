package lambda.lambda1;

import lambda.Procedure;

public class InstanceMain {
    public static void main(String[] args) {

        Procedure procedure1 = new Procedure() {
            @Override
            public void run() {
                System.out.println("hello! lambda...");
            }
        };

        System.out.println("class.class: " + procedure1.getClass());
        System.out.println("class.instance: " + procedure1);

        Procedure procedure2 = () -> {
            System.out.println("hello! lambda...");
        };

        System.out.println("lambda.class: " + procedure2.getClass());
        System.out.println("lambda.instance: " + procedure2);
    }
}

/*
class.class: class lambda.lambda1.InstanceMain$1
class.instance: lambda.lambda1.InstanceMain$1@30f39991
lambda.class: class lambda.lambda1.InstanceMain$$Lambda/0x0000040001003618
lambda.instance: lambda.lambda1.InstanceMain$$Lambda/0x0000040001003618@4a574795
*/