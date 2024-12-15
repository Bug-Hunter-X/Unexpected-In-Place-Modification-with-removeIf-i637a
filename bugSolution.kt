fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val newList = list.toMutableList().apply { removeIf { it % 2 == 0 } }
    println(list) // Output: [1, 2, 3, 4, 5] (Original list unchanged)
    println(newList) // Output: [1, 3, 5] (New list with even numbers removed)

    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    val newMap = map.toMutableMap().apply { removeIf { it.key % 2 == 0 } }
    println(map) // Output: {1=a, 2=b, 3=c} (Original map unchanged)
    println(newMap) // Output: {1=a, 3=c} (New map with even keys removed)
} 