package com.nao749.permissionpractice

import android.app.Application
import io.realm.Realm

class MyFirstClass:Application() {


    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }

}