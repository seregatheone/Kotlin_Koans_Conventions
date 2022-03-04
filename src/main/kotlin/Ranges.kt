data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int = when{
        year != other.year -> year - other.year
        month != other.month -> month - other.month
        else -> dayOfMonth - other.dayOfMonth
    }

}
fun main() {
    fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
        return date in first..last
    }
}
