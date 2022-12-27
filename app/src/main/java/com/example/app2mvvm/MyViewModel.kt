package com.example.app2mvvm

import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    private var _badge: Int = 5
    val badge: Int
        get() = _badge

    fun updateBadge(count: Int) {
        _badge = count
    }
}
