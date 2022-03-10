class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Dz yeu linh");
	System.out.println("Em khong yeu anhhh");
        System.out.println("Hello, World!");
        System.out.println("Dz có yêuuuuu Linh");  
        int firstNumber = add(6, 9);
        int secondNumber = mul(6, 9);
        int finalNumber = add(firstNumber, secondNumber);
	    System.out.println(finalNumber);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

}
