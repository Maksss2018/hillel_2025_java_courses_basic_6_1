//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in); // Create a Scanner object
    System.out.print("Please add number for loop: ");
    var numberStr = scanner.nextLine();
    var number = 0;
            var templateForLoop =  """
            %d) Num is %d, sum is %d
            """;
    var templateForOutput =  """
            ------------------------
            Sum of numbers is %d
            ------------------------
            """;
            var sum = 0;
    if(!isNumber(numberStr)){
        System.out.print("Please add correct number for loop, like (1,2,3,4,5):");
        main();
    }
    number = Integer.parseInt(numberStr);
    for (int i = 1; i <= number; i++) {
        sum = sum + i;
        System.out.printf(templateForLoop,i,i,sum);
    }
    System.out.printf(templateForOutput,sum);
}
boolean isNumber (String numberStr){
    try {
        Integer.parseInt(numberStr);
        return true;
    } catch (NumberFormatException exception) {
        return false;
    }
}