package au.edu.jcu.cp3406_cp5307_utilityappstartertemplate

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class CurrencyViewModel : ViewModel() {
    var result by mutableStateOf("")
        private set

    fun updateResult(newResult: String) {
        result = newResult
    }
}