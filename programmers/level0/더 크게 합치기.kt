import kotlin.math.max

class Solution {
    fun solution(a: Int, b: Int): Int = max("$a$b".toInt(), "$b$a".toInt())
}