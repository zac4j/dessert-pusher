package com.zac4j.dessertpusher

import android.app.Application
import timber.log.Timber

/**
 * Created by zac on 2018/12/2
 * Email:zac_ju@163.com
 * Description:
 */

class PusherApp : Application() {
  override fun onCreate() {
    super.onCreate()

    Timber.plant(Timber.DebugTree())
  }
}