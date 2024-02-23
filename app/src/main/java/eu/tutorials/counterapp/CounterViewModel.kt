package eu.tutorials.counterapp

import androidx.compose.runtime.MutableState
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private val counterRepository = CounterRepository()

    val count: MutableState<Int> = counterRepository.getCount()

    fun increment() {
        counterRepository.incrementCount()
    }

    fun decrement() {
        counterRepository.decrementCount()
    }
}