package com.example.disabilityhelperapp.helpers

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import java.util.concurrent.TimeUnit

class ReminderWorker(appContext: Context, workerParams: WorkerParameters) :
    CoroutineWorker(appContext, workerParams) {

    override suspend fun doWork(): Result {
        val notificationHelper = NotificationHelper(applicationContext)
        notificationHelper.sendNotification(
            title = "Prosthetic Leg Reminder",
            text = "Time to put on your prosthetic leg and do some exercises."
        )
        return Result.success()
    }

    companion object {
        fun scheduleReminder(context: Context) {
            val workRequest = PeriodicWorkRequestBuilder<ReminderWorker>(12, TimeUnit.HOURS)
                .build()
            WorkManager.getInstance(context).enqueue(workRequest)
        }
    }
}