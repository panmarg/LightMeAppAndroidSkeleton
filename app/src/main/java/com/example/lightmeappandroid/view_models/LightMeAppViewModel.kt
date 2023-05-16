package com.example.lightmeappandroid.view_models


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lightmeappandroid.data.DeviceInfo
import com.example.lightmeappandroid.data.LoadingState
import com.example.lightmeappandroid.repositories.MqttRepository
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LightMeAppViewModel @Inject constructor(
    private val mqttRepository: MqttRepository
) : ViewModel() {

}