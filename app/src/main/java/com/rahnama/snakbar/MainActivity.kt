package com.rahnama.snakbar

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.rahnama.snakbar.databinding.ActivityMainBinding
import android.view.View
private  lateinit var binding:ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        /*************************************/
        /*
        سه مقدار
         LENGTH_LONG (نمایش طولانی مدت)،
         LENGTH_SHORT (نمایش کوتاه مدت) و
          LENGTH_INDEFINITE .
         استفاده از مقدار LENGTH_INDEFINITE باعث می شود تا زمانی که کاربر اقدام به بستن Snackbar نکند
        (مانند کشیدن به سمت راست یا تایید اکشن موجود در اسنک بار) پیغام روی صفحه باقی بماند.
         */
        val snkbr: Snackbar = Snackbar.make(
            binding.crdLayout,
            "Sample Snackbar Message",
            Snackbar.LENGTH_INDEFINITE
        )
        snkbr.setAction("OK") {
            snkbr.dismiss()
        } //بعد از کلیک روی اکشن چه عملیاتی رخ دهد
        snkbr.setActionTextColor(Color.RED) //تعیین رنگ دکمه عملیات
       // snkbr.setActionTextColor(resources.getColor(R.color.design_default_color_error))

        snkbr.show()

    }
    /*************************************/
}