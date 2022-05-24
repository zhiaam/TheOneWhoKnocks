package com.example.whites.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.whites.network.White
import com.example.whites.network.WhiteApi
import kotlinx.coroutines.launch

enum class WhiteApiStatus {LOADING, ERROR, DONE}

class WhiteViewModel : ViewModel() {

    private val _status = MutableLiveData<WhiteApiStatus>()
    val status: LiveData<WhiteApiStatus> = _status

    private val _whites = MutableLiveData<List<White>>()
    val whites: LiveData<List<White>> = _whites

    private val _white = MutableLiveData<White>()
    val white: LiveData<White> = _white

    fun getWhiteList() {
        viewModelScope.launch {
            _status.value = WhiteApiStatus.LOADING
            try {
                _whites.value = WhiteApi.retrofitService.getWhites()
                _status.value = WhiteApiStatus.DONE
            } catch (e: Exception) {
                _status.value = WhiteApiStatus.ERROR
                _whites.value = listOf()
                Log.i("Pesan Error :", "${e.message}")
            }
        }
    }

    fun onWhiteClicked(white: White) {
        _white.value = white
    }
}
