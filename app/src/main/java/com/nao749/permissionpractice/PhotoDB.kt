package com.nao749.permissionpractice

import io.realm.RealmObject

open class PhotoDB:RealmObject() {


    var stringContentUrl : String = ""

    //撮影日時
    var dateTime : String = ""

    //緯度
    var latitude : Double = 0.0

    //経度
    var longitude : Double = 0.0

    //地点
    var location : String = ""

    //コメント
    var comment : String = ""

}