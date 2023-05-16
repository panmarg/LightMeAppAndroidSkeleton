package com.example.lightmeappandroid.modules

import android.app.Application
import android.content.Context
import com.example.lightmeappandroid.repositories.MqttRepository
import com.example.lightmeappandroid.repositories.MqttRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import org.eclipse.paho.client.mqttv3.MqttClient
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideContext(application: Application): Context {
        return application.applicationContext
    }

    @Provides
    @Singleton
    fun provideMqttClient(): MqttClient {
         val brokerUrl = "ssl://broker.hivemq.com:8883"
         val clientId = MqttClient.generateClientId()
//        val brokerUrl = "tcp://test.mosquitto.org:1883"
//        val clientId = "LightMeAppClientId"

        return MqttClient(brokerUrl, clientId, MemoryPersistence())
    }

    @Provides
    @Singleton
    fun provideMqttRepository(mqttClient: MqttClient): MqttRepository {
        return MqttRepositoryImpl(mqttClient)
    }
}
