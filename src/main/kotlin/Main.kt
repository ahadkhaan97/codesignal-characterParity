fun main() {
    print(solution('5'))
}

fun solution(symbol: Char): String {
    if (symbol.isDigit()) {
        if (symbol.digitToInt() % 2 ==0)
            return "even"
        return "odd"
    }
    return "not a digit"
}
