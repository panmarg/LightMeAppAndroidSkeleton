package com.example.lightmeappandroid.repositories

import com.example.lightmeappandroid.data.LoadingState
import com.example.lightmeappandroid.data.Subscription
import org.eclipse.paho.client.mqttv3.MqttConnectOptions
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken
import org.eclipse.paho.client.mqttv3.MqttCallbackExtended
import org.eclipse.paho.client.mqttv3.MqttMessage
import kotlinx.coroutines.flow.*
import org.eclipse.paho.client.mqttv3.MqttClient
import java.lang.Exception
import javax.inject.Inject


interface MqttRepository {

    fun connect(username: String, password: String): Flow<LoadingState>
    fun subscribe(topic: String): Flow<Subscription>

    fun publish(topic: String, message: String): Flow<LoadingState>

}

class MqttRepositoryImpl @Inject constructor(private val mqttClient: MqttClient) : MqttRepository {
    override fun connect(username: String, password: String): Flow<LoadingState> {
        TODO("Not yet implemented")
    }

    override fun subscribe(topic: String): Flow<Subscription> {
        TODO("Not yet implemented")
    }

    override fun publish(topic: String, message: String): Flow<LoadingState> {
        TODO("Not yet implemented")
    }


}






