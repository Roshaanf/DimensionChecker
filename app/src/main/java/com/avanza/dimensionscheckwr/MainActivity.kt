package com.avanza.dimensionscheckwr

import android.os.Bundle
import android.util.DisplayMetrics
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)

        textView.text =
                "Device height: ${displayMetrics.heightPixels} \nDevice Width: ${displayMetrics.widthPixels}" +
                        " \n \n Density ${displayMetrics.density} " +
                        " \n \n Available Height dp: ${displayMetrics.heightPixels / displayMetrics.density} \nAvailanle Width dp: ${displayMetrics.widthPixels / displayMetrics.density} " +
                        "\n \n " +
                        "Usable Height in dp: ${resources.configuration.screenHeightDp} \nUsable Width in dp: ${resources.configuration.screenWidthDp}"

    }
}
