package eu.tutorials.counterapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf

class CounterRepository {
    private var count = mutableIntStateOf(0)

    fun getCount(): MutableState<Int> = count

    fun incrementCount() {
        count.value++
    }

    fun decrementCount() {
        count.value--
    }
}