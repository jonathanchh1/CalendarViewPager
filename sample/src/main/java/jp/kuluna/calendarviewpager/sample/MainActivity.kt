package jp.kuluna.calendarviewpager.sample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import jp.kuluna.calendarviewpager.CalendarPagerAdapter
import jp.kuluna.calendarviewpager.CalendarViewPager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_show_detail).setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }

        // simple setup
        val viewPager = findViewById<CalendarViewPager>(R.id.calendar_view_pager)
        // カレンダーの開始曜日を指定する場合は下記のようにstartingAtを使用してください
        viewPager.adapter = CalendarPagerAdapter(this, startingAt = CalendarPagerAdapter.DayOfWeek.Monday)
    }
}
