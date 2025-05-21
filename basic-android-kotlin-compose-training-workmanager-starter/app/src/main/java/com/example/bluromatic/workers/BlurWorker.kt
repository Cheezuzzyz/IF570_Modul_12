import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import android.content.Context
import com.example.bluromatic.R
import com.example.bluromatic.DELAY_TIME_MILLIS
import kotlinx.coroutines.delay

private const val TAG = "BlurWorker"

    class BlurWorker(ctx: Context, params: WorkerParameters) : CoroutineWorker(ctx, params) {
}

override suspend fun doWork(): Result {

    makeStatusNotification(
        applicationContext.resources.getString(R.string.blurring_image),
        applicationContext
    )

    return try {
        val picture = BitmapFactory.decodeResource(
            applicationContext.resources,
            R.drawable.android_cupcake
        )

        Result.success()

        val picture = BitmapFactory.decodeResource(
            applicationContext.resources,
            R.drawable.android_cupcake
        )

        val output = blurBitmap(picture, 1)

        Result.success()