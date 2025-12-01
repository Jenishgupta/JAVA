class ExampleNSV {

    int x = m1();        // NSV with method call
    int y = 30;          // NSV
    int z = 40;          // NSV

    int m1() {
        System.out.println("m1 : x");
        return 10;
    }

    { 
        System.out.println("NSB1");   // First instance block
    }

    ExampleNSV() {
        System.out.println("NPC");    // No-parameter constructor
    }

    ExampleNSV(String s) {
        System.out.println("SPC");    // String constructor
    }

    { 
        System.out.println("NSB2");   // Second instance block
    }
}
