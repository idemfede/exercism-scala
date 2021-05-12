object ArmstrongNumbers {
    def isArmstrongNumber(num: int) = num.toString().foldLeft(0)((x, y) => x + y.asDigit * y.asDigit) == num
}