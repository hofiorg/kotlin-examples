// Example_002: Collections/Streams

fun main() {
  val items = listOf("A", "B", "C")
  items
    .filter { item -> item[0] != 'B' }
    .map { item -> item + "1" }
    .map(::println)
}