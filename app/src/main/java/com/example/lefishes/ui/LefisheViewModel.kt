package com.example.lefishes.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lefishes.network.Lefishe
import com.example.lefishes.network.LefisheApi
import kotlinx.coroutines.launch

enum class LefisheApiStatus {LOADING, ERROR, DONE}

class LefisheViewModel : ViewModel() {

    private val _status = MutableLiveData<LefisheApiStatus>()
    val status: LiveData<LefisheApiStatus> = _status

    private val _lefishes = MutableLiveData<List<Lefishe>>()
    val lefishes: LiveData<List<Lefishe>> = _lefishes

    private val _lefishe = MutableLiveData<Lefishe>()
    val lefishe: LiveData<Lefishe> = _lefishe

    fun getLefisheList() {
        viewModelScope.launch {
            _status.value = LefisheApiStatus.LOADING
            try {
                _lefishes.value = LefisheApi.retrofitService.getLefishes()
                _status.value = LefisheApiStatus.DONE
            } catch (e: Exception) {
                _status.value = LefisheApiStatus.ERROR
                _lefishes.value = listOf()
                Log.i("Pesan Error :", "${e.message}")
            }
        }
    }

    fun onLefisheClicked(lefishe: Lefishe) {
        _lefishe.value = lefishe
    }
}
