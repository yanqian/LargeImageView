package org.wzy.largeimage

import android.graphics.Bitmap
import android.graphics.Rect

/**
 * Created by zeyiwu on 29/08/2017.
 */
data class Cell(@Volatile var bitmap: Bitmap?, var region: Rect, var inSampleSize: Int)