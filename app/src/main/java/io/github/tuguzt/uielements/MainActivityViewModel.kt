package io.github.tuguzt.uielements

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityModel : ViewModel() {
    private val _text = MutableLiveData("")
    val text: LiveData<String> get() = _text

    fun setText(text: String) {
        _text.value = text
    }
}
