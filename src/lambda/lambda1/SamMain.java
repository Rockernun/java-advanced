package lambda.lambda1;

public class SamMain {
    public static void main(String[] args) {

        SamInterface sam = () -> {
            System.out.println("SAM");
        };

        sam.run();
    }

//    NotSamInterface notSam = () -> {
//        System.out.println("not sam");
//    };

    /*
    java: incompatible types: lambda.lambda1.NotSamInterface is not a functional interface
    multiple non-overriding abstract methods found in interface lambda.lambda1.NotSamInterface
    */
}

// SAM
