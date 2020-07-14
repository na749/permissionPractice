package com.nao749.permissionpractice

import android.os.Bundle
import android.view.Display
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_edit.*

class EditActivity : AppCompatActivity() {

    //ここに来るルートのモードを受けとる
    lateinit var mode : ModeInEdit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)
        setSupportActionBar(toolbar)
        toolbar.apply {
            setNavigationIcon(R.drawable.ic_arrow_back_black_24dp)
            setNavigationOnClickListener {
                finish()
            }
        }

        //modeの受け取り
        mode = intent.extras!!.getSerializable(IntentKey.EDIT_MODE.name) as ModeInEdit

    }

    //menuアイテムの表示
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        menu.apply {
            findItem(R.id.menu_comment).isVisible = false //コメント
            findItem(R.id.menu_delete).isVisible = true //削除
            findItem(R.id.menu_edit).isVisible = false //編集
            findItem(R.id.menu_share).isVisible = false //シェア
            findItem(R.id.menu_camera).isVisible = mode == ModeInEdit.SHOOT //MainActivityからならtrue
        }
        return true
    }

    //選択したメニューの処理
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){

            R.id.menu_delete -> {



            }

            else -> super.onOptionsItemSelected(item)
        }

        return true

    }



}
