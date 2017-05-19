public static void main(String[] args) {
    String input = "y   =   -2 +    3";
    char space = ' ';

    Scanner scan = new Scanner(System.in);
    input = scan.nextLine();
    System.out.println(input);

    for (int i = 0; i < input.length(); i++) { // search from right to left char by char
        if (input.charAt(i)!= space) { // if the char is not space print it.
            System.out.print(input.charAt(i));
        }
    }
}
