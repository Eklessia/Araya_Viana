package com.desafiolatam.imchile_prueba_araya_viana.presentation

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.core.content.ContextCompat.startActivity
import com.desafiolatam.imchile_prueba_araya_viana.R

class SplashFragment {

    private var mDelayHandler: Handler? = null
    private val SPLASH_DELAY: Long = 3000 //3 seconds

    internal val mRunnable: Runnable = Runnable {
        if (!isFinishing) {

            val intent = Intent(applicationContext, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Inicializa the Handler
        mDelayHandler = Handler()

        //Navega con delay
        mDelayHandler!!.postDelayed(mRunnable, SPLASH_DELAY)

    }

    public override fun onDestroy() {

        if (mDelayHandler != null) {
            mDelayHandler!!.removeCallbacks(mRunnable)
        }

        super.onDestroy()
    }

}