package com.theblackthorn.swoosh.Controller


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.theblackthorn.swoosh.R
import com.theblackthorn.swoosh.Utilities.EXTRA_LEAGUE
import com.theblackthorn.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    var league = ""
    var skil = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Looking for $league $skill league near you..."

    }
}
