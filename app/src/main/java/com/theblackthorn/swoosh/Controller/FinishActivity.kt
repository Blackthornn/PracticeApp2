package com.theblackthorn.swoosh.Controller


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.theblackthorn.swoosh.Model.Player
import com.theblackthorn.swoosh.R
import com.theblackthorn.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    var league = ""
    var skil = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} league near you..."

    }
}
